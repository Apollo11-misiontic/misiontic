package com.prueba.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="concept")
	private String concept;
	
	@Column(name="amount")
	private Float amount;
	
	@Column(name="createdAt")
	private Date createdAt;
	
	@Column(name="updatedAt")
	private Date updatedAt;
	
	// Relacion con Transaction
	@ManyToOne(optional = false)	
    @JoinColumn(name = "user"	)
    private Employee user;

	// Relacion con Transaction
	@ManyToOne(optional = false)	
	@JoinColumn(name = "enterprise"	)
	private Enterprise enterprise;

	
	
	public Transaction() {
		super();
	}

	public Transaction(String concept, Float amount, Date createdAt, Date updatedAt, Employee user,
			Enterprise enterprise) {
		super();
		this.concept = concept;
		this.amount = amount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.user = user;
		this.enterprise = enterprise;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Employee getUser() {
		return user;
	}

	public void setUser(Employee user) {
		this.user = user;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

}
