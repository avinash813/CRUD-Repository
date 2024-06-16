package com.sample.service;

import java.util.Optional;

import com.sample.Entity.VaccineInfo;

public interface VaccineManagement {
	
	public VaccineInfo registerVaccineDetails(VaccineInfo vaccine);
	public Iterable<VaccineInfo> registerMultipleVaccines(Iterable<VaccineInfo> vaccineList);
	public Long getVaccineCount();
	public Boolean checkAvailability(Integer id);
	public Iterable<VaccineInfo> getAllVaccineInfo();
    public Iterable<VaccineInfo> getAllVaccineInfoByIds(Iterable<Integer> idList);
    public Optional<VaccineInfo> getVaccineById(Integer id);
    public String removeVaccineById(Integer id);
    public String removeVaccinesByIds(Iterable<Integer> ids);
    public String removeVaccineByObject(VaccineInfo vaccine);
	
	

}
