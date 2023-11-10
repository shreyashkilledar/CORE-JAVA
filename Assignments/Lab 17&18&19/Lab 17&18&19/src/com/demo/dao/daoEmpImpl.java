package com.demo.dao;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.beans.Vendor;
import com.demo.comparators.*;
public class daoEmpImpl implements daoEmp {

	static List<Employee> elist;
	static
	{
		elist=new ArrayList<>();
		elist.add(new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),5000,345));
 		elist.add(new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","ase",LocalDate.of(2002, 10,30),600,377));
 		elist.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","bod",LocalDate.of(2000, 12,30),40,7000));
 		elist.add(new Vendor(16,"Shubam","777","shu@gmail.com","hr","hrd",LocalDate.of(2000, 12,30),20,400));
 		elist.add(new Vendor(17,"om","888","shu@gmail.com","hr","as",LocalDate.of(2000, 12,30),20,500));

	
	}
	
	@Override
	public void save(Employee e) {
		elist.add(e);
	}

	@Override
	public List<Employee> showall() {
		return elist;
	}

	@Override
	public Employee findById(int id1)
	{
		int pos=elist.indexOf(new SalariedEmployee(id1));
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		return null;
	}

	@Override
	public List<Employee> sortName() {
		List<Employee> elst = new ArrayList<>();
		for(Employee e : elist)
		{
            elst.add(e);			
		}
		 elst.sort(null);
		return elst;
	}

	@Override
	public boolean remove(int id3) {
		// TODO Auto-generated method stub
		
		return elist.remove(new SalariedEmployee(id3));
	}

	@Override
	public boolean modifySal(int id5, double sal) {
		// TODO Auto-generated method stub
		Employee e=findById(id5);
		if(e!=null)
		{
			if(e instanceof SalariedEmployee)
			{
				((SalariedEmployee) e).setSal(sal);
			}
			else if(e instanceof ContractEmployee)
			{
				((ContractEmployee) e).setCharges(sal);
			}
			else if(e instanceof Vendor)
			{
				((Vendor) e).setAmount(sal);
				
			}
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> sortSalary() {
		// TODO Auto-generated method stub
		List<Employee> temp=new ArrayList<Employee>();
		for(Employee e:elist)
		{
			temp.add(e);
		}
		Comparator<Employee> mysal=(o1,o2)->{
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmployee)
			{
				sal1=((SalariedEmployee) o1).getSal();
			}
			else if(o1 instanceof ContractEmployee)
			{
				sal1=((ContractEmployee) o1).getCharges();
			}
			else 
			{
				sal1=((Vendor) o1).getAmount();
			}
			
			if(o2 instanceof SalariedEmployee)
			{
				sal2=((SalariedEmployee) o2).getSal();
			}
			else if(o2 instanceof ContractEmployee)
			{
				sal2=((ContractEmployee) o2).getCharges();
			}
			else
			{
				sal2=((Vendor) o2).getAmount();
			}
			return (int)(sal1-sal2);
		};
		temp.sort(mysal);
		return temp;
	}

	@Override
	public List<Employee> sortDesg()
	{
        List<Employee> temp1 = new ArrayList<>();
        for(Employee e : elist)
        {
        	temp1.add(e);
        }
		Comparator<Employee> mydesg=(o1,o2)->
		{
			return o1.getDesignation().compareTo(o2.getDesignation());
		};
	    temp1.sort(mydesg);	
	    return temp1;
	}
	

}
