package com.electronics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	@Query(value="select* from mobile_details where brand like ?", nativeQuery=true)
	List<Mobile> getMobileByBrand(String a);
	@Query(value="select* from mobile_details where price > ?",nativeQuery=true)
	List<Mobile> getMobileByPrice(int b);
	
}
