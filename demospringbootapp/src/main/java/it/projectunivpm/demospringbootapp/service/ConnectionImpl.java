package it.projectunivpm.demospringbootapp.service;
import it.projectunivpm.demospringbootapp.model.*;

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

public class ConnectionImpl implements ConnectionService{

	//InsightImpl insightImpl = new InsightImpl();
	/*
	 * Stabiliamo una connessione con metodo GET per ottenere i dati dalle api di Facebook
	 */

	public void saveData() {
		String accessToken = "EAAPR8XUrBo8BABdmr1wC1o8qqNhSJNGZBxyJc1ZBWZA2eUqIxgZAPWZBKV1yTu0XE6I9gSa5SWHA0ZCkNeTYj3Ry8IaLxBwyekmqeSUVNzT46kfjjwcZBoHNvl9umhqgoWw8mm8ouG04xC6MlK6XdokRDZBjZClVQCH0EQsLjsbUyZBmZCNT9NMfvZCPbMQeOAQJOMun2skMvGXYMRCvusMRfPiM";
		try {
			URL url = new URL("https://graph.facebook.com/v12.0/121258985205219/insights?metric=page_impressions%2Cpage_consumptions%2Cpage_fan_adds_unique&access_token=" + accessToken);		 
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			//				conn.setRequestMethod("GET");


			/*
			 * Controlliamo che la connessione sia andata a buon fine
			 */

			int responseCode = conn.getResponseCode();

			/*
			 * Se non è 200 , inviamo un'eccezione
			 */

			if (responseCode != 200) {
				throw new RuntimeException("HttpResponseCode:" + responseCode);
			} 
			else {

				/*
				 * Apriamo un flusso di input dal nostro oggetto URL e un flusso di output su file locale
				 */

				Scanner input = new Scanner(url.openStream());
				BufferedWriter writer =
						new BufferedWriter (new FileWriter ("salvadati.txt"));

				/*
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

	}

	/*
	 * Questo metodo converte i dati letti dal file locale(JSON) 
	 * in variabili utilizzabili in java
	 */
	
	public void parseData() {
		
		/*
		 * Utilizziamo JSON simple per effettuare il parsing dei dati ricevuti
		 */
		
		JSONParser parser = new JSONParser();

		/*
		 * Apriamo uno stream di input dal file su cui abbiamo salvato i dati
		 */
		
		FileReader reader;
		try {
			reader = new FileReader("salvadati.txt");

			/*
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
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}

