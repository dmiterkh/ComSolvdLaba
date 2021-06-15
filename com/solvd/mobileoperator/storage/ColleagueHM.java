package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.staff.Staff;

import java.util.Map;
import java.util.HashMap;

public class ColleagueHM {

	Map<Staff, Integer>  mapOfStaff;
	
	public ColleagueHM () {
		mapOfStaff = new HashMap<Staff, Integer>();	
	}

	public void setMapOfStaff(Staff staff, int number) {
		mapOfStaff.put(staff, number);		
	}	
		
	public Map<Staff, Integer> getMapOfStaff() {
		return mapOfStaff;		
	}
}