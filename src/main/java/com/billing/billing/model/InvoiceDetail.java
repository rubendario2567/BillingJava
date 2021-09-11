package com.billing.billing.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="invoice_detail")
public class InvoiceDetail {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long invoiceDetailId;

	@NonNull
    private double quantity;
    private double price;
	private Byte statusId;
	private Date createdAt = new Date();


	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "invoiceId")
	private Invoice invoice;

    public long getinvoiceDetailId() {
		return invoiceDetailId;
	}

	public void setinvoiceDetailId(long invoiceDetailId) {
		this.invoiceDetailId = invoiceDetailId;
	}

    public double getquantity() {
		return quantity;
	}

	public void setquantity(double quantity) {
		this.quantity = quantity;
	}

    public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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
}