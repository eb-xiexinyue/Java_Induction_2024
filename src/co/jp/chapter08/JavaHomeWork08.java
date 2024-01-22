package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {

//	質問１：以下コードの出⼒するを回答してください。
//	回答１：
	String x = "a";
	String y = "a";
	System.out.println(x == y); // true, 原因は: x="a"=y //演算⼦ == はオブジェクトを⽐較し、同じメモリアドレス情報が⼀致するかを判断する。
	
	System.out.println(x.equals(y)); // true, 原因は: equals メソッドは各クラスでオーバーライドすることができる。
	                                 //Stringクラスは equalsをオーバーライドして、メモリアドレス⽐較ずに、⽂字列の内容を⽐較する。(x="a"=y)
	String empty = "";
	String nullString = null;
	System.out.println(empty.equals(nullString)); // false, 原因は: " " と null は等しくない。
	
//	質問２：以下コードの出⼒を回答してください。
//	回答２：
	Employee a = new Employee("1234");
	Employee b = new Employee("1234");
	System.out.println(a == b); // false, 原因は: a と b のメモリアドレスは同じくない。
	System.out.println(a.equals(b)); // true, 原因は: equalsをオーバーライドして、メモリアドレス⽐較ずに、⽂字列の内容を⽐較するから、
			                                  // a と b の⽂字列の内容が同じ。(a="1234"=b)
			
//	質問３：以下コンパイルを修正してください。 
//	回答３：
	 print(new Parent());
	 print(new Child());
	}	
	public static void print(Parent v) {   
		 v.hello();
		 }
//	下記は本来のコンパイル：
//	public static void print(Child v) {
//	 v.hello();
//	 }
//　修正したところは、print(Child v)をprint(Parent v)に変更した。
	
}

