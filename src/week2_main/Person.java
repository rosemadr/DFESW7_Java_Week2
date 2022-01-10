package week2_main;

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
		
	
		
//		String introductionString = getName().concat(null)
		
		
		
		
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

}
