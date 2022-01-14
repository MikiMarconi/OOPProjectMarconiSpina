package it.projectunivpm.demospringbootapp.model.PageFanAddsUnique;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageFanAddsUniqueMonth extends InsightPageFanAddsUnique{

	public InsightPageFanAddsUniqueMonth( long value1, long value2) {
		super("InsightPageFanAddsUnique", "Month Insight Page Fan Adds Unique", "Month", value1, value2);
	}
	
}
