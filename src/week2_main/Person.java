package week2_main;

import java.util.Objects;

public class Person {

	// attributes

	private String name;

	private int age;

	private String jobTitle;

	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public void introduce() {
		System.out.println("Name: " + getName() + ", age: " + getAge() + ", job title: " + getJobTitle() + ".");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	@Override
	public String toString() {
		return "Name: " + getName() + ", age: " + getAge() + ", job title: " + getJobTitle() + ".";
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, jobTitle, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(jobTitle, other.jobTitle) && Objects.equals(name, other.name);
	}
	
	

}
