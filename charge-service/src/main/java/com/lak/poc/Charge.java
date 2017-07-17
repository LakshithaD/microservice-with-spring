package com.lak.poc;

import java.math.BigDecimal;

public class Charge {

	private BigDecimal amount;
	
	private String userId;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
