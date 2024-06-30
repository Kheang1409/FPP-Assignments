package assignment07.prob1;

import java.util.Arrays;

public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] personArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		personArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Implement method to Add as last element, make sure you have enough room else call resize()
	public void add(Person p) {
		if (p == null) return; // Safeguard against null input
		if (size == personArray.length) {
			resize();
		}
		personArray[size] = p;
		size++;
	}

	// 2. get person information by passing index
	public Person get(int i) {
		if (i < 0 || i >= size) { // Correct bounds check
			return null;
		}
		return personArray[i];
	}

	// 3. Find the Person object using lastname
	public boolean find(String lastName) {
		if (lastName == null) {
			return false;
		}
		for (int i = 0; i < size; i++) {
			if (lastName.equals(personArray[i].getLast())) { // Use getLastName method
				return true;
			}
		}
		return false;
	}

	// 4. Remove the person object by passing its lastname
	public boolean remove(String lastName) {
		if (size == 0) {
			return false;
		}
		if (lastName == null) {
			return false;
		}

		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (personArray[i].getLast().equals(lastName)) { // Use getLastName method
				index = i;
				break;
			}
		}

		if (index == -1) {
			return false;
		}

		Person[] temp = new Person[personArray.length];
		System.arraycopy(personArray, 0, temp, 0, index);
		System.arraycopy(personArray, index + 1, temp, index, personArray.length - (index + 1));
		personArray = temp;
		--size;
		return true;
	}

	// 5. Resizing the list
	private void resize() {
		System.out.println("resizing");

		int len = personArray.length;
		int newlen = 2 * len;

		personArray = Arrays.copyOf(personArray, newlen);
	}

	// To display all the persons list
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; ++i) {
			sb.append(personArray[i]);
			if (i < size - 1) sb.append(", \n");
		}
		sb.append("]");
		return sb.toString();
	}

	// Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Bruce", "Tom", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));
		list.add(new Person("Bishnu", "Pokhrel", 29));
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		list.remove("Tom");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		System.out.println("\nSearching for Lermon: " + list.find("Lermon"));
		System.out.println(list.get(2));
	}
}
