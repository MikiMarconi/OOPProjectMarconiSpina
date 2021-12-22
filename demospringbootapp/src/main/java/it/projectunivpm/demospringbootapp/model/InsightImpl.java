package it.projectunivpm.demospringbootapp.model;

import java.util.Vector;



public class InsightImpl implements InsightService {

	private static Vector<Insight> insightImpl = new Vector();


	/*
	 * Questi metodi sono di configurazione, li utilizziamo per accedere dai diversi
	 * pacchetti ad una stessa risorsa statica ossia un array di Insight(insightImpl)
	 */
	
	public static Vector<Insight> getInsightImpl() {
		return insightImpl;
	}

	public static void setInsightImpl(Vector<Insight> insightImpl) {
		InsightImpl.insightImpl = insightImpl;
	}

	
	/*
	 * Somma le interazioni degli utenti negli ultimi due giorni
	 */
	
	/*public void AddImpressionDayTotalImpressions() {
		long sum= insightImpl.get(0).getValue1() + insightImpl.get(0).getValue2(); 
	}
	
	public void AddImpressionDayPageConsumptions() {
		long sum= insightImpl.get(1).getValue1() + insightImpl.get(1).getValue2(); 
	}
	
	public void AddImpressionDayNewLikes() {
		long sum= insightImpl.get(2).getValue1() + insightImpl.get(2).getValue2(); 
	}
	
	public void AddImpressionWeekTotalImpressions() {
		long sum= insightImpl.get(3).getValue1() + insightImpl.get(3).getValue2(); 
	}
	
	public void AddImpressionWeekPageConsumptions() {
		long sum= insightImpl.get(4).getValue1() + insightImpl.get(4).getValue2(); 
	}
	
	public void AddImpressionWeekNewLikes() {
		long sum= insightImpl.get(5).getValue1() + insightImpl.get(5).getValue2(); 
	}
	
	public void AddImpressionMonthTotalImpressions() {
		long sum= insightImpl.get(6).getValue1() + insightImpl.get(6).getValue2(); 
	}
	
	public void AddImpressionMonthPageConsumptions() {
		long sum= insightImpl.get(7).getValue1() + insightImpl.get(7).getValue2(); 
	}
	
	public void AddImpressionMonthNewLikes() {
		long sum= insightImpl.get(8).getValue1() + insightImpl.get(8).getValue2(); 
	}
	*/
}