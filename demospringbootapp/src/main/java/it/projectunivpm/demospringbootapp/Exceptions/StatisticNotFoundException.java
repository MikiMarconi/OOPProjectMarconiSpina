package it.projectunivpm.demospringbootapp.Exceptions;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe che permette di gestire le eccezioni nel caso in cui 
 * la statistica inserita nella rotta e' errata
 */

public class StatisticNotFoundException extends Exception{

	private static final long serialVersionUID = 3L;

	public StatisticNotFoundException() {
		super();
	}

	public StatisticNotFoundException(String message) {
		super(message);
	}

}
