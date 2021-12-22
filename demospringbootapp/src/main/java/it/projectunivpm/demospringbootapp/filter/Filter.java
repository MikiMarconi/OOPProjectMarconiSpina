package it.projectunivpm.demospringbootapp.filter;
import java.util.Vector;

import it.projectunivpm.demospringbootapp.model.Insight;
import it.projectunivpm.demospringbootapp.model.PageConsumptions.*;
import it.projectunivpm.demospringbootapp.model.PageImpressions.*;
import it.projectunivpm.demospringbootapp.model.PageFanAddsUnique.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageConsumptions.ParsingPageConsumptionsWeekImpl;
import it.projectunivpm.demospringbootapp.service.ParsingPageImpressions.*;
import it.projectunivpm.demospringbootapp.service.ParsingPageFanAddsUnique.*;


public class Filter {


	public static Insight PageFilteredByMetricAndPeriod(Insight i, long initialValue, long finalValue) {
		
		if(i.getValue2() <= finalValue && i.getValue2() >= initialValue) {
		
			return i;
	
		}
		return null;
	}

	public static Vector<Object> PageFilteredByMetric(Insight[] i, long initialValue, long finalValue) {
		
		Vector<Object> filteredInsightMetric = new Vector();
		
		for(int j=0; j<i.length; j++) {
			
			if(i[j].getValue2() <= finalValue && i[j].getValue2() >= initialValue) {
				
				filteredInsightMetric.add(i[j]);		
			}
		}
		if(filteredInsightMetric.isEmpty()) {
			
			return null;	
		}
		
		return filteredInsightMetric;	
	}
}
