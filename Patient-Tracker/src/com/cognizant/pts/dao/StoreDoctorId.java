package com.cognizant.pts.dao;

import java.util.ArrayList;
import java.util.List;

public class StoreDoctorId {
	static List<Integer> idList=new ArrayList<Integer>();
	public static void addDoctorId(int id){
		idList.add(0,id);
	}
	public static int getDoctorId(){
		return idList.get(0);
	}
}
