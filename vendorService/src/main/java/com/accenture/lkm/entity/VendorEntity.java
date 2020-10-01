package com.accenture.lkm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class VendorEntity {
	
	@Id
	@Column(name = "vendor_id")
	private String vendor_id;
	@Column(name = "vendor_name")
	private String vendor_name;
	@Column(name = "vendor_address")
	private String vendor_address;
	@Column(name = "contact_number")
	private int contact_number;
	public int getContact_number() {
		return contact_number;
	}
	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}
	@Column(name = "contact_person")
	private String contact_person;
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getVendor_address() {
		return vendor_address;
	}
	public void setVendor_address(String vendor_address) {
		this.vendor_address = vendor_address;
	}
	
	
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	
	
	

}
