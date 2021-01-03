package com.retailBanking.accountsService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients("com.retailBanking.accountsService")
public class AccountsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsServiceApplication.class, args);
	}
	
	/*@Bean
	@LoadBalanced
	public RestTemplate createRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	
	@Autowired
	CloseableHttpClient httpClient;
	 
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	 
	    RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());
	    return restTemplate;
	}
	 
	@Bean
	public HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
	 
	    HttpComponentsClientHttpRequestFactory clientHttpRequestFactory 
	                            = new HttpComponentsClientHttpRequestFactory();
	    clientHttpRequestFactory.setHttpClient(httpClient);
	    return clientHttpRequestFactory;
	}*/

}
