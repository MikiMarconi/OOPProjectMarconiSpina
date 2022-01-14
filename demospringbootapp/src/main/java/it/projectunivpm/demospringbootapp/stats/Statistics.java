package it.projectunivpm.demospringbootapp.stats;

import it.projectunivpm.demospringbootapp.service.ParsingPageConsumptions.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageFanAddsUnique.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageImpressions.*;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe che permette di dare una media giornaliera delle insight prese 
 * per mese e per settimana
 */

public class Statistics implements StaticsService {

	StatisticsUtil statsU;
	static final double monthdays = 28;
	static final double weekdays = 7;

	public void MonthlyAverageImpressions() {
		statsU = new StatisticsUtil("Daily Average Impressions In A Month", ParsingPageImpressionMonthImpl.getInsightPageImpressionsMonth().getValue2()/monthdays);
	}

	public void WeeklyAverageImpressions() {
		statsU = new StatisticsUtil("Daily Average Impressions In A Week", ParsingPageImpressionWeekImpl.getInsightPageImpressionsWeek().getValue2()/weekdays);
	}

	public void MonthlyAverageConsumptions() {
		statsU = new StatisticsUtil("Daily Average Consumptions In A Month", ParsingPageConsumptionsMonthImpl.getInsightPageConsumptionsMonth().getValue2()/monthdays);
	}

	public void WeeklyAverageConsumptions() {
		statsU = new StatisticsUtil("Daily Average Consumptions In A Week", ParsingPageConsumptionsWeekImpl.getInsightPageConsumptionsWeek().getValue2()/weekdays);
	}

	public void MonthlyAverageFanAddsUnique() {
		statsU = new StatisticsUtil("Daily Average Fan Adds Unique In A Month", ParsingPageFanAddsUniqueMonthImpl.getInsightPageFanAddsUniqueMonth().getValue2()/monthdays);
	}

	public void WeeklyAverageFanAddsUnique() {
		statsU = new StatisticsUtil("Daily Average Fan Adds Unique In A Week", ParsingPageFanAddsUniqueWeekImpl.getInsightPageFanAddsUniqueWeek().getValue2()/weekdays);
	}

	public StatisticsUtil getStatsU() {
		return statsU;
	}

}
