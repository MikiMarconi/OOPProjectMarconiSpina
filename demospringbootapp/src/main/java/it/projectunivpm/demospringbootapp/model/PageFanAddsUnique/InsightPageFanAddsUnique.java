package it.projectunivpm.demospringbootapp.model.PageFanAddsUnique;

import it.projectunivpm.demospringbootapp.model.*;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento
 */

public class InsightPageFanAddsUnique extends Insight{

	/**
	 * Sottoclasse di Insight che utilizzeremo soltanto per ordinare il progetto
	 */

	public InsightPageFanAddsUnique(String title, String description, String period, long value1, long value2) {
		super(title, description, period, value1 ,value2);
	}	

}
