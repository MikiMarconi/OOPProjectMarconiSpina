package it.projectunivpm.demospringbootapp.model.PageImpressions;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageImpressionsWeek extends InsightPageImpressions implements InsightService {
/*
	private InsightPageImpressionsWeek insightPageImpressionsWeek;
	
	public InsightPageImpressionsWeek getInsightPageImpressionsWeek() {
		return insightPageImpressionsWeek;
	}

	public void setInsightPageImpressionsWeek(InsightPageImpressionsWeek insightPageImpressionsWeek) {
		this.insightPageImpressionsWeek = insightPageImpressionsWeek;
	}
*/
	public InsightPageImpressionsWeek(long value1, long value2) {
		super("InsightPageImpressions", "Week Insight Page Impressions", "Week", value1, value2);
	}

}
