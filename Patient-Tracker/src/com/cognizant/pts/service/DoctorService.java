package com.cognizant.pts.service;

import java.util.List;

import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.model.DoctorModel;

public interface DoctorService {
	
	List<Doctor> getAllDoctors();
	boolean persistDoctor(DoctorModel doctorModel);
	DoctorModel viewOneDoctor(String doctorId);
	boolean updateDoctor(DoctorModel doctorModel);

}
