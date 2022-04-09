package com.sha.springbootdeviceseller.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.sha.springbootdeviceseller.model.Purchase;
import com.sha.springbootdeviceseller.repository.PurchaseRepository;
import com.sha.springbootdeviceseller.repository.projection.PurchaseItem;

@Service
public class PurchaseServiceImplementation implements PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;
	
	
	@Override
	public Purchase savePurchase (Purchase purchase) {
		
		purchase.setPurchaseTime(LocalDateTime.now());
		
		return purchaseRepository.save(purchase);
	
	}
	
	@Override
	public List<PurchaseItem> findAllPurchasesOfUser(Long userId){
		
		return purchaseRepository.findAllPurchasesOfUser(userId);
		
	}
	
	
}
