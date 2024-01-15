package co.jp.chapter08;

public class JavaHomeWork08 {
	
//	質問１
//	String x = "a";
//	String y = "a";
//	System.out.println(x==y); //true  "a"のアドレスは同じです
//	System.out.println(x.equals(y));//true  内容は同じです
//	
//	
//	String empty = " ";
//	String nullString = null;
//	System.out.println(nullString.equals(empty));//false  同じものではないです。
	
//	質問２
//	public class Employee {
//	    private String id;
//	    public Employee(String id){
//	        this.id = id;
//	    }
//	    @Override
//	    public boolean equals(Object another){
//	        if (another instanceof Employee){
//	            Employee an = (Employee) another;
//	            return an.id.equals(id);
//	        }
//	        return false;
//	    }
//	}
//	//public class Kicker{
//	    public static void main(String[] args) {
//	        Employee x = new Employee("1234");
//	        Employee y = new Employee("1234");
//	        System.out.println(x == y);  //true
//	        System.out.println(x.equals(y)); //false
//	    }
//	}
	
//	質問３
	
//	print(Child v)を保留したい場合
//	
//	public class Parent {
//	    public void hello(){
//	        System.out.println("parent method");
//	    }
//	}
//	
//	public class Child extends Parent{
//	    @Override
//	    public void hello(){
//	        System.out.println("child method");
//	    }
//	}
//	
//	public class Kicker {
//		   public static void print(Child v) {
//		       v.hello();
//		   }
//
//		    public static void main(String[] args) {
//		        
//		        print(new Child());
//		    }
//		}
	
	
	
//	print(new Parent())を出力したい場合
	
//	public class Parent {
//    public void hello(){
//        System.out.println("parent method");
//    }
//}
//
//public class Child extends Parent{
//    @Override
//    public void hello(){
//        System.out.println("child method");
//    }
//}
//
//public class Kicker {
//	   public static void print(Parent v) {
//	       v.hello();
//	   }
//
//	    public static void main(String[] args) {
//	        print(new Parent());
//	        print(new Child());
//	    }
//	}
}
