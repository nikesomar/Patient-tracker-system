package com.cognizant.pts.dao;

import java.math.BigDecimal;
import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.model.DoctorModel;

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
	public boolean updateDoctor(Doctor doctor){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(doctor);
		tx.commit();
		session.close();

		return true;
	}
	
	@Override
	public Doctor viewOneDoctor(String doctorId) {
		Session session = sessionFactory.openSession();
		Query query=session.createQuery("from Doctor o where doctorId=:doctorId ");
		query.setString("doctorId",doctorId);
		Doctor doctor=(Doctor)query.uniqueResult();
		session.close();
		return doctor;
	}
	@Override
	public boolean addDoctor(Doctor doctor){
		Session session = sessionFactory.openSession();
		generateDoctorId();
		Transaction tx = session.beginTransaction();
		session.persist(doctor);
		tx.commit();
		session.close();
		return true;
	}
	public void generateDoctorId()
	{
		Session session=sessionFactory.openSession();
		Query query=session.createSQLQuery("select DOCTORSEQ.nextval from DUAL");
		Long key=((BigDecimal)query.uniqueResult()).longValue();
		StoreDoctorId.addDoctorId(key.intValue());
	}
	

	}

