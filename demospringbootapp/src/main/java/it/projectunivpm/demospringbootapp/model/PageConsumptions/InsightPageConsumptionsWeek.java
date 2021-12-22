package it.projectunivpm.demospringbootapp.model.PageConsumptions;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageConsumptionsWeek extends InsightPageConsumptions implements InsightService {
/*
	private InsightPageConsumptionsWeek insightPageConsumptionsWeek;
	
	public InsightPageConsumptionsWeek getInsightPageConsumptionsWeek() {
		return insightPageConsumptionsWeek;
	}

	public void setInsightPageConsumptionsWeek(InsightPageConsumptionsWeek insightPageConsumptionsWeek) {
		this.insightPageConsumptionsWeek = insightPageConsumptionsWeek;
	}
*/
	public InsightPageConsumptionsWeek( long value1, long value2) {
		super("InsightPageConsumptions", "Weekly Insight Page Consumptions", "Week", value1, value2);
	}
}
