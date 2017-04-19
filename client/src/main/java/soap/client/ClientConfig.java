package soap.client;

import com.cxf.soap.wsdl.services.person.PersonPortType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vadim on 19.04.2017.
 */
@Configuration
public class ClientConfig {

    // service address
    @Value("${service.address}")
    private String serviceAddress;

    /**
     * @return bean PersonPortType
     */
    @Bean(name = "ClientProxyBean")
    public final PersonPortType opportunityPortType() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(PersonPortType.class);
        jaxWsProxyFactoryBean.setAddress(serviceAddress);
        return (PersonPortType) jaxWsProxyFactoryBean.create();
    }
}
