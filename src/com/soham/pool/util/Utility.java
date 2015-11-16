package com.soham.pool.util;

import java.util.Random;

public class Utility {

	private static final String[] STRING_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_".split("");
	private static final int ID_LENGTH = 6;
			
	public synchronized static String generateRandomId() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ID_LENGTH; i++) {
			sb.append(STRING_LIST[new Random().nextInt(STRING_LIST.length)]);
		}
		return sb.toString();
	}
	
}
