package com.capgimini.empspringboot.reposatory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capgimini.empspringboot.dto.EmployeeBean;

public interface EmployeeRepository extends  JpaRepository<EmployeeBean, Integer>{

	public EmployeeBean findByEmail(String email);
	@Query("from EmployeeBean where name=:key or email=:key")
	public List<EmployeeBean> findByKey(@Param("key")String Key);
	
	@Transactional
	@Modifying
	@Query("Update EmployeeBean set password=:psd where id=:id")
	public void changePassword(@Param("id")int id, @Param("psd") String password);

}
