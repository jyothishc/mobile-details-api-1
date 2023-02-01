package com.jyotheesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jyotheesh.model.Mobile;

@Repository
public interface MobileRepository extends JpaRepository<Mobile, Integer>{

	@Query(value = "select * from mobile_details cd where cd.name=:name",nativeQuery = true)
	public Mobile findByMobileName(@Param("name")String mobileName);
	

}
