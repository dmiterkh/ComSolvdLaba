package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.staff.Staff;

import java.util.List;
import java.util.ArrayList;
//import java.util.LinkedList;

public class ColleagueAr {

	public List<Staff> listOfStaff;
	
	public ColleagueAr () {
		listOfStaff = new ArrayList<>();		
	}

	public void setListOfStaff(Staff staff) {
		listOfStaff.add(staff);		
	}	
		
	public List<Staff> getListOfStaff() {
		return listOfStaff;		
	}
}
