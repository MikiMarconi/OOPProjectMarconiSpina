package it.projectunivpm.demospringbootapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.projectunivpm.demospringbootapp.filter.Filter;
import it.projectunivpm.demospringbootapp.model.Insight;
import it.projectunivpm.demospringbootapp.service.ConnectionTotalInsightImpl;

class TestFilters {
	
	Insight i1;
	ConnectionTotalInsightImpl Connectionimpl = new ConnectionTotalInsightImpl();

	
	@Test
	void testName() {
		Connectionimpl.saveData();
		i1 = new Insight("Insight1", "", "", 10, 20);
		assertEquals(Filter.PageFilteredByMetricAndPeriod(i1, 11, 22).getTitle(), i1.getTitle());
		assertEquals(Filter.PageFilteredByMetricAndPeriod(i1, 3, 7), null);

	}

}
