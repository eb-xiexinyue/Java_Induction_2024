package co.jp.chapter08;

public class javahomework08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１
		String x = "a";
		String y = "a";
		System.out.println(x == y); // true 原因：xとyは同じ文字列リテラルをお参照しているため
		
		System.out.println(x.equals(y)); // true 原因：equalsメソッドは文字列内容の比較に使われており、xとyは同じ文字列“a”を含んでいるため
		
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); // false　原因：nullStringというnull参照に対してequalsメソッドを呼び出すと、NullPointerExceptionが発生するため

		
//		質問２
		// Employee.java
		public class Employee {
		 private String id;
		 public Employee(String id) {
		 this.id = id;
		 }
		 @Override
		 public boolean equals(Object another) {
		 if (another instanceof Employee) {
		 Employee an = (Employee) another;
		 return an.id.equals(id);
		 }
		 return false;
		 }
		}
		// Kicker.java
		public class Kicker {
		 public static void main(String...args) {
		 Employee x = new Employee("1234");
		 Employee y = new Employee("1234");
		 
		 System.out.println(x == y); // false　原因：==は比較演算子だが、xとyは異なるオブジェクトを参照しているため
		 
		 System.out.println(x.equals(y)); // true　原因：equalsメソッドは文字列内容の比較であり、xとyはどちらも同じid ("1234")を持っているため
		 }
		}
		
//		質問３
		public class Parent {
			 public void hello() {
			 System.out.println("parent method");
			 }
			}
			// Child.java
			public class Child extends Parent {
			 @Override // 親クラスの強制的にOverrideする意味（アノテーション）
			 public void hello() {
			 System.out.println("child method");
			 }
			}
			// Kicker.java
			public class Kicker {
			 public static void print(Parent v) { // 修正部分：ChildからParentに変更
			 v.hello();
			 }
			 public static void main(String...args) {
			 print(new Parent());
			 print(new Child());
			 }
			}
		

	}

}
