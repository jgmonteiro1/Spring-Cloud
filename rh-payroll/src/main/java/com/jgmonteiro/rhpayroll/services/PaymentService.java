package com.jgmonteiro.rhpayroll.services;

import org.springframework.stereotype.Service;

import com.jgmonteiro.rhpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("TesteMock", 100.00, days);
	}
}
