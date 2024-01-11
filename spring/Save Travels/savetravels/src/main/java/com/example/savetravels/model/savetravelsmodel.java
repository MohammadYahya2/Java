package com.example.savetravels.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "savetravels")
public class savetravelsmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 5, max = 200, message = "the expenseName name should be at lest 5 character ")
	private String expenseName;
	@NotNull
	@Size(min = 5, max = 200, message = "the vendor name should be at lest 5 character ")
	private String vendor;

	@Min(value = 1, message = "The amount number should be at least 1.")
	@Max(value = 100000, message = "The amount number should not exceed 100000.")
	private Integer amount;
	@Size(min = 5, max = 200, message = "the description  should be at lest 5 character ")
	private String description;
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	public savetravelsmodel() {

	}

	public savetravelsmodel(Long id,
			@NotNull @Size(min = 5, max = 200, message = "the expenseName name should be at lest 5 character ") String expenseName,
			@NotNull @Size(min = 5, max = 200, message = "the vendor name should be at lest 5 character ") String vendor,
			@Min(value = 1, message = "The amount number should be at least 1.") @Max(value = 100000, message = "The amount number should not exceed 100000.") Integer amount,
			@Size(min = 5, max = 200, message = "the description  should be at lest 5 character ") String description) {
		super();
		this.id = id;
		this.expenseName = expenseName;
		this.vendor = vendor;
		this.amount = amount;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpenseName() {
		return expenseName;
	}

	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
