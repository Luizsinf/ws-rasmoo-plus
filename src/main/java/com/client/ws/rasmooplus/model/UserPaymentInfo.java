package com.client.ws.rasmooplus.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_payment_inf")
public class UserPaymentInfo {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_payment_info_id")
	
    private Long id;
	
	@Column(name="card_Number")
	private String cardNumber;
	
	@Column(name="card_expiration_month")
	private Long cardExpirationMonth;
	
	@Column(name="card_expirtion_year")
	private Long cardExprirationYear;
	
	@Column(name="card_security_code")
	private String cardSecurityCode;
	

	private BigDecimal price;
	
	@Column(name="dt_payment")
	private LocalDate dtPayment;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name ="user_id")
	private User user;
	
}




	