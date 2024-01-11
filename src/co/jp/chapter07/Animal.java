package co.jp.chapter07;

public class Animal {
	private final String name;
	private int age;
	public String gender;
	
	Animal pet = new Animal();

	
	
	public Animal(){
		this.name = "puppy";
	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}

}
