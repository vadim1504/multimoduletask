package soap.endpoint;

import com.cxf.soap.wsdl.services.person.ServiceFaultException;
import com.cxf.soap.wsdl.types.person.*;
import com.cxf.soap.wsdl.services.person.PersonPortType;
import soap.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by vadim on 19.04.2017.
 */
public class PersonImpl implements PersonPortType {

    // personService
    @Autowired
    private PersonService personService;

    /**
     * @param request request
     * @return response response
     */
    @Override
    public final Response getFriends(final Request request) throws ServiceFaultException {
        List<Person> personList = personService.getFriends(request.getPerson(), request.getYear());
        ObjectFactory objectFactory = new ObjectFactory();
        Response response = objectFactory.createResponse();
        response.getFriends().addAll(personList);
        return response;
    }
}