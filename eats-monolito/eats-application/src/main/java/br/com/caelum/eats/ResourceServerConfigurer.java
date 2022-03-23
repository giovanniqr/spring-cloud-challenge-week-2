package br.com.caelum.eats;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.client.HttpClientErrorException;

@Configuration
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {


	@Override
	public void configure(HttpSecurity http) throws Exception {

			http.authorizeRequests()
			.antMatchers(HttpMethod.POST, "/parceiros/restaurantes")
			.hasRole("RESTAURANTE");

			http.authorizeRequests()
			.antMatchers(HttpMethod.PUT, "/parceiros/restaurantes/{id}")
			.hasRole("RESTAURANTE");
	}

}
