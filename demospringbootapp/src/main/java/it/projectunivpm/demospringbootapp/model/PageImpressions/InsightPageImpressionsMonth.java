package it.projectunivpm.demospringbootapp.model.PageImpressions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageImpressionsMonth extends InsightPageImpressions {

	public InsightPageImpressionsMonth(long value1, long value2) {
		super("InsightPageImpressions", "Month Insight Page Impressions", "Month", value1, value2);
	}
	
}
