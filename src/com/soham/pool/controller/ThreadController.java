package com.soham.pool.controller;

import java.util.ArrayList;
import java.util.List;

import com.soham.pool.util.Utility;

public class ThreadController implements ThreadNotifier {

	private List<String> idList = null;
	
	public ThreadController() {
		idList = new ArrayList<String>();
	}
	
	public String receiveId() {
		String id = null;
		id = Utility.generateRandomId();
		while(idList.contains(id)) {
			id = Utility.generateRandomId();
		}
		idList.add(id);
		return id;
	}
}
