package com.sample.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.sample.Entity.VaccineInfo;

public interface Repository extends CrudRepository<VaccineInfo, Integer> {

	
}
