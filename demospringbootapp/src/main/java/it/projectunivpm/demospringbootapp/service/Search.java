package it.projectunivpm.demospringbootapp.service;

import it.projectunivpm.demospringbootapp.exceptions.MetricNotFoundException;
import it.projectunivpm.demospringbootapp.exceptions.MetricOrPeriodNotFoundException;
import it.projectunivpm.demospringbootapp.exceptions.StatisticNotFoundException;
import it.projectunivpm.demospringbootapp.model.Insight;
import it.projectunivpm.demospringbootapp.service.ParsingPageConsumptions.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageFanAddsUnique.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageImpressions.*;
import it.projectunivpm.demospringbootapp.stats.*;


public class Search {

	private static Statistics setStats = new Statistics();
	
	public static Insight searchByMetricAndPeriod(String metric,String period) throws MetricOrPeriodNotFoundException {

		if (metric.equalsIgnoreCase(ParsingPageConsumptionsDayImpl.getInsightPageConsumptionsDay().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageConsumptionsDayImpl.getInsightPageConsumptionsDay().getPeriod())) {
				return ParsingPageConsumptionsDayImpl.getInsightPageConsumptionsDay();
			}			
		}
		if (metric.equalsIgnoreCase(ParsingPageConsumptionsWeekImpl.getInsightPageConsumptionsWeek().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageConsumptionsWeekImpl.getInsightPageConsumptionsWeek().getPeriod())) {
				return ParsingPageConsumptionsWeekImpl.getInsightPageConsumptionsWeek();
			}
		}
		if (metric.equalsIgnoreCase(ParsingPageConsumptionsMonthImpl.getInsightPageConsumptionsMonth().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageConsumptionsMonthImpl.getInsightPageConsumptionsMonth().getPeriod())) {
				return ParsingPageConsumptionsMonthImpl.getInsightPageConsumptionsMonth();
			}
		}
		if (metric.equalsIgnoreCase(ParsingPageImpressionDayImpl.getInsightPageImpressionsDay().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageImpressionDayImpl.getInsightPageImpressionsDay().getPeriod())) {
				return ParsingPageImpressionDayImpl.getInsightPageImpressionsDay();
			}
		}
		if (metric.equalsIgnoreCase(ParsingPageImpressionWeekImpl.getInsightPageImpressionsWeek().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageImpressionWeekImpl.getInsightPageImpressionsWeek().getPeriod())) {
				return ParsingPageImpressionWeekImpl.getInsightPageImpressionsWeek();
			}		
		}	
		if (metric.equalsIgnoreCase(ParsingPageImpressionMonthImpl.getInsightPageImpressionsMonth().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageImpressionMonthImpl.getInsightPageImpressionsMonth().getPeriod())) {
				return ParsingPageImpressionMonthImpl.getInsightPageImpressionsMonth();
			}
		}	
		if (metric.equalsIgnoreCase(ParsingPageFanAddsUniqueDayImpl.getInsightPageFanAddsUniqueDay().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageFanAddsUniqueDayImpl.getInsightPageFanAddsUniqueDay().getPeriod())) {
				return ParsingPageFanAddsUniqueDayImpl.getInsightPageFanAddsUniqueDay();
			}
		}
		if (metric.equalsIgnoreCase(ParsingPageFanAddsUniqueWeekImpl.getInsightPageFanAddsUniqueWeek().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageFanAddsUniqueWeekImpl.getInsightPageFanAddsUniqueWeek().getPeriod())) {
				return ParsingPageFanAddsUniqueWeekImpl.getInsightPageFanAddsUniqueWeek();
			}
		}
		if (metric.equalsIgnoreCase(ParsingPageFanAddsUniqueMonthImpl.getInsightPageFanAddsUniqueMonth().getTitle())) {
			if (period.equalsIgnoreCase(ParsingPageFanAddsUniqueMonthImpl.getInsightPageFanAddsUniqueMonth().getPeriod())) {
				return ParsingPageFanAddsUniqueMonthImpl.getInsightPageFanAddsUniqueMonth();
			}
		}
		throw new MetricOrPeriodNotFoundException("Metrica o periodo non valido , le metriche valide sono:\n)InsightPageConsumptions"
				+ "\n)InsightPageImpressions\n)InsightPageFanAddsUnique\n"
				+ "I periodi validi sono:\n)day\n)week\n)month");
	}

	public static Insight[] searchByMetric(String metric) throws MetricNotFoundException {
		if (metric.equalsIgnoreCase("insightPageImpressions")) {
			Insight[] insightPI = new Insight[3];
			insightPI[0] = ParsingPageImpressionDayImpl.getInsightPageImpressionsDay(); 
			insightPI[1] = ParsingPageImpressionWeekImpl.getInsightPageImpressionsWeek();
			insightPI[2] = ParsingPageImpressionMonthImpl.getInsightPageImpressionsMonth();
			return insightPI;
		}
		else if (metric.equalsIgnoreCase("insightPageConsumptions")) {
			Insight[] insightPC = new Insight[3];
			insightPC[0] = ParsingPageConsumptionsDayImpl.getInsightPageConsumptionsDay(); 
			insightPC[1] = ParsingPageConsumptionsWeekImpl.getInsightPageConsumptionsWeek(); 
			insightPC[2] = ParsingPageConsumptionsMonthImpl.getInsightPageConsumptionsMonth();
			return insightPC;
		}
		else if (metric.equalsIgnoreCase("insightPageFanAddsUnique")) {
			Insight[] insightPU = new Insight[3];
			insightPU[0] = ParsingPageFanAddsUniqueDayImpl.getInsightPageFanAddsUniqueDay();
			insightPU[1] = ParsingPageFanAddsUniqueWeekImpl.getInsightPageFanAddsUniqueWeek(); 
			insightPU[2] = ParsingPageFanAddsUniqueMonthImpl.getInsightPageFanAddsUniqueMonth();
			return insightPU;
		}
		throw new MetricNotFoundException("Metrica non trovata , le metriche valide sono:\n)InsightPageConsumptions"
				+ "\n)InsightPageImpressions\n)InsightPageFanAddsUnique");

	}

	public static StatisticsUtil searchStatsByName(String name) throws StatisticNotFoundException {
		if (name.equalsIgnoreCase("MonthlyAverageImpressions")) {
			setStats.MonthlyAverageImpressions();
			return setStats.getStatsU();
		}
		if (name.equalsIgnoreCase("WeeklyAverageImpressions")) {
			setStats.WeeklyAverageImpressions();
			return setStats.getStatsU();
		}
		if (name.equalsIgnoreCase("MonthlyAverageConsumptions")) {
			setStats.MonthlyAverageConsumptions();
			return setStats.getStatsU();
		}
		if (name.equalsIgnoreCase("WeeklyAverageConsumptions")) {
			setStats.WeeklyAverageConsumptions();
			return setStats.getStatsU();
		}
		if (name.equalsIgnoreCase("MonthlyAverageFanAddsUnique")) {
			setStats.MonthlyAverageFanAddsUnique();
			return setStats.getStatsU();
		}
		if (name.equalsIgnoreCase("WeeklyAverageFanAddsUnique")) {
			setStats.WeeklyAverageFanAddsUnique();
			return setStats.getStatsU();
		}
		throw new StatisticNotFoundException("Statistica non valida , le statistiche valide sono:\n)MonthlyAverageImpressions"
				+ "\n)WeeklyAverageImpressions\n)MonthlyAverageConsumptions\n)WeeklyAverageConsumptions"
				+ "\n)MonthlyAverageFanAddsUnique\n)WeeklyAverageFanAddsUnique");
	}
}
