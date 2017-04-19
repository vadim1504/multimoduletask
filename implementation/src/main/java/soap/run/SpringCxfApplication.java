package soap.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by vadim on 19.04.2017.
 */
@SpringBootApplication
public class SpringCxfApplication {

    protected SpringCxfApplication() {
        //not called
    }

    /**
     * @param args param
     */
    public static void main(final String[] args) {
        SpringApplication.run(SpringCxfApplication.class, args);
    }
}