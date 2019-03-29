package com.cognizant.pts.dao;
import java.util.List;

import com.cognizant.pts.entity.Doctor;

public interface DoctorDAO {

	List<Doctor> getAllDoctors();
	boolean updateDoctor();
	boolean deleteDoctor();
	boolean addDoctor(Doctor doctor);
}
