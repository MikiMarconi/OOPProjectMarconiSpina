package it.projectunivpm.demospringbootapp.model.PageFanAddsUnique;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageFanAddsUniqueDay extends InsightPageFanAddsUnique implements InsightService{

	/*private static InsightPageFanAddsUniqueDay insightPageFanAddsUniqueDay;
	
	public static InsightPageFanAddsUniqueDay getInsightPageFanAddsUniqueDay() {
		return insightPageFanAddsUniqueDay;
	}

	public void setInsightPageFanAddsUniqueDay(InsightPageFanAddsUniqueDay insightPageFanAddsUniqueDay) {
		this.insightPageFanAddsUniqueDay = insightPageFanAddsUniqueDay;
	}*/

	public InsightPageFanAddsUniqueDay( long value1, long value2) {
		super("InsightPageFanAddsUnique", "Day Insight Page Fan Adds Unique", "Day", value1, value2);
	}


}
