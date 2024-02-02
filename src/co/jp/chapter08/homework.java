package co.jp.chapter08;

public class homework {
/*
 问题一
System.out.println(x == y);
結果: true
原因: Javaでは、文字列リテラルが同じ場合、同じStringオブジェクトを共有するため、==比較はtrueになります。

System.out.println(x.equals(y));
結果: true
原因: equalsメソッドは文字列の内容を比較します。
ここでは、xとyの中身が同じ文字列 "a" なので、trueが返ります。

System.out.println(nullString.equals(empty));
結果: NullPointerException（例外が発生する）
原因: nullStringがnullであるため、nullに対してequalsメソッドを呼び出すとNullPointerExceptionがスローされます。
equalsメソッドはnullに対して安全ではありません。
この場合、nullStringがnullであるかどうかをチェックする必要があります。

 
 问题2
System.out.println(x == y);
結果：false
理由：== はオブジェクトの参照が同じかどうかを比較し、つまり同じメモリアドレスを指しているかどうかです。
xとyは同じidを持っていますが、それらは異なるオブジェクトであるため、== 比較は false を返します。

System.out.println(x.equals(y));
結果：true
理由：equals メソッドはEmployeeクラスでオーバーライドされており、
idフィールドを基にして2つのオブジェクトが等しいかどうかを判断しています。
ここでは、xとyのidが同じであるため、equals 比較は true を返します。

问题3
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
    public static void print(Parent v) { // ChildではなくParent型を受け入れるように修正
        v.hello();
    }

    public static void main(String... args) {
        print(new Parent());
        print(new Child());
    }
}


 */
	


}
