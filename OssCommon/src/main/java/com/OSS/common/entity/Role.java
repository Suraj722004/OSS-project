package com.OSS.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import jakarta.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(length = 40, nullable= false, unique = true)
	private String name;
	
	@Column(length= 150, nullable=false , unique = true)
	private String description;
	
	public Role() {		
	}
	
	public Role(String name){
		this.name = name;
	}
	
	public Role(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
