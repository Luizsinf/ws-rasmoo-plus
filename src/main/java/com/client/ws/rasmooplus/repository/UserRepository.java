package com.client.ws.rasmooplus.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.client.ws.rasmooplus.model.UserPaymentInfo;

public interface UserRepository   extends JpaRepository<UserPaymentInfo, Long>{

}
