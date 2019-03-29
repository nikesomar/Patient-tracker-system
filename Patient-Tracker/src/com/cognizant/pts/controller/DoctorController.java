package com.cognizant.pts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.service.DoctorService;
import com.cognizant.pts.validator.DoctorValidator;

@Controller
public class DoctorController {
	@Autowired 
	private DoctorValidator doctorValidator;
	
	@Autowired
	private DoctorService doctorService;

	@RequestMapping(value = "index.htm", method = RequestMethod.GET)
	public ModelAndView viewDoctors() {
		List<Doctor> doctorList = doctorService.getAllDoctors();
		ModelAndView mv = new ModelAndView();
		mv.addObject("doctorList", doctorList);
		mv.setViewName("viewDoctor");
		return mv;
	}

	@RequestMapping(value = "viewDoctor.htm", method = RequestMethod.POST)
	public ModelAndView viewDoctorsagain() {
		List<Doctor> doctorList = doctorService.getAllDoctors();
		ModelAndView mv = new ModelAndView();
		mv.addObject("doctorList", doctorList);
		mv.setViewName("viewDoctor");
		return mv;
	}

	@RequestMapping(value = "adddoctorform.htm", method = RequestMethod.POST)
	public String loadAddDoctorForm() {
		return "adddoctor";
	}

	@RequestMapping(value = "adddoctor.htm", method = RequestMethod.POST)
	public ModelAndView persistDoctor(@ModelAttribute("doctor") Doctor doctor, Errors errors ) {
		ModelAndView mv = new ModelAndView();
		ValidationUtils.invokeValidator(doctorValidator,doctor,errors);
		if (errors.hasErrors())
	         mv.setViewName("adddoctor");
		else{
		boolean doctorPersist = doctorService.addDoctor(doctor);
		if (doctorPersist) {
			mv.addObject("status", "Product Registerred");
			mv.setViewName("adddoctor");
		} else {
			mv.addObject("status", "Product not Registerred");
			mv.setViewName("adddoctor");
		}}
		return mv;
	}

	@ModelAttribute("doctor")
	public Doctor createDoctorObject() {
		Doctor doctor = new Doctor();
		return doctor;
	}
}
