package com.solvd.mobileoperator.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.solvd.mobileoperator.staff.Staff;
import com.solvd.mobileoperator.staff.Employee;
import com.solvd.mobileoperator.staff.BadEmployee;
import com.solvd.mobileoperator.staff.Boss;
import com.solvd.mobileoperator.staff.ExpiriencedApplicant;

public class ColleagueColl {
	
	
	private List<Employee> listOfEmployees;
	private List<BadEmployee> listOfBadEmployees;
	
	private Set<Boss>  setOfBosses;
	
	private List<Staff> listOfStaff;
	private Set<Staff> setOfStaff;
		
//	List< ? extends Staff> listOfStaff;
	
	private Map<Integer, Staff>  mapOfStaff;
	
	public ColleagueColl() {
		listOfEmployees  = new ArrayList<Employee>();
		listOfBadEmployees  = new LinkedList<BadEmployee>();
		
		setOfBosses = new HashSet<Boss>();
		
		listOfStaff = new ArrayList<>();
		setOfStaff = new HashSet<Staff>();
		
//		listOfStaff = new ArrayList<>();                 // List< ? extends Staff> listOfStaff;
		
		mapOfStaff = new HashMap<Integer, Staff>();	
	}
	
	
	public void printInfoStorage(Collection<?> list) {
		for(Object ls : list) {
			System.out.println("============");
			System.out.println(ls.toString());
		}
	}
	
	public void printInfoStorage(Map<Integer, ?> map, Integer number) {
		System.out.println(map.get(number));
	}
	
	
	
	
	
	public void setListOfEmployees(Employee employee) {
		listOfEmployees.add(employee);		
	}	
		
	public List<Employee> getListOfEmployees() {
		return listOfEmployees;		
	}
	
	public void setListOfBadEmployees(BadEmployee badEmployee) {
		listOfBadEmployees.add(badEmployee);		
	}	
		
	public List<BadEmployee> getListOfBadEmployees() {
		return listOfBadEmployees;		
	}
	
	public void setSetOfBosses(Boss boss) {
		setOfBosses.add(boss);		
	}	
		
	public Set<Boss> getSetOfBosses() {
		return setOfBosses;		
	}
	
	public void setListOfStaff(Staff staff) {
		listOfStaff.add(staff);		
	}	
		
	public List<Staff> getListOfStaff() {
		return listOfStaff;		
	}
	
	public void setSetOfStaff(Staff staff) {
		setOfStaff.add(staff);		
	}	
		
	public Set<Staff> getSetOfStaff() {
		return setOfStaff;		
	}
	
//	public void setListOfStaff(Staff staff) {               // List< ? extends Staff> listOfStaff;
//		listOfStaff.add(staff);		
//	}	
//		
//	public List<Staff> getListOfStaff() {
//		return listOfStaff;		
//	}
	
	public void setMapOfStaff(int number, Staff staff) {
		mapOfStaff.put(number, staff);		
	}	
		
	public Map<Integer, Staff> getMapOfStaff() {
		return mapOfStaff;		
	}

	
}
