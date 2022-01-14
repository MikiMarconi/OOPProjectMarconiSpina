package it.projectunivpm.demospringbootapp.model.PageConsumptions;


/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageConsumptionsMonth extends InsightPageConsumptions {

	public InsightPageConsumptionsMonth(long value1, long value2) {
		super("InsightPageConsumptions", "Month Insight Page Consumptions", "Month", value1, value2);
	}
}
