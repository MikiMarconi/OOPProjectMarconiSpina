package it.projectunivpm.demospringbootapp.model.PageFanAddsUnique;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento delle Insight Page Consumptions giornaliere nella quale vengono settati titolo 
 * descrizione e periodo
 */

public class InsightPageFanAddsUniqueWeek extends InsightPageFanAddsUnique {

	public InsightPageFanAddsUniqueWeek(long value1, long value2) {
		super("InsightPageFanAddsUnique", "Week Insight Page Fan Adds Unique", "Week", value1, value2);
	}
	
}