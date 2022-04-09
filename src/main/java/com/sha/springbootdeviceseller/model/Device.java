package com.sha.springbootdeviceseller.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="devices")
public class Device {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false, length = 1000)
	private String description;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false, length = 100)
	private LocalDateTime createTime;
	
	//device-type
	 
	@Enumerated(EnumType.STRING)
	@Column(nullable = false )
	private Devicetype deviceType;
	
	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "device")
	private Set<Purchase> purchaselist;
	*/

	
	

}
