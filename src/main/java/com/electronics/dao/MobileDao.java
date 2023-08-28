package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Mobile;
import com.electronics.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
	public String setMobile(Mobile md) {
		mr.save(md);
		return "stored";
	}
	public String setAllMobile(List<Mobile> md) {
		mr.saveAll(md);
		return "successfully stored";
	}
	public List<Mobile> getAllMobile(){
		return mr.findAll();
	}
//	public Optional<Mobile> getValueById(int md) {
//		return mr.findById(md);
//	}
	public List<Mobile> getMobileByBrand(String a){
		return mr.getMobileByBrand(a);
	}
	public List<Mobile> getMobileByPrice(int b){
		return mr.getMobileByPrice(b);
	}
}
