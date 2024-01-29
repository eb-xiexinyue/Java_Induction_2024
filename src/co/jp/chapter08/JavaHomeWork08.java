package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//質問１︓以下コードの出力するを回答してください。
String x = "a";
String y = "a";
System.out.println(x == y); // true ? false? 原因は ?
System.out.println(x.equals(y)); // true ? false? 原因は ?
String empty = "";
String nullString = null;
System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
		
//回答：String x = "a";
//	String y = "a";
//	System.out.println(x == y); // true
//	System.out.println(x.equals(y)); // true
//	== 演算子はオブジェクトの参照が同じであるかどうかを確認する。equalsメソッドは文字列の中身が同じかどうかを比較する。
//	したがって、xとyは同じ文字列を参照しているためx == yはtrueになる。xとyの中身はどちらも"a"なので、x.equals(y)もtrueになる。

//	String empty = "";
//	String nullString = null;
//	System.out.println(nullString.equals(empty)); // NullPointerException
//	nullStringがnullであるため、nullString.equals(empty)の呼び出しはNullPointerExceptionを発生させる。
//	以下のように修正する：
//	System.out.println(empty.equals(nullString)); // false。
		
		
		
		
//質問２︓以下コードの出力を回答してください。
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
		System.out.println(x == y); // true ? false? 原因は ?
		System.out.println(x.equals(y)); // true ? false? 原因は ?
	}
}
//回答：Employee x = new Employee("1234");
//		Employee y = new Employee("1234");
//		System.out.println(x == y); // false
//		System.out.println(x.equals(y)); // true
//xとyは異なるオブジェクトを示しているため、falseになる。
//xとyのidフィールドの値は同じ"1234"であるため、true になる。


//質問３︓以下コンパイルを修正してください。
// Parent.java
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
	public static void print(Child v) {
		v.hello();
	}
	public static void main(String...args) {
		print(new Parent());
		print(new Child());
	}
}		
//回答：printメソッドはChildクラスを引数にとるように宣言されているため、Parentクラスのオブジェクトを渡すことはできない。
//以下のように修正する：
//// Kicker.java
//public class Kicker {
//    public static void print(Parent v) {
//        v.hello();
//    }
//
//    public static void main(String... args) {
//        print(new Parent());
//        print(new Child());
//    }
//}

	}

}
