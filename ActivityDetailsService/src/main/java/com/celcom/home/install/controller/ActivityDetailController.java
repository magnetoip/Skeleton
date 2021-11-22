package com.celcom.home.install.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.celcom.home.install.repository.ActivityDetailRepository;

@RestController
public class ActivityDetailController {
	
	private final ActivityDetailRepository parentRepository = new ActivityDetailRepository();

	@RequestMapping(value = "/api/activiytDetail")
	   public ResponseEntity<Object> getActivityDetailByActivityID() {
	      //return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
		return new ResponseEntity<>(ActivityDetailRepository.getActivtyDetailRepo().values(), HttpStatus.OK);
		
	   }
	
	@RequestMapping(value = "/api/activiytDetail/{ActivityUID}", method = RequestMethod.GET)
	   public ResponseEntity<Object> get(@PathVariable("ActivityUID") String ActivityUID) { 
	      return new ResponseEntity<>(ActivityDetailRepository.getActivityByActivityId(ActivityUID), HttpStatus.OK);
	   }
	
	@RequestMapping(value = "/api/getActivity", method = RequestMethod.POST)
	   public ResponseEntity<Object> getActivityByID(@RequestBody ActivityDetaiRequest activityDetaiRequest) { 
	      return new ResponseEntity<>(ActivityDetailRepository.getActivityByActivityId(activityDetaiRequest.getActivityUID()), HttpStatus.OK);
	   }
}
