package com.client.ws.rasmooplus.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.NotFoudException;
import com.client.ws.rasmooplus.model.SubscriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import com.client.ws.rasmooplus.service.SubsciptionTypeService;


@Service
public class SubsciptionTypeServiceImpl implements SubsciptionTypeService  {

	
	private final  SubscriptionTypeRepository subscrptionTypeRepository;
	
	
	SubsciptionTypeServiceImpl(SubscriptionTypeRepository subscrptionTypeRepository){
		this.subscrptionTypeRepository = subscrptionTypeRepository;
	
	}
	
	
	
	@Override
	public List<SubscriptionType> findALL() {

		return subscrptionTypeRepository.findAll();
	}

	@Override
	public SubscriptionType findById(Long id) {
		
		Optional<SubscriptionType> optionalSubscriptionType  = subscrptionTypeRepository.findById(id);
		if (optionalSubscriptionType.isEmpty()) {

		   throw new NotFoudException("SubscriptionType não encontradao");
		
		}
		
		
		return optionalSubscriptionType.get();
	}

	@Override
	public SubscriptionType create(SubscriptionTypeDto dto) {

		return subscrptionTypeRepository.save(SubscriptionType.builder()
				.id(dto.getId())
				.name(dto.getName())
				.accessMonth(dto.getAccessMonth())
				.price(dto.getPrice())
				.productKey(dto.getProductKey())
			.build());
	}

				
	@Override
	public SubscriptionType update(Long id, SubscriptionTypeDto dto) {
	
		return null;
	}

	@Override
	public void delete(Long id) {
	
		
	}

}
