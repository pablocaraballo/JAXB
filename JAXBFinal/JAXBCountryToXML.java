package JAXBFinal;

import java.io.File;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBCountryToXML {

	public static void main(String[] args) {

		Country c=new Country();
		
		c.setImp(1);
		c.setName("Spain");
		c.setCapital("Madrid");
		c.setFoundation(LocalDate.of(1469, 10, 19));
		c.setContinent("Europe");
		c.setPopulation(45000000);
		
		try{
			
			JAXBContext jaxb=JAXBContext.newInstance(Country.class);
			Marshaller ms=jaxb.createMarshaller();
			ms.setProperty(ms.JAXB_FORMATTED_OUTPUT, true );
			
			ms.marshal(c, new File("Country.xml"));
			ms.marshal(c, System.out);
			
		}catch(JAXBException e){
			e.printStackTrace();
		}
		
		
	}

}
