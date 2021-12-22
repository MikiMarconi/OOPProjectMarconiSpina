package it.projectunivpm.demospringbootapp.model.PageConsumptions;

import it.projectunivpm.demospringbootapp.model.*;

public class InsightPageConsumptionsMonth extends InsightPageConsumptions implements InsightService {

	/*private InsightPageConsumptionsMonth insightPageConsumptionsMonth;
	
	public InsightPageConsumptionsMonth getInsightPageConsumptionsMonth() {
		return insightPageConsumptionsMonth;
	}

	public void setInsightPageConsumptionsMonth(InsightPageConsumptionsMonth insightPageConsumptionsMonth) {
		this.insightPageConsumptionsMonth = insightPageConsumptionsMonth;
	}*/

	public InsightPageConsumptionsMonth(long value1, long value2) {
		super("InsightPageConsumptions", "Month Insight Page Consumptions", "Month", value1, value2);
	}
}
