package co.jpChapter08;

public class JavaHomeWork08 {
	 public static void main(String[] args) {
	//質問１︓以下コードの出力するを回答してください。
	  //String x = "a";
	  //String y = "a";
	  //System.out.println(x == y); // true ? false? 原因は ?
	  //System.out.println(x.equals(y)); // true ? false? 原因は ?
	  //String empty = "";
	  //String nullString = null;
	  //System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
    //答え：
	  //System.out.println(x == y); はtrueである。原因はStringオブジェクトの参照が比較され、xとyが同じ文字列
	  //リテラル"a" を参照しているからである。
	  //System.out.println(x.equals(y));もtrueである。原因はStringオブジェクトの値が比較され、xとyが同じ文字列
	  //"a" を保持しているからである。
	  //System.out.println(nullString.equals(empty));はエラーになる。原因はnullのオブジェクトに対してメソッドを
	  //呼び出そうとするからである。
    
	//質問２︓以下コードの出力を回答してください。
	   // Employee.java
	   //public class Employee {
	   // private String id;
	   // public Employee(String id) {
	   //this.id = id;
	   //}
	   // @Override
	   // public boolean equals(Object another) {
	   // if (another instanceof Employee) {
	   // Employee an = (Employee) another;
	   //return an.id.equals(id);
	   //}
	   //return false;
	   // }
	   //}
	   // Kicker.java
       //public class Kicker {
	   //public static void main(String...args) {
	   //Employee x = new Employee("1234");
	   //Employee y = new Employee("1234");
	   //System.out.println(x == y); // true ? false? 原因は ?
	   //System.out.println(x.equals(y)); // true ? false? 原因は ?
	   // }
	   //}
	//答え：
	  //System.out.println(x == y); はfalseである。 原因はx と y はそれぞれ別々のオブジェクトを生成しているからである。
	  //System.out.println(x.equals(y)); はtrueである。原因は x と y の両方のオブジェクトの id フィールドの値は同じで、
	  //両方とも"1234" からである。
	
    //質問３︓以下コンパイルを修正してください。
		////Parent.java
		//public class Parent {
		//public void hello() {
		//System.out.println("parent method");
		 // }
		 //}
		 //// Child.java
		 //public class Child extends Parent {
		  //@Override // 親クラスの強制的にOverrideする意味（アノテーション）
		  //public void hello() {
		  //System.out.println("child method");
		  //}
		 //}
		 //// Kicker.java
		 //public class Kicker {
		  //public static void print(Child v) {
		  //v.hello();
		  //}
		  //public static void main(String...args) {
		  //print(new Parent());
		  //print(new Child());
		 // }
	     // }
		 
	 //答え：
		////Parent.java
		   // public class Parent {
			   // public void hello() {
			       // System.out.println("parent method");
			   // }
			//}
		//// Child.java
		    // public class Child extends Parent {
			   // @Override
			    //public void hello() {
			       // System.out.println("child method");
			    //}
			//}
		//// Kicker.java
		     //public class Kicker {
			   // public static void print(Child v) {
			       // v.hello();
			    //}
			    
			    //public static void main(String...args) {
			        //print(new Child()); 
			    //}
		      //}
		  }
		 }

	 

	