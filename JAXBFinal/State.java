package JAXBFinal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="state")
public class State {
	
	private String sname;
	private int spopulation;
	
	public String getSname() {
		return sname;
	}
	
	@XmlElement(name="stateName")
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSpopulation() {
		return spopulation;
	}
	@XmlElement(name="statePopulation")
	public void setSpopulation(int spopulation) {
		this.spopulation = spopulation;
	}
	
	

}
