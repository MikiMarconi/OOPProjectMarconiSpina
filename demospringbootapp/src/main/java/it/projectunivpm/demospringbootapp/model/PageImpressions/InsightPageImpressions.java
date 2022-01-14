package it.projectunivpm.demospringbootapp.model.PageImpressions;

import it.projectunivpm.demospringbootapp.model.*;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento
 */

public class InsightPageImpressions extends Insight {

	/**
	 * Sottoclasse di Insight che utilizzeremo soltanto per ordinare il progetto
	 */

	public InsightPageImpressions(String title, String description, String period, long value1, long value2) {
		super(title, description, period, value1 ,value2);
	}

}
