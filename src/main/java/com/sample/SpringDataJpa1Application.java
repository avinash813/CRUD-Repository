package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sample.Entity.VaccineInfo;
import com.sample.service.VaccineManagementImpl;

@SpringBootApplication
public class SpringDataJpa1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa1Application.class, args);
		VaccineManagementImpl obj = context.getBean(VaccineManagementImpl.class);
//		VaccineInfo vaccineInfo = new VaccineInfo("Pfizer","USA", 15000);
//		System.out.println(vaccineInfo);
//	    obj.registerVaccineDetails(vaccineInfo);
//		
//		ArrayList<VaccineInfo> vaccineList = new ArrayList<VaccineInfo>();
//		vaccineList.add(new VaccineInfo("Sputnik", "Russia",20000));
//		vaccineList.add(new VaccineInfo("Covaxin", "India",10000));
//		System.out.println(obj.registerMultipleVaccines(vaccineList));
		
//		System.out.println("The no. of records present are: " +obj.getVaccineCount());
//		Integer a = 1;
//		
//		boolean bool = obj.checkAvailability(a);
//		if(bool) {
//			System.out.println("Record with id "+ a +" is present");
//		}
//		else {
//		    System.out.println("Record with id "+ a +" is not present");
//		}
//		
//		System.out.println(obj.getAllVaccineInfo());
//		
//		ArrayList<Integer> requiredIds = new ArrayList<>();
//		requiredIds.add(6);
//		requiredIds.add(3);
//		System.out.println(obj.getAllVaccineInfoByIds(requiredIds));
		
		Integer id = 7;
		
//		Optional<VaccineInfo> optional = obj.getVaccineById(id);
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
//        System.out.println(optional.orElseGet(() -> new VaccineInfo()));
		
//        System.out.println(obj.getVaccineById(id).orElse(new VaccineInfo()));
		
//		System.out.println(obj.getVaccineById(id).orElseGet(() -> new VaccineInfo()));
		
//		System.out.println(obj.removeVaccineById(id));
		
		
//		List<Integer> ids = new ArrayList<>();
//		ids.add(6);
//		ids.add(7);
//		System.out.println(obj.removeVaccinesByIds(ids));
		
		VaccineInfo vaccine = new VaccineInfo();
		vaccine.setId(7);
		vaccine.setCountry("germany");
		vaccine.setVaccineName("jakarta");
		vaccine.setPrice(13000);
		System.out.println(obj.removeVaccineByObject(vaccine));
		
		
	}

}
