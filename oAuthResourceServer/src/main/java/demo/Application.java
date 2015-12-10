package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.security.oauth2.resource.EnableOAuth2Resource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @EnableOAuth2Resource
    protected static class OAuthConfig extends ResourceServerConfigurerAdapter {

      @Override
      public void configure(HttpSecurity http) throws Exception {
        http.requestMatchers()
          .antMatchers("/protected/**")
       .and()
         .authorizeRequests()
           .anyRequest().authenticated();
      }
    }    
}
