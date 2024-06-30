package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		if(students == null || students.isEmpty()) return null;
		HashMap<Key, Student> studentsHashMap = new HashMap<>();
		for (Student student : students) {

			studentsHashMap.put(new Key(student.getFirstName(), student.getLastName()), student);
		}
		return studentsHashMap;
	}
}
