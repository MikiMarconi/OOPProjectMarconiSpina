package it.projectunivpm.demospringbootapp.model;

public class Insight {

	/*
	 * Le statistiche fornite da facebook possiedono tutte la stessa forma :
	 * sono caratterizzate da un nome(title), una descrizione(description)
	 * un periodo a cui fanno riferimento(period), e una coppia di valori(values) di cui il primo 
	 * associato al giorno precedente e il secondo riferito al giorno stesso.
	 */
	
	private String title;
	private String description;
	private long value1;
	private long value2;  
	
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
	private String period;
	
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
