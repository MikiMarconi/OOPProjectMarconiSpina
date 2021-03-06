package it.projectunivpm.demospringbootapp.model;

public class Insight {

	/**
	 * @author MarconiMichelangelo
	 * @author MarcoSpina
	 * 
	 * Classe che immagazzina e ordina tutte le statistiche fornite da facebook che 
	 * possiedono tutte la stessa forma :
	 * sono caratterizzate da un nome(title), una descrizione(description)
	 * un periodo a cui fanno riferimento(period), e una coppia di valori(values) di cui il primo 
	 * associato al giorno precedente e il secondo riferito al giorno stesso.
	 */

	/**@param title  titolo dell'insight*/
	private String title;

	/**@param description descrizione dell'insight */
	private String description; 

	/**@param period periodo dell'insight */
	private String period;

	/**@param value1 valore meno recente dell'insight*/
	private long value1;

	/**@param value2 valore piu' recente dell'insight */
	private long value2;  

	public Insight(String title, String description, String period, long value1, long value2) {
		this.title = title;
		this.description = description;
		this.period = period;
		this.value1 = value1;
		this.value2 = value2;
	}

	/**
	 * Secondo costruttore 
	 */

	public Insight() {

	}

	/**
	 * Getter e Setter della classe insight
	 */

	public long getValue1() {
		return value1;
	}

	public void setValue1(long value1) {
		this.value1 = value1;
	}

	public long getValue2() {
		return value2;
	}

	public void setValue2(long value2) {
		this.value2 = value2;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	} 

}
