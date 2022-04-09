package com.sha.springbootdeviceseller.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="purchases")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//fk- é a criacao da foreign key como no mysql: user_id int
	@Column(name="user_id", nullable = false )
	private Long userId;

	/*
	 * Uma vez que ja criamos aqui ja estamos a referenciar a foreignk key criada acima com aquele:
	 * foreign key user_id references tabela User no campo id
	 * Mapeamento o ID do usuario na tabela de purchases
	 * Serve apenas para mapeamento de chave estrangeira
	 * Mapeamento directo de fk usando a tabela de origem: user
	 * 
	 */
	@ManyToOne (fetch =  FetchType.LAZY) //Muitas compras podem ser de um utilizador
	@JoinColumn (name= "user_id", referencedColumnName = "id", insertable = false, updatable = false )
	private User user; //estamos chamando a tabela de users para referenciar a fk 
	
	
	//fk- é a criacao da foreign key como no mysql: device_id int
	@Column(name="device_id", nullable = false )
	private Long deviceId;
	
	/*
	 * Mapeamento o ID do device na tabela de purchases
	 * Serve apenas para mapeamento de chave estrangeira
	 * Mapeamento directo de fk usando a tabela de origem: device
	 */
	@ManyToOne (fetch =  FetchType.LAZY) //Muitas compras podem ser de um unico dispositivo
	@JoinColumn (name= "device_id", referencedColumnName = "id", insertable = false, updatable = false )
	private Device device;//estamos chamando a tabela de devices para referenciar a fk
	
	//Apenas paa guardar historico de preco naquela data de compra
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false, length = 100)
	private String color;
	
	
	@Column(nullable = false, length = 100)
	private LocalDateTime purchaseTime;
	
	

}
