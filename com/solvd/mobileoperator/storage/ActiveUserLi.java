package com.solvd.mobileoperator.storage;

import com.solvd.mobileoperator.user.GoodUser;

import java.util.List;
//import java.util.ArrayList;
import java.util.LinkedList;

public class ActiveUserLi {

	public List<GoodUser> listOfGoodUser;
	
	public ActiveUserLi () {
		listOfGoodUser = new LinkedList<>();		
	}

	public void setListOfGoodUser(GoodUser goodUser) {
		listOfGoodUser.add(goodUser);		
	}	
		
	public List<GoodUser> getListOfGoodUser() {
		return listOfGoodUser;		
	}
}
