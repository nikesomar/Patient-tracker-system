package com.cognizant.pts.dao;
import java.util.List;

import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.model.DoctorModel;

public interface DoctorDAO {

	List<Doctor> getAllDoctors();
	boolean updateDoctor(Doctor doctor);
	boolean addDoctor(Doctor doctor);
	Doctor viewOneDoctor(String doctorId);
}
