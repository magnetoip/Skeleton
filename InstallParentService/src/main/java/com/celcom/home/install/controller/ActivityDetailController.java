package com.celcom.home.install.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.celcom.home.install.model.ActivityDetailModel;

import reactor.core.publisher.Mono;

@RestController
public class ActivityDetailController {

	private final String POST_OF_API = "http://acitivity-detail-service/api/getActivity";
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@PostMapping(path="/api/activityDetail", consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	
	public Mono<ActivityDetailModel> getPostById(@RequestBody  ActivityDetaiRequest activityUID) {		
		
	 return webClientBuilder.build()
			 .post()
			 .uri(POST_OF_API,  activityUID)
			 .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			 .body(BodyInserters.fromValue(activityUID))
			 .retrieve()
			 .bodyToMono(ActivityDetailModel.class); 
	}
}
