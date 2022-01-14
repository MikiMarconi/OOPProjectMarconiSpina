package it.projectunivpm.demospringbootapp.model.PageConsumptions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageConsumptionsDay extends InsightPageConsumptions {

	public InsightPageConsumptionsDay(long value1, long value2) {
		super("InsightPageConsumptions", "Day Insight Page Consumptions", "Day", value1, value2);
	}

}
