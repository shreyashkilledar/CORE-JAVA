package com.demo.test;

import java.util.HashMap;
import java.util.Map;

import com.demo.beans.Employee;

public class TestSumSal {
	public static void main(String[] args) {
		
		Employee [] earr= {new Employee(1,"Shreyash","7559362276",12000),new Employee(1,"Komal","75566465276",65000)};
		Map<String,Double> hm= new HashMap<>();
		for(int i=0;i<earr.length;i++)
		{
			if(hm.containsKey(earr[i].getDept())) {
				double val= hm.get(earr[i].getDept());
				hm.put(earr[i].getDept(),val+earr[i].getSal());
			}
			else
			{
				hm.put(earr[i].getDept(),earr[i].getSal());	
			}
		}
		System.out.println(hm);
	}
}
