package it.projectunivpm.demospringbootapp.stats;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Interfaccia della classe Statics
 */

public interface StaticsService {

	public void MonthlyAverageImpressions();
	public void WeeklyAverageImpressions();
	public void MonthlyAverageConsumptions();
	public void WeeklyAverageConsumptions();
	public void MonthlyAverageFanAddsUnique();
	public void WeeklyAverageFanAddsUnique();

}
