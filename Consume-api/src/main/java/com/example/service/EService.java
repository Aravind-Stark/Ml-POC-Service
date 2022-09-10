package com.example.service;

import java.net.http.HttpHeaders;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import com.example.model.Model;

@Service
public class EService {
	@Autowired
	private RestTemplate restTemplate;

	public String getResult(List<Model> model) {
           
	      HttpEntity<List<Model>> entity = new HttpEntity<List<Model>>(model);

		return restTemplate.exchange("http://localhost:12345/predict", HttpMethod.POST, entity,String.class).getBody();
	}
	
}
