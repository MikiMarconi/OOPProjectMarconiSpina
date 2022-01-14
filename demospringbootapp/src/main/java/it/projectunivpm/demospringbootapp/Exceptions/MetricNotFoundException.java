package it.projectunivpm.demospringbootapp.Exceptions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe che permette di gestire le eccezioni nel caso in cui 
 * la metrica inserita nella rotta e' errata
 */

public class MetricNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public MetricNotFoundException() {
		super();
	}

	public MetricNotFoundException(String message) {
		super(message);
	}

}
