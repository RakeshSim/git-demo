package com.rakesh.capital;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TradeDetailsController {
	@GetMapping("/")
	public String testValue() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> list = restTemplate.getForEntity("http://localhost:8080/employeeTrade/tradeDetails", String.class);
        System.out.println(list.getBody().toString());
        return list.getBody();
    }

}
