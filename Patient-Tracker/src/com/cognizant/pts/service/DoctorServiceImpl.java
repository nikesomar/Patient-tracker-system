package com.cognizant.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.pts.dao.DoctorDAO;
import com.cognizant.pts.entity.Doctor;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorDAO doctorDAO;
	@Override
	public List<Doctor> getAllDoctors() {
		return doctorDAO.getAllDoctors();
	}

	/*@Override
	public boolean updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorDAO.updateDoctor();
	}*/

	
	@Override
	public boolean addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		 return doctorDAO.addDoctor(doctor);
	}




}
