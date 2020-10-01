package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.accenture.lkm.business.bean.VendorBean;
import com.accenture.lkm.entity.VendorEntity;

@Repository
public class VendorDAOWrapper{
	
	@Autowired
	private VendorDAO vendorDao;
	
	
	public List<VendorBean> getVendorList(){
		List<VendorBean> vendorBeanList = new ArrayList<VendorBean>();
		List<VendorEntity> vendorEntityList = vendorDao.findAll();
		for (VendorEntity e : vendorEntityList) {
			VendorBean bean = new VendorBean();
			BeanUtils.copyProperties(e, bean);
			vendorBeanList.add(bean);
		}
		return vendorBeanList;
	}
	
	public VendorBean getVendorById(String id){
		VendorBean bean = new VendorBean();
		VendorEntity entity = vendorDao.getOne(id);
		BeanUtils.copyProperties(entity, bean);
		return bean;
		
	}
	
	public VendorEntity addVendor(VendorBean bean) {
		VendorEntity entity = new VendorEntity();
		BeanUtils.copyProperties(bean, entity);
		return vendorDao.save(entity);
	}
	
	public VendorBean updateVendor(VendorBean bean) {
		return entityToBean(vendorDao.save(beanToEntity(bean)));
	}
	
	VendorBean entityToBean(VendorEntity entity){
		VendorBean bean = new VendorBean();
		BeanUtils.copyProperties(entity, bean);
		return bean;
	}
	
	VendorEntity beanToEntity(VendorBean bean) {
		VendorEntity entity = new VendorEntity();
		BeanUtils.copyProperties(bean, entity);
		return entity;
	}

	
}
