package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ\
		String x = "a";
			String y = "a";
			System.out.println(x == y); 
			//true
			// 原因：x と y は同じリテラル "a" を参照しているから、
			//両者はメモリ上で同じオブジェクトを指してる。
			//== 演算子で比較したから。trueが返される
			System.out.println(x.equals(y)); // true ? false? 原因は ?
			//teue
			//原因：equals() メソッドはオブジェクトの内容が等しいかどうかを比較する。
			//この場合、x と y は両方とも同じ値 "a" を持っているから、
			//equals() は true を返す
			
			String empty = "";
			String nullString = null;
			System.out.println(nullString.equals(empty)); // true ? false? 原因は ?
			//エーラが起こす
			//原因：null 参照にはメソッドを呼び出せないから。
			//このコードは nullをチェックを行わずに equals() を呼び出しているため、
			//エラーが発生する
			/*
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
				 System.out.println(x == y); 
				 // false
				 // 原因はx と y は new キーワードを使用して作成されている、
				 //これでそれぞれが違うオブジェクトとして配置されるから。
				  //== 演算子はオブジェクト参照（メモリ上のアドレス）を比較するため、異なるオブジェクトである x と y は異なるアドレスを持っているので false が返されます。
				 System.out.println(x.equals(y)); 
				 // true ? false? 原因は ?
				 //true
				 //原因は Employee クラスが equals メソッドがオーバーライドされていって、
				 //このメソッドは Employee オブジェクトの id フィールドの値を比較する。
				 //x と y は同じ id 値 "1234" を持っているから、equals メソッドは true を返す。
				 }
				}
				
				
				// Kicker.java
					public class Kicker {
					    public static void print(Parent v) { // 引数をParent型に変更
					        v.hello();
					    }
					
					    public static void main(String...args) {
					        print(new Parent());
					        print(new Child());
					    }
					}
				
				*/

	}

}
