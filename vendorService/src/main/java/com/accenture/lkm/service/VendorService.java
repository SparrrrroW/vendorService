package com.accenture.lkm.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.VendorBean;


public interface VendorService {
	
	Collection<VendorBean> getVendorList() throws Exception;
	
	VendorBean getVendorById(String id) throws Exception;

	VendorBean addVendor(VendorBean bean) throws Exception;
	
	VendorBean updateVendor(VendorBean bean) throws Exception;
}
