package com.sha.springbootdeviceseller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sha.springbootdeviceseller.model.Purchase;
import com.sha.springbootdeviceseller.security.UserPrincipal;
import com.sha.springbootdeviceseller.service.PurchaseService;

@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {
	
	
	@Autowired
	private PurchaseService purchaseService;
	
	@PostMapping("save")//api/purchases/save
	public ResponseEntity<?> savePurchases(@RequestBody Purchase purchase){
		
		return new ResponseEntity<>(purchaseService.savePurchase(purchase), HttpStatus.CREATED);
	
	}
	
	@GetMapping("find-all-purchases-of-user")//api/purchases/find-all-purchases-of-user
	public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal ){
		
		return ResponseEntity.ok(purchaseService.findAllPurchasesOfUser(userPrincipal.getId()));	
	}

}
