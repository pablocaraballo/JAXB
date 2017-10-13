package JAXBFinal;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="stateList")
public class StateList {

	private ArrayList<State> states;

	public ArrayList<State> getStates() {
		return states;
	}
	@XmlElement (name="state")
	public void setStates(ArrayList<State> states) {
		this.states = states;
	}
	
	public void add(State states){
		if(this.states==null){
			this.states=new ArrayList<State>();
		}
		this.states.add(states);
	}
	
	public String toString(){
		
		String resultado="";
		
		for(int i=0; i<states.size(); i++){
			
			resultado+="\n"+"State:"+(i+1)+" "+states.get(i).getSname();
		}
		
		return resultado;
	}
}
