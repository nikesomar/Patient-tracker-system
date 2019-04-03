package com.cognizant.pts.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.model.DoctorModel;
import com.cognizant.pts.service.DoctorServiceImpl;

@Component("DoctorValidator")
public class DoctorValidator implements Validator {

	@Autowired
	private DoctorServiceImpl doctorService;

	@Override
	public boolean supports(Class<?> clazz) {
		return DoctorModel.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		DoctorModel doctorModel = (DoctorModel) target;
		String Email_pattern = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"+ "A-Z]{2,7}$";
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "firstName.required");
		if (doctorModel.getFirstName().matches("^[a-zA-Z]*$") == false)
			errors.rejectValue("firstName", "invalidFirstName.value");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "lastName.required");
		if (doctorModel.getLastName().matches("^[a-zA-Z]*$") == false)
			errors.rejectValue("lastName", "invalidLastName.value");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "age.required");
		if (doctorModel.getAge() < 18 || doctorModel.getAge() > 70)
			errors.rejectValue("age", "invalidAge.value");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "gender.required");

		if(doctorModel.getDob().isEmpty()==false)
		{
		Pattern dob_pat = Pattern.compile("^([0-9]{2})-([0-9]{2})-([0-9]{4})$");
		if(dob_pat.matcher(doctorModel.getDob()).matches()==false)	
		errors.rejectValue("dob", "invaliddob.value");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber", "contactNumber.required");
		if(doctorModel.getContactNumber().isEmpty()==false)
		{
		Pattern contactNumber_pat = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		//Matcher m = contactNumber_pat.matcher(doctorModel.getContactNumber());
		if(contactNumber_pat.matcher(doctorModel.getContactNumber()).matches()==false)	
		errors.rejectValue("contactNumber", "invalidContactNumber.value");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "alternateContactNumber", "AlternateContactNumber.required");
		if(doctorModel.getAlternateContactNumber().isEmpty()==false)
		{
			Pattern altcontactNumber_pat= Pattern.compile("(0/91)?[7-9][0-9]{9}");
			//Matcher n = altcontactNumber_pat.matcher(doctorModel.getAlternateContactNumber());
			if(altcontactNumber_pat.matcher(doctorModel.getAlternateContactNumber()).matches()==false)	
			errors.rejectValue("alternateContactNumber", "invalidAlternateContactNumber.value");
		}
		
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "emailId.required");
		if(doctorModel.getEmailId().isEmpty()==false)
		{
		Pattern eMailPat = Pattern.compile(Email_pattern);
		if (eMailPat.matcher(doctorModel.getEmailId()).matches() == false)
			errors.rejectValue("emailId", "invalidEmail.value");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "addressLine1", "addressLine1.required");
		// ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address_line2",
		// "address_line2.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "city.required");
		if (doctorModel.getCity().matches("^[a-zA-Z]*$") == false)
			errors.rejectValue("city", "invalidCity.value");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "state.required");
		if (doctorModel.getState().matches("^[a-zA-Z]*$") == false)
			errors.rejectValue("state", "invalidState.value");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zipCode", "zipCode.required");
		if (doctorModel.getZipCode() < 100000 || doctorModel.getZipCode() > 999999)
			errors.rejectValue("zipCode", "invalidZip.value");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "degree", "degree.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "speciality", "speciality.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "workHours", "workHours.required");

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "hospitalClinicName", "hospitalClinicName.required");
		System.out.println("error"+errors);

	}

}
