package com.client.ws.rasmooplus.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Table(name="subscriptions_type")

public class SubscriptionType  implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="subscriptions_type_id")
	private Long id;
	
	private String name;
	
	
	@Column(name ="access_months")
	private Long accessMonth;
	
	private BigDecimal price;
	
	
	@Column(name ="product_key")
	private String productKey;


	


	

}
