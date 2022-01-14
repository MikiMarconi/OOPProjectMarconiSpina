package it.projectunivpm.demospringbootapp.model.PageImpressions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageImpressionsDay extends InsightPageImpressions {

	public InsightPageImpressionsDay(long value1, long value2) {
		super("InsightPageImpressions", "Day Insight Page Impressions", "Day", value1, value2);
	}

}
