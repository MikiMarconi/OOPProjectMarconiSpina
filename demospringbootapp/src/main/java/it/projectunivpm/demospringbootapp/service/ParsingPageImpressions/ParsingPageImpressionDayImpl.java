package it.projectunivpm.demospringbootapp.service.ParsingPageImpressions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import it.projectunivpm.demospringbootapp.model.Insight;
import it.projectunivpm.demospringbootapp.service.ConnectionTotalInsightImpl;
import it.projectunivpm.demospringbootapp.model.PageImpressions.*;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe dedicata al parsing dell'insight Page Impression
 */

public class ParsingPageImpressionDayImpl extends ConnectionTotalInsightImpl {

	static InsightPageImpressionsDay insightPageImpressionsDay;

	@Override
	public void parseData() {

		/**
		 * Utilizziamo JSON simple per effettuare il parsing dei dati ricevuti
		 */

		JSONParser parser = new JSONParser();

		/**
		 * Apriamo uno stream di input dal file su cui abbiamo salvato i dati
		 */

		FileReader reader;
		try {
			reader = new FileReader("salvadati.txt");

			/**
			 * Attraverso la creazione di JSONobject e JSONArray accediamo all'interno
			 * della struttura annidata del nostro file JSON , utilizzando poi i setter
			 * delle classi del pacchetto model per assegnare i valori ai nostri oggetti
			 */

			Object obj;

			obj = parser.parse(reader);


			JSONObject empjsonobj = (JSONObject) obj ;
			JSONArray array = (JSONArray)empjsonobj.get("data");

			JSONObject obj2 = (JSONObject) array.get(0);
			Insight in = new Insight();
			JSONArray array2 = (JSONArray) obj2.get("values");
			JSONObject obj3 = (JSONObject) array2.get(0);
			in.setValue1((long) obj3.get("value"));
			JSONObject obj4 = (JSONObject) array2.get(1);
			in.setValue2((long) obj4.get("value"));

			insightPageImpressionsDay = new InsightPageImpressionsDay(in.getValue1(), in.getValue2());


			/**
			 * Inserisco i vettori delle insight del giorno, del mese, e della settimana 
			 * dentro un vettore di vettori di Insight tutto cio' per la richiesta generale 
			 * che restituera' tutti i parametri delle insight prese in considerazione per il progetto
			 */

		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}

	}

	public static InsightPageImpressionsDay getInsightPageImpressionsDay() {
		return insightPageImpressionsDay;
	}

}
