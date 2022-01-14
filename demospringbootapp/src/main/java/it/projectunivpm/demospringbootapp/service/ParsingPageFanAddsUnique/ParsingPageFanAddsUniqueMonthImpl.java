package it.projectunivpm.demospringbootapp.service.ParsingPageFanAddsUnique;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import it.projectunivpm.demospringbootapp.model.Insight;
import it.projectunivpm.demospringbootapp.service.ConnectionTotalInsightImpl;
import it.projectunivpm.demospringbootapp.model.PageFanAddsUnique.*;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe dedicata al parsing dell'insight Page Fan Adds Unique
 */

public class ParsingPageFanAddsUniqueMonthImpl extends ConnectionTotalInsightImpl {

	private static InsightPageFanAddsUniqueMonth insightPageFanAddsUniqueMonth;

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

			JSONObject obj2 = (JSONObject) array.get(7);
			Insight in = new Insight();
			JSONArray array2 = (JSONArray) obj2.get("values");
			JSONObject obj3 = (JSONObject) array2.get(0);
			in.setValue1((long) obj3.get("value"));
			JSONObject obj4 = (JSONObject) array2.get(1);
			in.setValue2((long) obj4.get("value"));

			insightPageFanAddsUniqueMonth = new InsightPageFanAddsUniqueMonth( in.getValue1(), in.getValue2());


		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}


	}

	public static InsightPageFanAddsUniqueMonth getInsightPageFanAddsUniqueMonth() {
		return insightPageFanAddsUniqueMonth;
	}
}
