package JAXBFinal;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="Country")
@XmlType(propOrder={"name","capital","foundation","continent","population"})
public class Country {
	
	private String name, capital,continent;
	private int population,imp;
	private LocalDate foundation;
	
	
	
	public int getImp() {
		return imp;
	}
	@XmlAttribute(name="importance")
	public void setImp(int imp) {
		this.imp = imp;
	}
	
	public String getName() {
		return name;
	}
	@XmlElement(name="Country_Name")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCapital() {
		return capital;
	}
	@XmlElement(name="Country_Capital")
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public String getContinent() {
		return continent;
	}
	
	@XmlElement(name="Country_Continent")
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getPopulation() {
		return population;
	}
	@XmlElement(name="Country_Population")
	public void setPopulation(int population) {
		this.population = population;
	}
	public LocalDate getFoundation() {
		return foundation;
	}
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	@XmlElement(name="Country_Foundation")
	public void setFoundation(LocalDate foundation) {
		this.foundation = foundation;
	}

}
