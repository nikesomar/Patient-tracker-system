package com.cognizant.pts.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.service.DoctorServiceImpl;

@Component("DoctorValidator")
public class DoctorValidator implements Validator {
	
		@Autowired 
		private DoctorServiceImpl doctorService;
		@Override
		public boolean supports(Class<?> clazz) {
			return Doctor.class.isAssignableFrom(clazz);
		}

		@Override
		public void validate(Object target, Errors errors) {
			Doctor doctor=(Doctor) target;
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "doctorId", "doctorId.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "age.required");
			if(doctor.getAge()<18)
				errors.rejectValue("age","invalidAge.value");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required");
			//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dob", "password.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber", "contactNumber.required");
			//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "alternate_contact_number", "alternate_contact_number.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "emailId.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "addressLine1", "addressLine1.required");
			//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address_line2", "address_line2.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "city.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "state.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zipCode", "zipCode.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "degree", "degree.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "speciality", "speciality.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "workHours", "workHours.required");
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hospitalClinicName", "hospitalClinicName.required");
			
		
			
		}

	}

