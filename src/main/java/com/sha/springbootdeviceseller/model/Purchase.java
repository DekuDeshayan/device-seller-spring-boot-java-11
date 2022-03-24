package com.sha.springbootdeviceseller.model;

import java.time.LocalDate;

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
	
	
	@Column(name="user_id", nullable = false )
	private Long userId;

	/*
	 * Mapeamento o ID do usuario na tabela de purchases
	 * Serve apenas para mapeamento de chave estrangeira
	 * Mapeamento directo de fk usando a tabela de origem: user
	 * 
	 */
	@ManyToOne (fetch =  FetchType.LAZY) //Muitas compras podem ser de um utilizador
	@JoinColumn (name= "user_id", referencedColumnName = "id", insertable = false, updatable = false )
	private User user;
	
	
	@Column(name="device_id", nullable = false )
	private Long deviceID;
	
	/*
	 * Mapeamento o ID do device na tabela de purchases
	 * Serve apenas para mapeamento de chave estrangeira
	 * Mapeamento directo de fk usando a tabela de origem: device
	 */
	@ManyToOne (fetch =  FetchType.LAZY) //Muitas compras podem ser de um unico dispositivo
	@JoinColumn (name= "device_id", referencedColumnName = "id", insertable = false, updatable = false )
	private Device device;
	
	//Apenas paa guardar historico de preco naquela data de compra
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false)
	private double color;
	
	
	@Column(nullable = false, length = 100)
	private LocalDate createTime;
	
	

}
