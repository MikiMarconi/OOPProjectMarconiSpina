package it.projectunivpm.demospringbootapp.filter;
import java.util.Vector;

import it.projectunivpm.demospringbootapp.model.Insight;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe che permette di filtrare e di restituire un insight dato un intervallo
 * di valori specificati nella rotta
 */

public class Filter {

	/**
	 * Metodo che restituisce un insight che rispetta l'intervallo dato altrimenti null, 
	 * viene utilizzato nella rotta di filtraggio solo dopo aver specificato il periodo desiderato
	 */

	public static Insight PageFilteredByMetricAndPeriod(Insight i, long initialValue, long finalValue) {

		if(i.getValue2() <= finalValue && i.getValue2() >= initialValue) {

			return i;

		}
		return null;
	}

	/**
	 * Metodo che restituisce un vettore di insight che rispettano l'intervallo dato altrimenti null, 
	 * viene utilizzato nella rotta di filtraggio anche se non specificato il periodo
	 */

	public static Vector<Object> PageFilteredByMetric(Insight[] i, long initialValue, long finalValue) {

		Vector<Object> filteredInsightMetric = new Vector<Object>();

		for(int j=0; j<i.length; j++) {

			if(i[j].getValue2() <= finalValue && i[j].getValue2() >= initialValue) {

				filteredInsightMetric.add(i[j]);		
			}
		}
		if(filteredInsightMetric.isEmpty()) {

			return null;	
		}

		return filteredInsightMetric;	
	}
}
