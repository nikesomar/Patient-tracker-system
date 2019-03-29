package com.cognizant.pts.service;

import java.util.List;

import com.cognizant.pts.entity.Doctor;

public interface DoctorService {
	
	List<Doctor> getAllDoctors();
	//boolean updateDoctor(Doctor doctor);
	
	boolean addDoctor(Doctor doctor);

}
