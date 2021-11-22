package com.celcom.home.install.repository;

import java.util.ArrayList;
import java.util.List;

import com.celcom.home.install.model.ActivityListModel;
import com.celcom.home.install.model.ParentModel;

public class ParentRepository {
	
	public List<ActivityListModel> listAllActivities(){
		
		List<ActivityListModel> listofActivities =  new ArrayList<ActivityListModel>();
		
		ActivityListModel activity = new ActivityListModel();
		
		activity.setActivityUID("1-XXYY");
		activity.setOrderId("1-134234234");
		activity.setAccessPartner("CTSB");
		activity.setOrderAccountName("Regish");
		listofActivities.add(activity);
		activity.setActivityUID("1-ZZZ");
		activity.setOrderId("1-3425453");
		activity.setAccessPartner("CTSB");
		activity.setOrderAccountName("Veer");
		listofActivities.add(activity);
		
		
		return listofActivities;
		
	}

}
