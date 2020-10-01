package com.accenture.lkm.business.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VendorBean {
	private String vendor_id;
	private String vendor_name;
	private String vendor_address;
	private int contact_number;
	public int getContact_number() {
		return contact_number;
	}
	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}

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
