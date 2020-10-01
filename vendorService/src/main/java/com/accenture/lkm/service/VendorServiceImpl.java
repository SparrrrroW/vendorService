package com.accenture.lkm.service;

import java.util.Collection;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.VendorBean;
import com.accenture.lkm.dao.VendorDAOWrapper;
import com.accenture.lkm.entity.VendorEntity;

@Service
public class VendorServiceImpl implements VendorService{
	
	@Autowired
	VendorDAOWrapper dao;

	@Override
	public Collection<VendorBean> getVendorList() throws Exception{
		Collection<VendorBean> beanList = dao.getVendorList();
//		System.out.println(beanList);
		for (VendorBean vendorBean : beanList) {
			System.out.println(vendorBean.getContact_number());
		}
		return beanList;
	}

	@Override
	public VendorBean getVendorById(String id) throws Exception {
		return dao.getVendorById(id);
	}

	@Override
	public VendorBean addVendor(VendorBean bean) throws Exception {
		VendorBean newBean = new VendorBean();
		VendorEntity entity = dao.addVendor(bean);
		BeanUtils.copyProperties(entity, newBean);	
		return newBean;
	}

	@Override
	public VendorBean updateVendor(VendorBean bean) throws Exception {
		return dao.updateVendor(bean);
	}
	
	
	
	
	
	

}
