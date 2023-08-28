package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.dao.AsDao;
import com.electronics.entity.Ac;

@Service
public class AcService {
	@Autowired
	AsDao ad;
	public String setAc(Ac ac) {
		return ad.setAc(ac);
	}
	public String setAllAc(List<Ac> acs) {
		return ad.setAllAc(acs);
	}
	public Ac getById(int x) {
		return ad.getById(x);
	}
	
}
