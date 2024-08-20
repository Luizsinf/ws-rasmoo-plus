package com.client.ws.rasmooplus.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.client.ws.rasmooplus.model.User;

public interface UserTypeRepository   extends JpaRepository<User, Long>{

}
