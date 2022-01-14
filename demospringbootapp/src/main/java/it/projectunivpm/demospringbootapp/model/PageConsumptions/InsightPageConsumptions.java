package it.projectunivpm.demospringbootapp.model.PageConsumptions;

import it.projectunivpm.demospringbootapp.model.*;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento
 */

public class InsightPageConsumptions extends Insight {

	/**
	 * Sottoclasse di Insight che utilizzeremo soltanto per ordinare il progetto
	 */

	public InsightPageConsumptions(String title, String description, String period, long value1, long value2) {
		super(title, description, period, value1 ,value2);
	}
}
