package it.projectunivpm.demospringbootapp.model;

import java.util.Vector;


public class InsightImpl implements InsightService {
	private static Vector<Insight> insightImpl = new Vector(9);

	public Vector<Insight> getInsightImpl() {
		return insightImpl;
	}

}
