package assignment05.taskF;

import java.time.LocalDate;

public class DeptEmployee implements Comparable<DeptEmployee>{
	private String name;
	private double salary;
	private LocalDate hireDate;

	public DeptEmployee(){

	}

	public DeptEmployee(String name, double salary, LocalDate hireDate){
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}
	//default implementation
	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", hireDate=" + hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(DeptEmployee o) {
		return o.name.compareTo(this.name);
	}
}
