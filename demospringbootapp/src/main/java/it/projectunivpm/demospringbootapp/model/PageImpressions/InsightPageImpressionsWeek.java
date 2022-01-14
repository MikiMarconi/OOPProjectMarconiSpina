package it.projectunivpm.demospringbootapp.model.PageImpressions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageImpressionsWeek extends InsightPageImpressions {

	public InsightPageImpressionsWeek(long value1, long value2) {
		super("InsightPageImpressions", "Week Insight Page Impressions", "Week", value1, value2);
	}

}
