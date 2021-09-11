package com.billing.billing.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

@Entity
@Table(name="invoice")
public class Invoice {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long invoiceId;

	@NonNull
	private Date saleDate;
    private double amount;
    private double tax;
	private Byte statusId;
	private Date createdAt = new Date();
    private Date modifyAt;


	@ManyToOne
	@JoinColumn(name = "clientId")
	private Client client;

	public long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(long invoiceId) {
		this.invoiceId = invoiceId;
	}

    public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

    public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

    public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Value("${some.key:1}")
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
