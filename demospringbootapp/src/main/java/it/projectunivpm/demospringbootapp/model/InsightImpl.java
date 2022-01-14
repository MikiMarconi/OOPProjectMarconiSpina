package it.projectunivpm.demospringbootapp.model;

import java.util.Vector;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe di ordinamento
 */

public class InsightImpl {

	private static Vector<Insight> insightImpl = new Vector<Insight>();

	/**
	 * Questi metodi sono di configurazione, li utilizziamo per accedere dai diversi
	 * pacchetti ad una stessa risorsa statica ossia un array di Insight(insightImpl)
	 */

	public static Vector<Insight> getInsightImpl() {
		return insightImpl;
	}

	public static void setInsightImpl(Vector<Insight> insightImpl) {
		InsightImpl.insightImpl = insightImpl;
	}

}