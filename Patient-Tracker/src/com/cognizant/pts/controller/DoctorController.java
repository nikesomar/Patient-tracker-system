package com.cognizant.pts.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.pts.entity.Doctor;
import com.cognizant.pts.model.DoctorModel;
import com.cognizant.pts.service.DoctorService;
import com.cognizant.pts.validator.DoctorValidator;
@SessionAttributes({"doctorList","gender","oneDoctor","workHoursList"})
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
	
	@RequestMapping(value = "updatedoctor.htm", method = RequestMethod.POST)
	public ModelAndView updateDoctor(@Valid@ModelAttribute("oneDoctor") DoctorModel doctorModel, Errors errors ) {
		ModelAndView mv = new ModelAndView();
		ValidationUtils.invokeValidator(doctorValidator,doctorModel,errors);
		if (errors.hasErrors())
	         mv.setViewName("viewonedoctor");
		else{
		boolean doctorPersist = doctorService.updateDoctor(doctorModel);
		if (doctorPersist) {
			mv.addObject("status", "Doctor Updated");
			mv.setViewName("adddoctor");
		} else {
			mv.addObject("status", "Updation failed");
			mv.setViewName("adddoctor");
		}}
		return mv;
	}
	@RequestMapping(value = "adddoctor.htm", method = RequestMethod.POST)
	public ModelAndView persistDoctor(@ModelAttribute("doctorModel") DoctorModel doctorModel, Errors errors ) {
		ModelAndView mv = new ModelAndView();
		ValidationUtils.invokeValidator(doctorValidator,doctorModel,errors);
		if (errors.hasErrors())
	         mv.setViewName("adddoctor");
		else{
		boolean doctorPersist = doctorService.persistDoctor(doctorModel);
		if (doctorPersist) {
			mv.addObject("status", "Doctor Registerred");
			mv.setViewName("adddoctor");
		} else {
			mv.addObject("status", "Doctor not Registerred");
			mv.setViewName("adddoctor");
		}}
		return mv;
	}

	@RequestMapping(value = "viewonedoctor.htm", method = RequestMethod.GET)
	public ModelAndView viewOneDoctor(ModelMap map,@RequestParam("doctorId")String doctorId )
	{
		ModelAndView mv = new ModelAndView();
		List<String> genderList=new ArrayList<>();
		genderList.add("Male");
		genderList.add("Female");
		mv.addObject("gender", genderList);
		List<String> workHoursList=new ArrayList<>();
		workHoursList.add("09:00-12:00");
		workHoursList.add("13:00-16:00");
		workHoursList.add("14:00-17:00");
		workHoursList.add("10:00-13:00");
		mv.addObject("workHours", workHoursList);
		DoctorModel doctorModel=doctorService.viewOneDoctor(doctorId);
		map.addAttribute("oneDoctor",doctorModel);
		mv.setViewName("viewonedoctor");
		return mv;
	}
	@ModelAttribute("doctorModel")
	public DoctorModel createDoctorObject() {
		DoctorModel doctorModel = new DoctorModel();
		return doctorModel;
	}
}
