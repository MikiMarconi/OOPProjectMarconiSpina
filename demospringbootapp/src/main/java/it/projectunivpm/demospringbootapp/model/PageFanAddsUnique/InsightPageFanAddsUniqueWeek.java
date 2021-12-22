package it.projectunivpm.demospringbootapp.model.PageFanAddsUnique;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageFanAddsUniqueWeek extends InsightPageFanAddsUnique implements InsightService{
/*
	private InsightPageFanAddsUniqueWeek insightPageFanAddsUniqueWeek;
	
	public InsightPageFanAddsUniqueWeek getInsightPageFanAddsUniqueWeek() {
		return insightPageFanAddsUniqueWeek;
	}

	public void setInsightPageFanAddsUniqueWeek(InsightPageFanAddsUniqueWeek insightPageFanAddsUniqueWeek) {
		this.insightPageFanAddsUniqueWeek = insightPageFanAddsUniqueWeek;
	}
*/
	public InsightPageFanAddsUniqueWeek(long value1, long value2) {
		super("InsightPageFanAddsUnique", "Week Insight Page Fan Adds Unique", "Week", value1, value2);
	}
}