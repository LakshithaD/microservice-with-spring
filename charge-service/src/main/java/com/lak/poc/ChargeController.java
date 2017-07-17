package com.lak.poc;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChargeController {

	@RequestMapping(value = "/charge", method = RequestMethod.POST)
	public String charge(@RequestBody Charge charge) {

		System.out.println(" ===================== " + charge.getUserId());

		User user = getUser("USR_001");
		return "User Charged" + user.getUserId() + " : " + user.getfName();
	}

	public String getServiceInstance(String applicationName) {

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<?> httpEntity = new HttpEntity<>(getDefaultHeaders());
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080" + "/service-instances/" + applicationName, HttpMethod.GET,
				httpEntity, String.class);
	//	ServiceInstance instance = response.getBody();
		return response.getBody();
	}

	public HttpHeaders getDefaultHeaders() {

		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set("Content-Type", "application/json");
		requestHeaders.set("Accept", "application/json");
		return requestHeaders;
	}
	
	public User getUser(String userId) {
		
		HttpEntity<?> httpEntity = new HttpEntity<>(getDefaultHeaders());
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<User> response = restTemplate.exchange(
				getServiceInstance("USER-SERVICE") + "/user",
				HttpMethod.GET, httpEntity, User.class);
		return response.getBody();
	}
}
