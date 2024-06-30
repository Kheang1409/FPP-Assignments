package assignment09.prob2;

import java.util.Objects;

//DO NOT MODIFY IN ANY WAY
public class Employee {
	private String name;
	private int salary;
	private String ssn;
	public Employee(String name, int salary, String ssn) {
		this.name = name;
		this.salary = salary;
		this.ssn=ssn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override 
	public String toString() { //DO NOT MODIFY
		return "(" + ssn + ": " + name + ", " + salary + ")" ;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		return e.ssn.equals(ssn);
	}
	@Override
	public int hashCode(){
		return Objects.hash(name, salary, ssn);
	}
}
