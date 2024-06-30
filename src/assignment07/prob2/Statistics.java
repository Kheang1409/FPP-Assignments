package assignment07.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		int sum = 0;
		for(EmployeeData d : aList) {
			if(d!=null){
				sum+=d.getSalary();
			}
		}
		return sum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
