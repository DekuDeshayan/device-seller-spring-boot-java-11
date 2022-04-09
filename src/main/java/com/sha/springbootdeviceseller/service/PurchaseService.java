package com.sha.springbootdeviceseller.service;

import java.util.List;

import com.sha.springbootdeviceseller.model.Purchase;
import com.sha.springbootdeviceseller.repository.projection.PurchaseItem;

public interface PurchaseService {

	Purchase savePurchase(Purchase purchase);

	List<PurchaseItem> findAllPurchasesOfUser(Long userId);

}
