package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Ac;
import com.electronics.service.AcService;

@RestController
public class AcController {
	@Autowired
	AcService as;
	@PatchMapping(value="/setAc")
	public String setAc(@RequestBody Ac ac) {
		return as.setAc(ac);
	}
	
	@PostMapping(value="/setAllAc")
	public String setAllAc(@RequestBody List<Ac> acs) {
		return as.setAllAc(acs);
	}
	
	@GetMapping("/getById/{x}")
	public Ac getById(@PathVariable int x) {
		return as.getById(x);
	}

}
  