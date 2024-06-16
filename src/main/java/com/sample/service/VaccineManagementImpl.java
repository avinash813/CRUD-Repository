package com.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Entity.VaccineInfo;
import com.sample.dao.Repository;

@Service
public class VaccineManagementImpl implements VaccineManagement {
	
	@Autowired
	Repository repo;
	@Override
	public VaccineInfo registerVaccineDetails(VaccineInfo vaccine) {
		VaccineInfo vaccineInfo = repo.save(vaccine);
		System.out.println("Details Registered Successfully");
		return vaccineInfo;
	}

	@Override
	public Iterable<VaccineInfo> registerMultipleVaccines(Iterable<VaccineInfo> vaccineList) {
		Iterable<VaccineInfo> vL = repo.saveAll(vaccineList);
		return vL;
	}

	@Override
	public Long getVaccineCount() {
		return repo.count();
	}

	@Override
	public Boolean checkAvailability(Integer id) {
		return repo.existsById(id);
	}

	@Override
	public Iterable<VaccineInfo> getAllVaccineInfo() {
		return repo.findAll();
	}

	@Override
	public Iterable<VaccineInfo> getAllVaccineInfoByIds(Iterable<Integer> idList) {
		
		return repo.findAllById(idList);
	}

	@Override
	public Optional<VaccineInfo> getVaccineById(Integer id) {
		
		return repo.findById(id);
	
	}

	@Override
	public String removeVaccineById(Integer id) {
		Optional<VaccineInfo> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "Record deleted with id " + id;
		}
		return "There is no record with id " + id;
			
	}

	@Override
	public String removeVaccinesByIds(Iterable<Integer> ids) {
		Iterable<VaccineInfo> list = repo.findAllById(ids);
		int count = ((List)ids).size();
		if(count == ((List)list).size())
		{
			repo.deleteAllById(ids);
			return "Records deleted";
		}
		return "Problem, Some records may not be there";
	}

	@Override
	public String removeVaccineByObject(VaccineInfo vaccine) {
		Optional<VaccineInfo> optional = repo.findById(vaccine.getId());
		if(optional.isPresent())
		{
			repo.delete(vaccine);
			return "Vaccine is Deleted";
		}
		return "Vaccine not found";
	}

}
