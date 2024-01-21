//質問１
/*1. `String x = "a"; String y = "a"; System.out.println(x == y);`：
   true。因为Java的字符串池会重用具有相同字面值的字符串对象。如果字符串字面值相同，就引用相同的对象。

2. `System.out.println(x.equals(y));`：
   true。equals 方法用于比较字符串的内容，如果两个字符串具有相同的内容，则返回 true。

3. `String nullString = null; System.out.println(nullString.equals(empty));`：
   `NullPointerException`。由于 `nullString` 仍然为 `null`，调用 `equals` 方法会导致 `NullPointerException`。
*/

//質問２
/* System.out.println(x == y);：
结果为 false。因为 == 比较的是对象引用，而 x 和 y 虽然内容一样但是是不一样的对象。

System.out.println(x.equals(y));：
结果为 true。因为 equals 方法被 Employee 类重写，它会比较两个 Employee 对象的.x 和 y 的 id 都是 "1234"，
 equals 返回 true。
*/

//質問３
// Parent.java
public class Parent {
    public void hello() {
        System.out.println("parent method");
    }
}

// Child.java
public class Child extends Parent {
    @Override 
    public void hello() {
        System.out.println("child method");
    }
}

// Kicker.java
public class Kicker {
    public static void print(Parent v) {
        v.hello();
    }

    public static void main(String... args) {
        print(new Parent());
        print(new Child());
    }
}
