package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;
@RestController
public class MobileController {
	@Autowired
	MobileService ms;
	@PostMapping(value="/setMobile")
	public String setMobile(@RequestBody Mobile mc) {
		return ms.setMobile(mc);
	}
	@PostMapping(value="/setAllMobile")
	public String setAllMobile(@RequestBody List<Mobile> mc) {
		return ms.setAllMobile(mc);
	}
	@GetMapping(value="/getAllMobile")
	public List<Mobile> getAllMobile(){
		return ms.getAllMobile();
	}
//	@GetMapping(value="/getValueById/{a}")
//	public Mobile getValueById(@PathVariable int a){
//		return ms.getValueById(a);
//	}
	@GetMapping(value="/getValueByBrand/{a}")
	public List<Mobile> getMobileByBrand(@PathVariable String a){
		return ms.getMobileByBrand(a);
	}
	@GetMapping(value="/getMobileByPrice/{b}")
	public List<Mobile> getMobileByPrice(@PathVariable int b){
		return ms.getMobileByPrice(b);
	}
}
