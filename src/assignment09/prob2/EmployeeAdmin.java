package assignment09.prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> employees = new ArrayList<>();
		for(String socSecNum: socSecNums){
			Employee employee = table.get(socSecNum);
			if(employee != null && employee.getSalary() > 80000)
				employees.add(employee);
		}
//		anonymous
//		Collections.sort(employees, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee ob1, Employee ob2){
//				return ob1.getSsn().compareTo(ob2.getSsn());
//			}
//		});
//		Lambda
		Collections.sort(employees,
				(ob1, ob2) -> ob1.getSsn().compareTo(ob2.getSsn()));
		return employees;
	}
	
}
