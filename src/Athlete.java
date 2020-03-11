
public class Athlete {
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	
	public Athlete (String name, int age, char gender) {
		firstName = name.substring(0, name.indexOf(' '));
		lastName = name.substring(name.indexOf(' ') + 1, name.length());
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		String temp;
		if (gender == 'm') {
			temp = "male";
		} else {
			temp = "female";
		}
		return firstName + " " + lastName + " is a " + temp + " at " + age + " years old.";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Athlete) {
			Athlete newObj = (Athlete) o;
			if(newObj.name(0).equals(firstName) && newObj.name(1).equals(lastName) && newObj.age == age && newObj.gender == gender) {
				return true;
			} 
		}
		return false;
	}
	
	// For the subclasses to access the private variables of this class
	public String name(int x) {
		if(x == 0) {
			return firstName;
		} else {
			return lastName;
		}
	}
	
	public int age() {
		return age;
	}
	
	public char gender() {
		return gender;
	}
}
