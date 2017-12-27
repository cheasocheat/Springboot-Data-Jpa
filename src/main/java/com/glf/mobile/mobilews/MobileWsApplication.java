package com.glf.mobile.mobilews;

import com.glf.mobile.mobilews.util.data.DataManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaAuditing
public class MobileWsApplication extends SpringBootServletInitializer{
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		return restTemplate;
	}


	@Bean
	public HttpHeaders header() {
		HttpHeaders headers = new HttpHeaders();
		return  headers;
	}

	@Bean
	public DataManager dataManager(){
		DataManager dataManager = new DataManager();
		return dataManager;
	}

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(getClass());
	}
	*/

	public static void main(String[] args) {
		SpringApplication.run(MobileWsApplication.class, args);
	}
}
