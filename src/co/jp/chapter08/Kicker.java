package co.jp.chapter08;

public class Kicker {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Employee x = new Employee("1234");
		 Employee y = new Employee("1234");
		 System.out.println(x == y);
		 System.out.println(x.equals(y)); 
		 
		 
		 print(new Parent());
		 print(new Child());

	}
	public static void print(Parent parent) {
		 parent.hello();
	}

}
