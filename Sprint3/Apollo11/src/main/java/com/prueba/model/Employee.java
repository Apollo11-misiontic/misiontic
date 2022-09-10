package com.prueba.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="imagen")
	private String imagen;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="updatedAt")
	private Date updatedAt;

	@Column(name="createdAt")
	private Date createdAt;
	
	//@OneToOne
	//@JoinColumn(name = "profile")
	//private Profile profile;
	
	@Column(name="role")
	private RoleName role;
	
	// Relacion Enterprise
	//@OneToOne
	//@JoinColumn(name = "id")
	//private Enterprise enterprise;
	
	
	@ManyToOne(optional = false)	
	@JoinColumn(name = "enterprise"	)
	private Enterprise enterprise;
	
	//Relacion con Enterprise
	 //@OneToMany(mappedBy = "user", cascade = {CascadeType.ALL}, orphanRemoval = true)
	//@OneToMany(mappedBy = "user")
	//private List<Transaction> transaction;


	public Employee() {
		super();
	}
	

	public Employee(String email, String imagen, String phone, Date updatedAt, Date createdAt, RoleName role,
			Enterprise enterprise) {
		super();
		this.email = email;
		this.imagen = imagen;
		this.phone = phone;
		this.updatedAt = updatedAt;
		this.createdAt = createdAt;
		this.role = role;
		this.enterprise = enterprise;
	}




	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public RoleName getRole() {
		return role;
	}

	public void setRole(RoleName role) {
		this.role = role;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	 
}
