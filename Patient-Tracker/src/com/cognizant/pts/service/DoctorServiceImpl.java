package com.cognizant.pts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.pts.dao.DoctorDAO;
import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.model.DoctorModel;
@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorDAO doctorDAO;
	@Override
	public List<Doctor> getAllDoctors() {
		return doctorDAO.getAllDoctors();
	}

	@Override
	public boolean updateDoctor(DoctorModel doctorModel) {
		// TODO Auto-generated method stub
		Doctor doctor=new Doctor();
		doctor.setDoctorId(doctorModel.getDoctorId());

		doctor.setFirstName(doctorModel.getFirstName());
		doctor.setLastName(doctorModel.getLastName());
		doctor.setAge(doctorModel.getAge());
		doctor.setGender(doctorModel.getGender());
		doctor.setDob(doctorModel.getDob());
		doctor.setContactNumber(doctorModel.getContactNumber());
		doctor.setAlternateContactNumber(doctorModel.getAlternateContactNumber());
		doctor.setEmailId(doctorModel.getEmailId());
		doctor.setAddressLine1(doctorModel.getAddressLine1());
		doctor.setAddressLine2(doctorModel.getAddressLine2());
		doctor.setCity(doctorModel.getCity());
		doctor.setZipCode(doctorModel.getZipCode());
		doctor.setState(doctorModel.getState());
		doctor.setDegree(doctorModel.getDegree());
		doctor.setSpeciality(doctorModel.getSpeciality());
		doctor.setWorkHours(doctorModel.getWorkHours());
		doctor.setHospitalClinicName(doctorModel.getHospitalClinicName());

		return doctorDAO.updateDoctor(doctor);
	}

	
	@Override
	public boolean persistDoctor(DoctorModel doctorModel) {
		// TODO Auto-generated method stub
		Doctor doctor=new Doctor();
		//doctor.setDoctorId(doctorModel.getDoctorId());
		doctor.setFirstName(doctorModel.getFirstName());
		doctor.setLastName(doctorModel.getLastName());
		doctor.setAge(doctorModel.getAge());
		doctor.setGender(doctorModel.getGender());
		doctor.setDob(doctorModel.getDob());
		doctor.setContactNumber(doctorModel.getContactNumber());
		doctor.setAlternateContactNumber(doctorModel.getAlternateContactNumber());
		doctor.setEmailId(doctorModel.getEmailId());
		doctor.setAddressLine1(doctorModel.getAddressLine1());
		doctor.setAddressLine2(doctorModel.getAddressLine2());
		doctor.setCity(doctorModel.getCity());
		doctor.setZipCode(doctorModel.getZipCode());
		doctor.setState(doctorModel.getState());
		doctor.setDegree(doctorModel.getDegree());
		doctor.setSpeciality(doctorModel.getSpeciality());
		doctor.setWorkHours(doctorModel.getWorkHours());
		doctor.setHospitalClinicName(doctorModel.getHospitalClinicName());


		

		
		 return doctorDAO.addDoctor(doctor);
	}

	@Override
	public DoctorModel viewOneDoctor(String doctorId) {
		
			Doctor doctor=doctorDAO.viewOneDoctor(doctorId);
			DoctorModel doctorModel=new DoctorModel();
			doctorModel.setDoctorId(doctor.getDoctorId());
			doctorModel.setFirstName(doctor.getFirstName());
			doctorModel.setLastName(doctor.getLastName());
			doctorModel.setAge(doctor.getAge());
			doctorModel.setGender(doctor.getGender());
			doctorModel.setDob(doctor.getDob());
			doctorModel.setContactNumber(doctor.getContactNumber());
			doctorModel.setAlternateContactNumber(doctor.getAlternateContactNumber());
			doctorModel.setEmailId(doctor.getEmailId());
			doctorModel.setAddressLine1(doctor.getAddressLine1());
			doctorModel.setAddressLine2(doctor.getAddressLine2());
			doctorModel.setCity(doctor.getCity());
			doctorModel.setZipCode(doctor.getZipCode());
			doctorModel.setState(doctor.getState());
			doctorModel.setDegree(doctor.getDegree());
			doctorModel.setSpeciality(doctor.getSpeciality());
			doctorModel.setWorkHours(doctor.getWorkHours());
			doctorModel.setHospitalClinicName(doctor.getHospitalClinicName());
			
			return doctorModel;
		}
	}
	
	





