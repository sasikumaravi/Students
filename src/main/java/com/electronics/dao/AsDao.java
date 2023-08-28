package com.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Ac;
import com.electronics.repository.AcRepository;

@Repository
public class AsDao {
	@Autowired
	AcRepository ar;
	public String setAc(Ac ac) {
		ar.save(ac);
		return "Saved";
	}
	public String setAllAc(List<Ac> acs) {
		ar.saveAll(acs);
		return "saved";
	}
	public Ac getById(int x) {
		return ar.findById(x).get();//We need to add optional method
	}
}
