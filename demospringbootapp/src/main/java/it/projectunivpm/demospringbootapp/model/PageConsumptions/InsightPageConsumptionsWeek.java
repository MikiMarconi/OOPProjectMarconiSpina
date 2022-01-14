package it.projectunivpm.demospringbootapp.model.PageConsumptions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageConsumptionsWeek extends InsightPageConsumptions {

	public InsightPageConsumptionsWeek( long value1, long value2) {
		super("InsightPageConsumptions", "Weekly Insight Page Consumptions", "Week", value1, value2);
	}
}
