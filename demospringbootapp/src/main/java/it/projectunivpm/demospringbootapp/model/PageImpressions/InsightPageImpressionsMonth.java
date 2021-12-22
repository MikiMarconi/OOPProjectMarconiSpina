package it.projectunivpm.demospringbootapp.model.PageImpressions;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageImpressionsMonth extends InsightPageImpressions implements InsightService {
/*
	private InsightPageImpressionsMonth insightPageImpressionsMonth;
	
	public InsightPageImpressionsMonth getInsightPageImpressionsMonth() {
		return insightPageImpressionsMonth;
	}

	public void setInsightPageImpressionsMonth(InsightPageImpressionsMonth insightPageImpressionsMonth) {
		this.insightPageImpressionsMonth = insightPageImpressionsMonth;
	}
*/
	public InsightPageImpressionsMonth(long value1, long value2) {
		super("InsightPageImpressions", "Month Insight Page Impressions", "Month", value1, value2);
	}
}
