package prob1;

import java.util.Objects;

public class Key {
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Key p = (Key)ob;
		return p.firstName.equals(firstName) && p.lastName.equals(lastName);
	}
	@Override
	public int hashCode(){
		return Objects.hash(firstName, lastName);
	}
}
