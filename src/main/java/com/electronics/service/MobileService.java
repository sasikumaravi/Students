package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.MobileDao;
import com.electronics.entity.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao md;
	public String setMobile(Mobile ms) {
		return md.setMobile(ms);
	}
	public String setAllMobile(List<Mobile> ms) {
		return md.setAllMobile(ms);
	}
	public List<Mobile> getAllMobile(){
		return md.getAllMobile();
	}
//	public Mobile getValueById(int ms) {
//		return md.getValueById(ms);
//	}
	public List<Mobile> getMobileByBrand(String ms){
		return md.getMobileByBrand(ms);
	}
	public List<Mobile> getMobileByPrice(int ms){
		return md.getMobileByPrice(ms);
	}
}
