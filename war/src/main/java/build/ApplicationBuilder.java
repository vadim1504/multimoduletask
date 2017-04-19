package build;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import soap.run.SpringCxfApplication;

/**
 * Created by vadim on 19.04.2017.
 */
public class ApplicationBuilder extends SpringBootServletInitializer {

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(SpringCxfApplication.class);
    }
}
