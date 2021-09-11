package com.billing.billing.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.lang.NonNull;

@Entity
@Table(name="product")
public class Product {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;

	@NonNull
	private String name;
    private String description;

	@Value("${some.key:1}")
	private Byte statusId;
	private Date createdAt = new Date();
    private Date modifyAt;


	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte getStatusId() {
		return statusId;
	}

	public void setStatusId(Byte statusId) {
		this.statusId = statusId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

    public Date getModifyAt() {
		return modifyAt;
	}

	public void setModifyAt(Date createdAt) {
		this.modifyAt = createdAt;
	}
}
