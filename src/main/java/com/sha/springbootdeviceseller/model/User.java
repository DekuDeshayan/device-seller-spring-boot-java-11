package com.sha.springbootdeviceseller.model;



import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data//lombok
@Entity//database
@Table(name = "users")//tablename
//usamos users em substituicao pois user é uma palavra reservada de postgresql
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable =  false, length = 100)
	private String username;
	
	@Column(nullable = false, length = 100)
	private String password;
	
	@Column(nullable = false, length = 100)
	private String name; 
	
	@Column(nullable = false, length = 100)
	private LocalDateTime createTime;
	
	@Transient
	private String token;
	
	//User roles
	@Enumerated(EnumType.STRING)
	@Column(nullable = false )
	private Role role;
	
	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<Purchase> purchaselist;
	*/
	
	 
}
