package it.projectunivpm.demospringbootapp.service;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe utilizzata per la connessione con l'api e per il parsing in un file locale del json
 */

import it.projectunivpm.demospringbootapp.model.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageConsumptions.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageImpressions.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageFanAddsUnique.*;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConnectionTotalInsightImpl implements ConnectionTotalInsightService{

	/**
	 * Stabiliamo una connessione con metodo GET per ottenere i dati dalle api di Facebook
	 */

	public void saveData() {
		String accessToken = "EAAPR8XUrBo8BAOTvFiBtZAZBEdcICnNTMRH51ZBTC14ti1HhratrZBlBaS6c4UGyCu8wIR7sdhr9ZCKK48UqB5sbfdgeleGuXCIZACuKwNEVzwVMa0QZAL1Y3CLBZC0oPZAR0ZAwlIxHUeJGgYmYiv39eP2sdNNBZAHeSOE3kBPLIdniogQdgynMAwmEBYZCHCRn85KF6MhSWGjvcAZDZD";
		try {
			URL url = new URL("https://graph.facebook.com/v12.0/121258985205219/insights?metric=page_impressions%2Cpage_consumptions%2Cpage_fan_adds_unique&access_token=" + accessToken);		 
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();

			/**
			 * Controlliamo che la connessione sia andata a buon fine
			 */

			int responseCode = conn.getResponseCode();

			/**
			 * Se non e' 200 , inviamo un'eccezione
			 */

			if (responseCode != 200) {
				throw new RuntimeException("HttpResponseCode:" + responseCode);
			} 
			else {

				/**
				 * Apriamo un flusso di input dal nostro oggetto URL e un flusso di output su file locale
				 */

				Scanner input = new Scanner(url.openStream());
				BufferedWriter writer =
						new BufferedWriter (new FileWriter ("salvadati.txt"));

				/**
				 * Copiamo tutti i dati provenienti dalle API nel file
				 */

				while (input.hasNext()) {

					writer.write(input.nextLine());
				}
				writer.close();
				input.close();

				conn.disconnect();

			}
		}  catch (IOException e1) {
			e1.printStackTrace();
		}

		parseData();
		ParsingPageConsumptionsDayImpl p1 = new ParsingPageConsumptionsDayImpl();
		p1.parseData();
		ParsingPageConsumptionsWeekImpl p2 = new ParsingPageConsumptionsWeekImpl();
		p2.parseData();
		ParsingPageConsumptionsMonthImpl p3 = new ParsingPageConsumptionsMonthImpl();
		p3.parseData();
		ParsingPageImpressionDayImpl p4 = new ParsingPageImpressionDayImpl();
		p4.parseData();
		ParsingPageImpressionWeekImpl p5 = new ParsingPageImpressionWeekImpl();
		p5.parseData();
		ParsingPageImpressionMonthImpl p6 = new ParsingPageImpressionMonthImpl();
		p6.parseData();
		ParsingPageFanAddsUniqueDayImpl p7 = new ParsingPageFanAddsUniqueDayImpl();
		p7.parseData();
		ParsingPageFanAddsUniqueWeekImpl p8 = new ParsingPageFanAddsUniqueWeekImpl();
		p8.parseData();
		ParsingPageFanAddsUniqueMonthImpl p9 = new ParsingPageFanAddsUniqueMonthImpl();
		p9.parseData();

	}

	/**
	 * Questo metodo converte i dati letti dal file locale(JSON) 
	 * in variabili utilizzabili in java
	 */

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

			for (int i=0;i<array.size();i++) {

				JSONObject obj2 = (JSONObject) array.get(i);
				Insight in = new Insight();
				in.setDescription((String) obj2.get("description"));
				in.setTitle((String) obj2.get("title"));
				in.setPeriod((String) obj2.get("period"));
				JSONArray array2 = (JSONArray) obj2.get("values");
				JSONObject obj3 = (JSONObject) array2.get(0);
				in.setValue1((long) obj3.get("value"));
				JSONObject obj4 = (JSONObject) array2.get(1);
				in.setValue2((long) obj4.get("value"));
				InsightImpl.getInsightImpl().add(in);

			}

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
}

