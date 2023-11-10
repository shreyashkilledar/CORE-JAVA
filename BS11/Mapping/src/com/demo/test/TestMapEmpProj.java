package com.demo.test;

import java.util.HashMap;
import java.util.Map;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class TestMapEmpProj {

	public static void main(String[] args) {
		Map<Employee,Project> hm= new HashMap<>();
		hm.put(new Employee(1,"SK","HR",52000),new Project(11,"bhagya",12));
		hm.put(new Employee(2,"BS","dbgd",5200),new Project(12,"SK",2));
		hm.put(new Employee(3,"RP","Rfghf",520),new Project(13,"Rutvik",11));
		
		System.out.println(hm);

	}

}
