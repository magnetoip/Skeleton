package com.celcom.home.install.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.celcom.home.install.model.ActivityListModel;
import com.celcom.home.install.model.ParentModel;
import com.celcom.home.install.repository.ParentRepository;

@RestController
public class ActivityListController {

	private final ParentRepository parentRepository = new ParentRepository();
	
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
	@RequestMapping("/api/activityList")
    public List<ActivityListModel> listAllActivities() {
        return parentRepository.listAllActivities();
    }
}
