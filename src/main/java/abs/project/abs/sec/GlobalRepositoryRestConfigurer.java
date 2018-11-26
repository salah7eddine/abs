package abs.project.abs.sec;

import abs.project.abs.entities.Etudiant;
import abs.project.abs.entities.Formation;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class GlobalRepositoryRestConfigurer extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.setReturnBodyOnCreate(true);
        repositoryRestConfiguration.setReturnBodyOnUpdate(true);
        repositoryRestConfiguration.exposeIdsFor(Formation.class, Etudiant.class);
        repositoryRestConfiguration.getCorsRegistry()
                .addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedHeaders("*")
                .allowedMethods("OPTIONS","HEAD","GET","PUT","POST","DELETE","PATCH");
    }
}
