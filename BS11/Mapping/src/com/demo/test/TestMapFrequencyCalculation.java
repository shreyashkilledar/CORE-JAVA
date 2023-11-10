package com.demo.test;

import java.util.HashMap;
import java.util.Map;

public class TestMapFrequencyCalculation {

	public static void main(String[] args) {
		Integer [] arr= {11,12,13,14,21,31,41,12,19,35,75,14,12,65,19,56};
		Map<Integer,Integer> hm= new HashMap<>();
		for(Integer num:arr)
		{
			if(hm.containsKey(num))
			{
				int val=hm.get(num);
				hm.put(num, val+1);
			}
			else
			{
				hm.put(num, 1);
			}
		}
		System.out.println(arr);
		System.out.println(hm);
	}
}
