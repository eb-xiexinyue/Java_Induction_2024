package co.jp.chapter08;

public class Kicker {
	public static void main(String...args) {
		 Employee x = new Employee("1234");
		 Employee y = new Employee("1234");
		 System.out.println(x == y); // false, 原因は:
		 System.out.println(x.equals(y)); // true, 原因は:
		 

		 print(new Parent());
		 print(new Child());
		 }
	
	public static void print(Parent parent) {
		 parent.hello();
		 }
//	public static void print(Child v) {
//		 v.hello();
//		 }

		 
}
