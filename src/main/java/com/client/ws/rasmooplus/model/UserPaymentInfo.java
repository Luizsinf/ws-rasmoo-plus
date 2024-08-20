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
	private Users user;
	
	

	public UserPaymentInfo(Long id, String cardNumber, Long cardExpirationMonth, Long cardExprirationYear,
			String cardSecurityCode, BigDecimal price, LocalDate dtPayment, Users user) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.cardExpirationMonth = cardExpirationMonth;
		this.cardExprirationYear = cardExprirationYear;
		this.cardSecurityCode = cardSecurityCode;
		this.price = price;
		this.dtPayment = dtPayment;
		this.user = user;
	}



	public UserPaymentInfo() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}



	public Long getCardExpirationMonth() {
		return cardExpirationMonth;
	}



	public void setCardExpirationMonth(Long cardExpirationMonth) {
		this.cardExpirationMonth = cardExpirationMonth;
	}



	public Long getCardExprirationYear() {
		return cardExprirationYear;
	}



	public void setCardExprirationYear(Long cardExprirationYear) {
		this.cardExprirationYear = cardExprirationYear;
	}



	public String getCardSecurityCode() {
		return cardSecurityCode;
	}



	public void setCardSecurityCode(String cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}



	public BigDecimal getPrice() {
		return price;
	}



	public void setPrice(BigDecimal price) {
		this.price = price;
	}



	public LocalDate getDtPayment() {
		return dtPayment;
	}



	public void setDtPayment(LocalDate dtPayment) {
		this.dtPayment = dtPayment;
	}



	public Users getUser() {
		return user;
	}



	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
	
	
	
	
	
	

}
