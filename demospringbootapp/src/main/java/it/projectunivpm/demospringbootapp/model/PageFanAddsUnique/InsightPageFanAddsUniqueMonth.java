package it.projectunivpm.demospringbootapp.model.PageFanAddsUnique;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageFanAddsUniqueMonth extends InsightPageFanAddsUnique implements InsightService{
/*
	private InsightPageFanAddsUniqueMonth insightPageFanAddsUniqueMonth;
	
	public InsightPageFanAddsUniqueMonth getInsightPageFanAddsUniqueMonth() {
		return insightPageFanAddsUniqueMonth;
	}

	public void setInsightPageFanAddsUniqueMonth(InsightPageFanAddsUniqueMonth insightPageFanAddsUniqueMonth) {
		this.insightPageFanAddsUniqueMonth = insightPageFanAddsUniqueMonth;
	}
*/
	public InsightPageFanAddsUniqueMonth( long value1, long value2) {
		super("InsightPageFanAddsUnique", "Month Insight Page Fan Adds Unique", "Month", value1, value2);
	}
}
