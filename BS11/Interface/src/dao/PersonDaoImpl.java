package dao;

import java.util.List;

import beans.Person;

public class PersonDaoImpl implements PersonDao{
	
	static Person[] parr;
	static int cnt;
	static {
		parr= new Person[20];
		parr[0]=new Person(1,"Shreyash","7559362276","shreyash@gmail.com");
		parr[1]=new Person(2,"Rutvik","755935433546","rutvik@gmail.com");
		parr[2]=new Person(3,"Bhagya","75551262276","bhagya@gmail.com");
		int cnt=3;
	}

	@Override
	public void save(Person p) {
		parr[cnt]=p;
		cnt++;
	}

	@Override
	public Person[] displayAll() {
		return parr;
	}

	@Override
	public Person Bhagyashri(int pid) {
		for(Person p:parr) {
			if(p!=null) {
				if(p.getPid()==pid) {
					return p;
				}
			}
			else {
				break;
			}
		}
		
		return null;
	}

}