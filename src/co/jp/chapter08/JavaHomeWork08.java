package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// 質問１
		String x = "a";
		String y = "a";
		System.out.println(x == y); 
		// true ? false? 原因は ?
		//true  同じ文字列の型を==で比較するので　結果はtrueです
		System.out.println(x.equals(y)); 
		// true ? false? 原因は ?
		//equalsで内容が等しいかどうかを確認するので。xとyは両方とも同じ値"a"を持っているから、
		//trueを返します。
		String empty = "";
		String nullString = null;
		System.out.println(nullString.equals(empty)); 
		// true ? false? 原因は 
		//出力：NullPointerException
		//nullStringはnullなので、例外です。エラーメッセージがでます。
		
		//質問２
		// Kicker.java
		System.out.println(x == y); 
		// true ? false? 原因は ?
		//xとyはnewキーワードを使って別々に作成された違うEmployeeオブジェクトなので。
		//メモリ上で違う場所に存在し、==で比較したらfalseが返されます。
				
		System.out.println(x.equals(y)); // true ? false? 原因は ?
		//Employeeクラスのequalsはidは同じなのかをチェックします。
		//xとyは同じid（"1234"）を持ってるから、trueが返されます。
		
		//質問３
		/*
		 *  Kicker.java
		public class Kicker02 {
			public static void print(Parent v) {　//修正したところはこちらです。
		        v.hello();
		    }
		*/

	}

}
