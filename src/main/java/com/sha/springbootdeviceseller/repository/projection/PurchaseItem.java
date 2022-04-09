package com.sha.springbootdeviceseller.repository.projection;


import java.time.LocalDateTime;

import com.sha.springbootdeviceseller.model.Devicetype;

public interface PurchaseItem {
	
	String getName();
    Devicetype getType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();

}
