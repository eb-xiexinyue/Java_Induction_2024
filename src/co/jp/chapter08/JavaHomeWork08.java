package co.jp.chapter08;

public class JavaHomeWork08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
//質問1
//1,2,3行：true
//原因: 文字列リテラルが同じ場合、Javaでは文字列プール内の同じオブジェクトを共有するため、'==' 演算子は true を返す。
//4行；true
//原因: 'equals()' メソッドは文字列の内容を比較するため、ここでも文字列 "a" の内容は同じなので、true を返します。
//6,7,8:NullPointerException（実行時エラー）
//原因: 'nullString' が 'null' であり、'equals()' メソッドは 'null' に対して呼び出されているため、NullPointerException が発生する。
//'null' に対してメソッドを呼び出すと例外が発生するので、注意が必要。正しく比較するためには、'equals()' メソッドを呼び出す前に null チェックを行う必要がある。

//質問2
//21行：false
//原因: == 演算子はオブジェクトの参照を比較します。ここでは x と y は異なるオブジェクトなので、'==' は false を返す。
//22行：true
//原因: 'equals()' メソッドはオブジェクトの内容を比較する。Employee クラスでは ’equals()' メソッドがオーバーライドされており、オブジェクトの'id'フィールドが同じであれば true を返すようになっている。
//したがって、'x.equals(y)' は true を返す。オーバーライドされた'equals()' メソッドにより、オブジェクトの中身が同じであれば'equals()' の比較も true となる。

//質問3
// Parent.java
//	public class Parent {
//	public void hello() {
//	System.out.println("parent method");
//	}
//  }
//	// Child.java
//	public class Child extends Parent {
//	@Override // 親クラスの強制的にOverrideする意味（アノテーション）
//	public void hello() {
//	System.out.println("child method");
//	}
//  }
//	// Kicker.java
//	public class Kicker {
//	public static void print(Parent v) { // 引数を Parent 型に修正
//	v.hello();
//	}
//	public static void main(String...args) {
//	print(new Parent());
//	print(new Child()); // ここで Child クラスのインスタンスを渡す
//	}
//  }

