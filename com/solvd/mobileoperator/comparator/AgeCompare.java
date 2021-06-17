package com.solvd.mobileoperator.comparator;

import com.solvd.mobileoperator.staff.Staff;
import java.util.Comparator;

public class AgeCompare implements Comparator<Staff> {
	public int compare(Staff obj1, Staff obj2) {
		return obj1.showAge().compareTo(obj2.showAge());
	} 
}
