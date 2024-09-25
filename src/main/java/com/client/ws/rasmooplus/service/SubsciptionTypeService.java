package com.client.ws.rasmooplus.service;

import java.util.List;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.model.SubscriptionType;

public interface SubsciptionTypeService {
	
	
	List<SubscriptionType> findALL();
	
	SubscriptionType findById(Long id);
	
	SubscriptionType create(SubscriptionTypeDto dto);
	
	
	SubscriptionType update(Long id,SubscriptionTypeDto dto);
	
	void delete(Long id);



	


	
	
}
