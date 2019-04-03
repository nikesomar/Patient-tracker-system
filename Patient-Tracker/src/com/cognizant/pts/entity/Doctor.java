package com.cognizant.pts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;//
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Doctor")
/*@NamedQueries(
		{ @NamedQuery(name="findAllDoctors", query="select o from Doctor o"),
		}
	)*/
public class Doctor {

	@Id
	@GenericGenerator(name="DOCTORSEQ",strategy="com.cognizant.pts.dao.DoctorIdGenerator")
	@GeneratedValue(generator="DOCTORSEQ")
	@Column(name = "doctor_id")
	private String doctorId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "age")

	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "DoB")
	private String dob;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "alternate_contact_number")
	private String alternateContactNumber;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "address_line1")
	private String addressLine1;

	@Column(name = "address_line2")
	private String addressLine2;

	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	

	@Column(name = "zip_code")
	private long zipCode;

	@Column(name = "degree")
	private String degree;

	@Column(name = "speciality")
	private String speciality;

	@Column(name = "work_hours")
	private String workHours;

	@Column(name = "hospital_clinic_name")
	private String hospitalClinicName;

	public String getHospitalClinicName() {
		return hospitalClinicName;
	}

	public void setHospitalClinicName(String hospitalClinicName) {
		this.hospitalClinicName = hospitalClinicName;
	}

	public Doctor() {
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAlternateContactNumber() {
		return alternateContactNumber;
	}

	public void setAlternateContactNumber(String alternateContactNumber) {
		this.alternateContactNumber = alternateContactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}



	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getWorkHours() {
		return workHours;
	}

	public void setWorkHours(String workHours) {
		this.workHours = workHours;
	}

	
}
