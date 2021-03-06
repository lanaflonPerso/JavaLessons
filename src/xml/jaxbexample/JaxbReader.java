package xml.jaxbexample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by max on 2/22/17.
 */
public class JaxbReader {
    public static void main(String[] args) throws JAXBException {
        File file = new File("/home/max/file.xml");
        JAXBContext context = JAXBContext.newInstance(Customer.class);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Customer customer = (Customer) unmarshaller.unmarshal(file);
        System.out.println(customer.id);
        System.out.println(customer.name);
        System.out.println(customer.age);
    }
}
