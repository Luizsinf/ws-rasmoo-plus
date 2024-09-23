package com.client.ws.rasmooplus.service;

import java.util.List;

import com.client.ws.rasmooplus.model.SubscriptionType;

public interface SubsciptionTypeService {
	
	
	List<SubscriptionType> findALL();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionType subscriptionType);
	
	
	SubscriptionType update(Long id,SubscriptionType SubscripitionType);
	
	void delete(Long id);
	
	
	
}
