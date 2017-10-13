package JAXBFinal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Continents {

	public static void main(String[] args) {
		
		Continent con=new Continent();
		con.setNom("Europe");
		con.setNs2("org.xeill.elpuig.jaxb.Continet");
		con.setPopulation(7424528);
		
		State s1=new State();
		s1.setSname("Scotland");
		s1.setSpopulation(5295000);
		StateList sl=new StateList();
		sl.add(s1);
		
		
		
		State s2=new State();
		s2.setSname("Catalonia");
		s2.setSpopulation(7512982);
		sl.add(s2);
		
		con.setStates(sl);
		
		try{
			JAXBContext jaxb=JAXBContext.newInstance(Continent.class);
			Marshaller ms=jaxb.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			ms.marshal(con, new File("continents.xml"));
			ms.marshal(con, System.out);
			
		}catch(JAXBException e){
			e.printStackTrace();
		}
		
		
	}

}
