package com.celcom.home.install.repository;

import java.util.HashMap;
import java.util.Map;

import com.celcom.home.install.model.ActivityDetailModel;

public class ActivityDetailRepository {
	
	private static Map<String, ActivityDetailModel> activtyDetailRepo = new HashMap<>();

	public static Map<String, ActivityDetailModel> getActivtyDetailRepo() {
		return activtyDetailRepo;
	}

	public static void setActivtyDetailRepo(Map<String, ActivityDetailModel> activtyDetailRepo) {
		ActivityDetailRepository.activtyDetailRepo = activtyDetailRepo;
	}

	static {
		ActivityDetailModel activity1 = new ActivityDetailModel();
		activity1.setActivityUID("1-XXYY");
		activity1.setOrderStatus("Active");
		activtyDetailRepo.put(activity1.getActivityUID(), activity1);
		
		ActivityDetailModel activity2 = new ActivityDetailModel();
		activity2.setActivityUID("1-ZZZ");
		activity2.setOrderStatus("Active");
		activtyDetailRepo.put(activity2.getActivityUID(), activity2);
		
	   }
	
	public static ActivityDetailModel getActivityByActivityId(String activityId) {
		return getActivtyDetailRepo().get(activityId);
	}
}
