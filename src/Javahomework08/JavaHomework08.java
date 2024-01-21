package Javahomework08;

public class JavaHomework08 {
	
	//質問１︓以下コードの出⼒するを回答してください
//	String x = "a";
//	String y = "a";
//	System.out.println(x == y);
	// true ? false? 原因は ?
//	回答：true
	//x和y引用相同的对象，==比较返回true
//	System.out.println(x.equals(y)); // true ? false? 原因は ?
//回答：输出：true
	//equals方法比较字符串的内容
//	String empty = "";
//	String nullString = null;
//	System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
//	回答：输出：NullPointerException（空指针异常）
	//nullString为null，当对null调用equals方法时，将引发NullPointerException
//	質問２︓以下コードの出⼒を回答してください。
//	// Employee.java
//	public class Employee {
//	 private String id;
//	 public Employee(String id) {
//	 this.id = id;
//	 }
//	 @Override
//	 public boolean equals(Object another) {
//	 if (another instanceof Employee) {
//	 Employee an = (Employee) another;
//	 return an.id.equals(id);
//	 }
//	 return false;
//	 }
//	}
//	// Kicker.java
//	public class Kicker {
//	 public static void main(String...args) {
//	 Employee x = new Employee("1234");
//	 Employee y = new Employee("1234");
//	 System.out.println(x == y); // true ? false? 原因は ?
//	 System.out.println(x.equals(y)); // true ? false? 原因は ?
//	 }
//	}
	//回答输出：false
	//==运算符比较对象的引用。x和y是两个不同的对象，因此==比较返回false。
	//回答输出：true
	//equals方法在Employee类中被重写，它比较对象的内容
	//在这个实现中，如果id字段相同，则返回true。因此，x.equals(y)的比较返回true
//	質問３︓以下コンパイルを修正してください。
//	// Parent.java
//	public class Parent {
//	 public void hello() {
//	 System.out.println("parent method");
//	 }
//	}
//	// Child.java
//	public class Child extends Parent {
//	 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
//	 public void hello() {
//	 System.out.println("child method");
//	 }
//	}
//	// Kicker.java
//	public class Kicker {
//	 public static void print(Child v) {
//	 v.hello();
//	 }
//	 public static void main(String...args) {
//	 print(new Parent());
//	 print(new Child());
//	 }
//	}
	//回答将Kicker类中的print方法的参数类型从Child改为Parent
	
	
	
	
	
	
	
	

}
