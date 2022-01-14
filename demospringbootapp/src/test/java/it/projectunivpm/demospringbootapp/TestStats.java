package it.projectunivpm.demospringbootapp;

import org.junit.jupiter.api.Test;

import it.projectunivpm.demospringbootapp.exceptions.StatisticNotFoundException;
import it.projectunivpm.demospringbootapp.service.ConnectionTotalInsightImpl;
import it.projectunivpm.demospringbootapp.service.Search;
import junit.framework.TestCase;

class TestStats extends TestCase{

	ConnectionTotalInsightImpl Connectionimpl = new ConnectionTotalInsightImpl();

	@Test
	void TestName() throws StatisticNotFoundException {
		Connectionimpl.saveData();
		assertEquals(Search.searchStatsByName("MonthlyAverageImpressions").getName(), "Daily Average Impressions In A Month");
		assertEquals(Search.searchStatsByName("WeeklyAverageImpressions").getName(), "Daily Average Impressions In A Week");
		assertEquals(Search.searchStatsByName("MonthlyAverageConsumptions").getName(), "Daily Average Consumptions In A Month");
		assertEquals(Search.searchStatsByName("WeeklyAverageConsumptions").getName(), "Daily Average Consumptions In A Week");
		assertEquals(Search.searchStatsByName("MonthlyAverageFanAddsUnique").getName(), "Daily Average Fan Adds Unique In A Month");
		assertEquals(Search.searchStatsByName("WeeklyAverageFanAddsUnique").getName(), "Daily Average Fan Adds Unique In A Week");
	}

}
