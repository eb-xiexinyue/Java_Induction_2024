package co.jp.chapter08;

public class JavaHomework08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		// 質問１
//		String x = "a";
//		String y = "a";
//		System.out.println(x == y);// true ? false? 原因は ?
//		// true  同じ文字列の型を==で比較し、結果はtrueです
//		System.out.println(x.equals(y));// true ? false? 原因は ?
////		equalsで内容が等しいかどうかを確認するので。xとyは両方とも同じ値"a"を持っているから、trueを返します。
//		String empty = "";
//		String nullString = null;
//		System.out.println(nullString.equals(empty)); // true ? false? 原因は 
//		// false, 原因は: " " と null は等しくない。
//		
		
		//質問２
		Employee a = new Employee("1234");
		Employee b = new Employee("1234");
		System.out.println(a == b); // false, 原因は: a と b のメモリアドレスは同じくない。
		System.out.println(a.equals(b)); // true, 原因は: equalsをオーバーライドして、メモリアドレス⽐較ずに、⽂字列の内容を⽐較するから、
				                                  // a と b の⽂字列の内容が同じ。(a="1234"=b)


//		質問３：
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
