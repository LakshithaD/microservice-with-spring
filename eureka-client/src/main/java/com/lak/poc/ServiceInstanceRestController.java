package com.lak.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInstanceRestController {

	@Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public String serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        
    	ServiceInstance instance = this.discoveryClient.getInstances(applicationName).get(0);
    	return "http://" + instance.getHost() + ":" + instance.getPort();
    }
}
