package com.demo.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
	
	Map<String,Integer> hm= new HashMap<>();
	hm.put("Shreyash",108);
	hm.put("Rutvik", 109);
	hm.put("Bhagyashri",110);
	
	System.out.println(hm.get(110));
	
	
}
}