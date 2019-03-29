package com.cognizant.pts.dao;

import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.pts.entity.Doctor;

@Repository("DoctorDAOImpl")
public class DoctorDAOImpl implements DoctorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Doctor> getAllDoctors() {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Doctor");
		List<Doctor> doctorList=query.list();
		session.close();
		return doctorList;
	}
	@Override
	public boolean updateDoctor(){
		return false;
	}
	@Override
	public boolean addDoctor(Doctor doctor){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(doctor);
		tx.commit();
		session.close();
		return true;
	}
	
	@Override
	public boolean deleteDoctor(){
		return false;
	}
}
