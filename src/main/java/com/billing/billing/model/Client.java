package com.billing.billing.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

@Entity
@Table(name="client")
public class Client {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clientId;

	@NonNull
	private String name;

    @NonNull
	private String nit;
    private String address;
    private String email;
    private String phone;
	
	@Value("${some.key:1}")
	private Byte statusId;
	private Date createdAt = new Date();
    private Date modifyAt;

    public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public String getClientNit() {
		return nit;
	}

	public void setclientNit(String nit) {
		this.nit = nit;
	}

    public String getAddres() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
