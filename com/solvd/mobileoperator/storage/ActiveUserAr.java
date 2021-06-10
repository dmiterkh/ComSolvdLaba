package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.user.GoodUser;

import java.util.List;
import java.util.ArrayList;
//import java.util.LinkedList;

public class ActiveUserAr {

	public List<GoodUser> listOfGoodUser;
	
	public ActiveUserAr () {
		listOfGoodUser = new ArrayList<>();		
	}

	public void setListOfGoodUser(GoodUser goodUser) {
		listOfGoodUser.add(goodUser);		
	}	
		
	public List<GoodUser> getListOfGoodUser() {
		return listOfGoodUser;		
	}
}
