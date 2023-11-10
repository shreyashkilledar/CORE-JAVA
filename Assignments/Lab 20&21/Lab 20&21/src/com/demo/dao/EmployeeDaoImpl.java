package com.demo.dao;


import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.List;
import java.time.LocalDate;
import java.util.Comparator;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

//import com.demo.comparator.*;
public class EmployeeDaoImpl implements EmployeeDao {

	static Set<Employee> hs;
	static
	{
		hs=new HashSet<>();
		hs.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),5000,345));
 		hs.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","ase",LocalDate.of(2002, 10,30),600,377));
 		hs.add(new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hs.add(new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","bod",LocalDate.of(2000, 12,30),40,7000));
 		

	
	}
	
	@Override
	public void save(Employee e) {
		hs.add(e);
	}

	@Override
	public Set<Employee> showall() {
		return hs;
	}

	@Override
	public Employee findById(int id1)
	{
		//int pos=elist.indexOf(new SalariedEmployee(id1));
		for(Employee e : hs)
		{
			if(e.getPid()==id1)
			{
				return e;
			}
		}
		
		return null;
	}

	@Override
	public Set<Employee> sortName() {
		TreeSet<Employee> h1 = new TreeSet<>();
		for(Employee e : hs)
		{
            h1.add(e);			
		}
		
		return h1;
	}

	@Override
	public boolean remove(int id3) {
		// TODO Auto-generated method stub
		
		return hs.remove(new SalariedEmp(id3));
	}

	@Override
	public boolean modifySal(int id5, double sal) {
		// TODO Auto-generated method stub
		Employee e=findById(id5);
		if(e!=null)
		{
			if(e instanceof SalariedEmp)
			{
				((SalariedEmp) e).setSal(sal);
			}
			else if(e instanceof ContractEmp)
			{
				((ContractEmp) e).setCharges(sal);
			}
			
				
			
			return true;
		}
		return false;
	}

	@Override
	public Set<Employee> sortSalary() {
		// TODO Auto-generated method stub

		Comparator<Employee> mysal=(o1,o2)->{
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmp)
			{
				sal1=((SalariedEmp) o1).getSal();
			}
			else if(o1 instanceof ContractEmp)
			{
				sal1=((ContractEmp) o1).getCharges();
			}
			
			
			if(o2 instanceof SalariedEmp)
			{
				sal2=((SalariedEmp) o2).getSal();
			}
			else if(o2 instanceof ContractEmp)
			{
				sal2=((ContractEmp) o2).getCharges();
			}
			
			return (int)(sal1-sal2);
		};
		TreeSet<Employee> temp=new TreeSet<Employee>(mysal);
		for(Employee e:hs)
		{
			temp.add(e);
		}
		return temp;
	}

	@Override
	public Set<Employee> sortDesg()
	{

		Comparator<Employee> mydesg=(o1,o2)->
		{
			return o1.getDesignation().compareTo(o2.getDesignation());
		};
        TreeSet<Employee> temp1 = new TreeSet<>(mydesg);
        for(Employee e : hs)
        {
        	temp1.add(e);
        }	
	    return temp1;
	}


	@Override
	public Employee[] getNEmp(int nn) {

		Set<Employee> h4=sortSalary();
		Employee earr[]=new Employee[nn];
		int cnt=0;
		for(Employee e:h4)
		{
			earr[cnt]=e;
			cnt++;
			if(cnt==nn)
			{
				break;
			}
			
		}
	 return earr;
	}
	

}
