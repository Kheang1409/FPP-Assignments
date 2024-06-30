package assignment05.taskF;
import java.time.LocalDate;
import java.util.Arrays;


public class DeptEmployeeData {

	public static DeptEmployee[] getDeptData() {
		Professor p0 = new Professor("Joe",40000, LocalDate.of(1999,12,24));
		Professor p1 = new Professor("Bob",50000,LocalDate.of(1979,1,2));
		Professor p2 = new Professor("Anna",45000,LocalDate.of(2000,5,21));
		
		Secretary s0 = new Secretary("Joan",50000,LocalDate.of(1987,2,15),10);
		Secretary s1 = new Secretary("Janet",40000,LocalDate.of(1995,4,22),15);
		
		DeptEmployee[] departments = {p0,p1,p2,s0,s1};
		return departments;

	}

	public static void main(String[] args) {
		DeptEmployee de = new DeptEmployee();
		DeptEmployee[] departments = getDeptData();
		System.out.println("Before sorting:" +Arrays.toString(departments));
		Arrays.sort(departments);
		System.out.println("After sorting (DESC):" +Arrays.toString(departments));

	}

}
