package com.app.okta.oktaDemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class OktaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktaDemoApplication.class, args);
	}
	
	/*private PropertySource oktaStaticDiscoveryPropertySource(Environment environment) {
		
		
		Map<String, Object> properties = new HashMap<>();
		properties.put("spring.security.oauth2.resourceserver.jwt.issuer-uri", "${okta.oauth2.issuer}");
		properties.put("spring.security.oauth2.resourceserver.jwt.jwk-set-uri", "${okta.oauth2.issuer}/v1/keys");
		properties.put("spring.security.oauth2.client.provider.okta.authorization-uri", "${okta.oauth2.issuer}/v1/authorize");
		properties.put("spring.security.oauth2.client.provider.okta.token-uri", "${okta.oauth2.issuer}/v1/token");
		properties.put("spring.security.oauth2.client.provider.okta.user-info-uri", "${okta.oauth2.issuer}/v1/userinfo");
		properties.put("spring.security.oauth2.client.provider.okta.jwk-set-uri", "${okta.oauth2.issuer}/v1/keys");
		properties.put("spring.security.oauth2.client.provider.okta.issuer-uri", "${okta.oauth2.issuer}"); // required for OIDC logout

		return new ConditionalMapPropertySource("okta-static-discovery", properties, environment, OKTA_OAUTH_ISSUER);
		
		
	}*/
	
	/*@Configuration
    static class WebConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    // allow antonymous access to the root page
                    .antMatchers("/ap").permitAll()
                    // all other requests
                    .anyRequest().authenticated()

                // set logout URL
                .and().logout().logoutSuccessUrl("/")

                // enable OAuth2/OIDC
                .and().oauth2Client()
                .and().oauth2Login();
        }
    }
	
	 @RestController
	    public class ExampleController {

	        @GetMapping("/")
	        public String home() {
	            return "home";
	        }

	        @GetMapping("/profile")
	       // @PreAuthorize("hasAuthority('SCOPE_profile')")
	        public String userDetails(OAuth2AuthenticationToken authentication) {
	        	System.out.println("----------profile-----------------"+authentication);
	        	return Collections.singletonMap("details", authentication.getPrincipal().getAttributes()).toString();
	           // return new ModelAndView("userProfile" , Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
	        }
	    }
*/
}
