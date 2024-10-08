package com.client.ws.rasmooplus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="user_type")
public class UserType implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 271790530647240013L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name ="user_type_id")
	
	private Long id;
	
	
	private String name;
	
	private String description;
	
	
	
	
	


	
}
