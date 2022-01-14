package it.projectunivpm.demospringbootapp.Exceptions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe che permette di gestire le eccezioni nel caso in cui 
 * la metrica o il periodo inserit nella rotta sono errati
 */

public class MetricOrPeriodNotFoundException extends Exception {

	private static final long serialVersionUID = 2L;

	public MetricOrPeriodNotFoundException() {
		super();
	}

	public MetricOrPeriodNotFoundException(String message) {
		super(message);
	}

}
