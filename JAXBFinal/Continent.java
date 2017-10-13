package JAXBFinal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="continet")
public class Continent {
	
	private String nom, ns2;
	private int population;
	private StateList states;
	
	public StateList getStates() {
		return states;
	}
	
	@XmlElement(name="StateList")
	public void setStates(StateList states) {
		this.states = states;
	}
	public String getNs2() {
		return ns2;
	}
	@XmlAttribute(name="xmlns:ns2")
	public void setNs2(String ns2) {
		this.ns2 = ns2;
	}

	public String getNom() {
		return nom;
	}
	@XmlElement (name="continentName")
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPopulation() {
		return population;
	}
	@XmlElement (name="continentPopulation")
	public void setPopulation(int population) {
		this.population = population;
	}
	
	public String toString(){
		
		return "Continent Name: "+this.getNom()+"\n"+"Continent Population: "+this.getPopulation()+states.toString();
	}

}
