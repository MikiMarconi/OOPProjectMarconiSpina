package it.projectunivpm.demospringbootapp.model.PageConsumptions;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageConsumptionsDay extends InsightPageConsumptions implements InsightService {
	
	/*private InsightPageConsumptionsDay insightPageConsumptionsDay;
	
	public InsightPageConsumptionsDay getInsightPageConsumptionsDay() {
		return insightPageConsumptionsDay;
	}

	public void setInsightPageConsumptionsDay(InsightPageConsumptionsDay insightPageConsumptionsDay) {
		this.insightPageConsumptionsDay = insightPageConsumptionsDay;
	}*/

	public InsightPageConsumptionsDay(long value1, long value2) {
		super("InsightPageConsumptions", "Day Insight Page Consumptions", "Day", value1, value2);
	}

}
