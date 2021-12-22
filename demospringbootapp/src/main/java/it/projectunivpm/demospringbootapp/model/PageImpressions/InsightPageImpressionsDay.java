package it.projectunivpm.demospringbootapp.model.PageImpressions;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageImpressionsDay extends InsightPageImpressions implements InsightService {

	/*private InsightPageImpressionsDay insightPageImpressionsDay;
	
	public InsightPageImpressionsDay getInsightPageImpressionsDay() {
		return insightPageImpressionsDay;
	}

	public void setInsightPageImpressionsDay(InsightPageImpressionsDay insightPageImpressionsDay) {
		this.insightPageImpressionsDay = insightPageImpressionsDay;
	}*/

	public InsightPageImpressionsDay(long value1, long value2) {
		super("InsightPageImpressions", "Day Insight Page Impressions", "Day", value1, value2);
	}


}
