package co.jp.chapter07;

public class Animal {
	
//	private final String name = "miao";
	private final String name;
	
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}//因为是final，所以只有get没有set，因为不能改变他的设定值。

	public String gender;
	
	Animal(String name){
		this.name = name;
		
	}
}
