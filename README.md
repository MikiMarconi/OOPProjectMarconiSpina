# OOPProjectMarconiSpina
## Introduzione
La seguente applicazione springboot (sviluppata con **GRADLE**) ha l'obiettivo di fornire statistiche sulle insights di una pagina Facebook, permettendo di visualizzare quest'ultime nella loro totalità oppure filtrate (per *periodo*, *metrica* o *valore*).
Le metriche scelte sono:
* Impressions --> Il numero di volte in cui un contenuto della tua Pagina o relativo alla tua Pagina è apparso nello schermo di una persona. Sono inclusi i post, le storie, le inserzioni e altri contenuti o informazioni presenti sulla tua Pagina.
* Consumptions --> Il numero di volte in cui le persone hanno cliccato su uno dei tuoi contenuti.
* FanAddsUnique --> Il numero di nuove persone a cui piace la tua Pagina.


L'utente potrà visualizzare i risultati dell'esecuzione del programma avviando lo stesso ed utilizzando l'URL "localhost:8080/" seguito dall'endpoint specificato nelle [rotte](#rotte).
Per utilizzare correttamente il programma :
* 1)E' necessario avere l'[access token relativo ad una pagina Facebook](https://developers.facebook.com/docs/pages/access-tokens/), se non si ha una pagina è possibile utilizzare il nostro token di prova : EAAPR8XUrBo8BAIyoPzfu21ZAR3RZA8oWUY8AekdaEnzpt85jNPiwys8MhRu6fze3HvJGJWMlX4OalsnSustHI2bld84k7Jxbo98gl5wgck9ELaXZByRcyX8FHxcM7f4pMJUyjeVXqfwtwOqewn8V5l4ueDnnzBSnVXTD5GMGgE0hZCZB8taUR
* 2)Nella versione attuale del programma è necessario eseguire per prima la rotta [insight](#insight) (in quanto permette di salvare in locale tutte le informazioni provenienti dall'API di Facebook, in modo tale da non dover ripetere chiamate alle API evitando così anche codice superfluo nelle altre rotte).

## Funzionamento
Tra i file caricati nella repository vi è una cartella [FBProject](FBProject) la quale contiene un breve video esplicativo su tutto il funzionamento del programma e una repository di postman che è possibile importare nel proprio workspace in cui sono contenute tutte le rotte(**corrette**) che è possibile eseguire.
Il funzionamento del programma è riassunto attraverso questo schema concettuale:
![alt text](FBProject/SchemaConcettuale.jpeg)
### Ordinamento
Nella modellazione delle classi del programma è stata utilizzata una struttura piramidale per sfruttare al meglio il concetto di ereditarietà, difatti dalla *super*classe Insight ereditano 3 *sotto*classi specifiche per ogni tipo di insight e da queste ultime ereditano altre 3 classi ciascuna con l'utilità di specificare il periodo.
Creando 3 *sotto*classi di insight ovvero Impression, Consumptions, FanAddsUnique è possibile modellare efficacemente il problema nonostante appesantisca leggermente il programma;ciò permette tuttavia di effettuare aggiornamenti in futuro con estrema semplicità e garantisce un solido ordinamento.

## Javadoc
Per visualizzare il javadoc relativo al progetto è sufficiente scaricare la cartella [javadoc.zip](javadoc.zip) e aprire il file index. 

<a name="rotte"></a>
## Rotte
Le insight visualizzate in formato JSON hanno una struttura standard :
* Nome.
* Descrizione.
* Periodo.
* Valore1 (Relativo a 2 giorni prima rispetto al giorno attuale).
* Valore2 (Relativo a 1 giorno prima rispetto al giorno attuale).

<a name="insight"></a>
### Descrizione
Tipo | Endpoint | Descrizione | Parametri
---- | ---- | ---- | ----
GET | /insight | E' una sorta di comando di avvio del programma , mostra le insight nella loro totalità e salva tutti i dati in un file locale. | Nessuno
GET | /insight/{metric} |  Mostra soltanto la metrica che si sceglie. | InsightPageConsumptions ; InsightPageImpressions ; InsightPageFanAddsUnique ;
GET | /insight/stats/{statistic} | Mostra la media di una precisa metrica all'interno del mese o settimana corrente | MonthlyAverageImpressions, WeeklyAverageImpressions ; MonthlyAverageConsumptions, WeeklyAverageConsumptions ; MonthlyAverageFanAddsUnique, WeeklyAverageFanAddsUnique;
GET | /insight/{metric}/{period} | Mostra una precisa metrica in un determinato periodo | Day ; Week ; Month;
GET | /insight/{metric}/{period}/{initialValue}/{finalValue} | Mostra un precisa metrica filtrata per periodo, valore minimo(initalValue) e valore massimo(finalValue) | N.B. initial e final value sono due interi.
GET | /insight/{metric}/{initialValue}/{finalValue} | Mostra una precisa metrica filtrata in base a due valori (initial e final value). | N.B. initial e final value sono due interi.

## Eccezioni 
Il programma contiene delle eccezioni personalizzate :
* ❌ MetricNotFoundException) : se la metrica inserita non è tra quelle disponibili viene lanciata quest'eccezione, il programma provvederà poi a fornirci una lista di metriche valide e viene stampato il seguente messaggio :  
``` 
Metrica non trovata , le metriche valide sono: )InsightPageConsumptions )InsightPageImpressions )InsightPageFanAddsUnique 
```
* ❌ MetricOrPeriodNotFoundException) : se la metrica o il periodo inseriti non sono tra quelle disponibili viene lanciata quest'eccezione, il programma provvederà poi a fornirci una lista di metriche o periodi validi.
``` 
Metrica o periodo non valido , le metriche valide sono: )InsightPageConsumptions )InsightPageImpressions )InsightPageFanAddsUnique 
I periodi validi sono: )day )week )month
```
* ❌ StatisticNotFoundException) : se la statistica inserita non è tra quelle disponibili viene lanciata quest'eccezione, il programma provvederà poi a fornirci una lista di statistiche valide.
``` 
Statistica non valida , le statistiche valide sono: )MonthlyAverageImpressions )WeeklyAverageImpressions )MonthlyAverageConsumptions )WeeklyAverageConsumptions )MonthlyAverageFanAddsUnique )WeeklyAverageFanAddsUnique
```

## JUnit Test
Nel programma vengono effettuati i seguenti test : 
* ✅ TestFilters) : Testa un metodo che ricerca tra le insights già filtrate per metrica e per periodo quelle che hanno un valore maggiore o uguale dell'initial value e minore o uguale del finale value.  
* ✅ TestSearch) : Testa un metodo che cerca le insight filtrando per nome e per periodo.
* ✅ TestStats) : Testa un metodo che cerca la corretta statistica in base al nome.

### Autori
Progetto realizzato da:
- Marconi Michelangelo (50%)
- Spina Marco (50%)
