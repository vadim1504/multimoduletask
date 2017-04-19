package soap.endpoint;

import javax.xml.ws.Endpoint;

import soap.services.PersonService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vadim on 19.04.2017.
 */
@Configuration
public class EndpointConfig {

    // bus
    @Autowired
    private Bus bus;

    /**
     * @param personImpl request
     * @return endpoint response
     */
    @Bean
    public final Endpoint endpoint(final PersonImpl personImpl) {
        EndpointImpl endpoint = new EndpointImpl(bus, personImpl);
        endpoint.publish("/person");
        return endpoint;
    }

    /**
     * @return PersonService response
     */
    @Bean
    public final PersonService personService() {
        return new PersonService();
    }


    /**
     * @return PersonImpl response
     */
    @Bean
    public final PersonImpl personImpl() {
        return new PersonImpl();
    }
}