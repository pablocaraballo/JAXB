package JAXBFinal;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBXMLToJAVA {

	public static void main(String[] args) throws JAXBException {
	
		File f1=new File("continents.xml");
		JAXBContext jaxbc=JAXBContext.newInstance(Continent.class);
		Unmarshaller unms=jaxbc.createUnmarshaller();
		Continent c=(Continent) unms.unmarshal(f1);
		System.out.println(c);
	}
}
