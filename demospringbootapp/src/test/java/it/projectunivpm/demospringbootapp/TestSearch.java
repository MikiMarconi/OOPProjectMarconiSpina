package it.projectunivpm.demospringbootapp;

import org.junit.jupiter.api.Test;

import it.projectunivpm.demospringbootapp.exceptions.MetricOrPeriodNotFoundException;
import it.projectunivpm.demospringbootapp.service.ConnectionTotalInsightImpl;
import it.projectunivpm.demospringbootapp.service.Search;
import junit.framework.TestCase;

class TestSearch extends TestCase{

	ConnectionTotalInsightImpl Connectionimpl = new ConnectionTotalInsightImpl();

	@Test
	public void TestNameAndPeriod() throws MetricOrPeriodNotFoundException{
		Connectionimpl.saveData();
		assertEquals(Search.searchByMetricAndPeriod("InsightPageConsumptions", "Day").getTitle(), "InsightPageConsumptions" );
		assertEquals(Search.searchByMetricAndPeriod("InsightPageConsumptions", "Day").getPeriod(), "Day" );
		assertEquals(Search.searchByMetricAndPeriod("InsightPageFanAddsUnique", "Week").getTitle(), "InsightPageFanAddsUnique" );
		assertEquals(Search.searchByMetricAndPeriod("InsightPageFanAddsUnique", "Week").getPeriod(), "Week" );
		assertEquals(Search.searchByMetricAndPeriod("InsightPageImpressions", "Month").getTitle(), "InsightPageImpressions" );
		assertEquals(Search.searchByMetricAndPeriod("InsightPageImpressions", "Month").getPeriod(), "Month" );
	}


}

