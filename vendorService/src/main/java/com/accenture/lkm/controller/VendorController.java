package com.accenture.lkm.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.lkm.business.bean.VendorBean;
import com.accenture.lkm.service.VendorService;
import com.accenture.lkm.service.VendorServiceImpl;

@RestController
// extender ver of @controller
// automatically converts objects to xml or json
public class VendorController {
	
	@Autowired
	private VendorService service;
	

	@RequestMapping(value = "vendor/controller/getVendorList", 
			produces = { "application/json", "application/xml" }
			, method = RequestMethod.GET)
	public ResponseEntity<Collection<VendorBean>> getVendorList() throws Exception{
		Collection<VendorBean> vendorList = service.getVendorList();
		return new ResponseEntity<Collection<VendorBean>>(vendorList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "vendor/controller/getVendorById/{id}", produces= MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public VendorBean getVendorById(@PathVariable("id") String id) throws Exception{
		VendorBean bean = service.getVendorById(id);
		return bean;
	}
	
	@RequestMapping(value = "vendor/controller/addVendor", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VendorBean> addVendor(@RequestBody VendorBean bean) throws Exception{
		return new ResponseEntity<VendorBean>(service.addVendor(bean), HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "vendor/controller/updateVendor", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<VendorBean> updateVendor(@RequestBody VendorBean bean) throws Exception{
		return new ResponseEntity<VendorBean>(service.updateVendor(bean), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/")
	public String intro(){
		return "Welcome to Vendor Service";
	}
	
	
	
}
