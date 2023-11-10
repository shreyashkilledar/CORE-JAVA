package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;

public class MySalComparator implements Comparator<Employee> {


	public int compare(Employee o1, Employee o2) {
		double sal1=0,sal2=0;
		if(o1 instanceof SalariedEmployee)
		{
			sal1=((SalariedEmployee) o1).getSal();
		}
		else if(o1 instanceof ContractEmployee)
		{
			sal1=((ContractEmployee) o1).getCharges();
		}
		else if(o1 instanceof Vendor)
		{
			sal1=((Vendor) o1).getAmount();
		}
		else if(o2 instanceof SalariedEmployee)
		{
			sal2=((SalariedEmployee) o2).getSal();
		}
		else if(o2 instanceof ContractEmployee)
		{
			sal2=((ContractEmployee) o2).getCharges();
		}
		else if(o2 instanceof Vendor)
		{
			sal2=((Vendor) o2).getAmount();
		}
		return (int) (sal1-sal2);
	}

}
