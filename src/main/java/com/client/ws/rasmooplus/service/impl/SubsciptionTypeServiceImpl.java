package com.client.ws.rasmooplus.service.impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoudException;
import com.client.ws.rasmooplus.mapper.SubscriptionTypeMapper;
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
		
	return getSubscriptionType(id);
	}





	@Override
	public SubscriptionType create(SubscriptionTypeDto dto) {
		
		
	if(Objects.nonNull(dto.getId())) {
		
		  throw new BadRequestException("Id deve ser nulo");
		
		
	}

		return subscrptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
	}

				
	@Override
	public SubscriptionType update(Long id, SubscriptionTypeDto dto) {
		
		getSubscriptionType(id);
		dto.setId(id);
	
		
		return subscrptionTypeRepository.save(SubscriptionTypeMapper.fromDtoToEntity(dto));
}

	@Override
	public void delete(Long id) {
		getSubscriptionType(id);
		subscrptionTypeRepository.deleteById(id);
	
		
	}
	private SubscriptionType getSubscriptionType(Long id) {
		Optional<SubscriptionType> optionalSubscriptionType  = subscrptionTypeRepository.findById(id);
		if (optionalSubscriptionType.isEmpty()) {

		   throw new NotFoudException("SubscriptionType não encontradao");
		
		}
		return optionalSubscriptionType.get();
	}
}
