package it.projectunivpm.demospringbootapp.stats;

/**
 * @author MichelangeloMarconi
 * @author MarcoSpina
 * 
 * Classe dedicata per prendere e restituire i parametri
 */

public class StatisticsUtil {

	private String name;
	private double value;

	public StatisticsUtil(String name, double value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * Getter e Setter 
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}


}
