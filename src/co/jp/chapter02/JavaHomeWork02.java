package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
//  	質問１︓ System.out.println(“this is line1\tthis line2“); は何⾏出⼒しますか︖
//		 1. １⾏
//		 2. ２⾏
		//System.out.println("this is line1\tthis line2");
		//运行结果是 this is line1	this line2
        //所以选择1⾏

//		質問２︓Stringを⽐較⽅法は︖
//		 1. ==
//		 2. equals
		//根据老师上课讲的例子，这题选2 equals.
		//在比较字符串时，== 运算符比较的是引用，而 equals 方法比较的是实际的字符串内容。
		//如果字符串的内容相同，equals 方法将返回 true.可以看下面例子，
		 // 创建两个字符串对象
      //  String str1 = new String("Hello");
       // String str2 = new String("Hello");

        // 使用 == 比较引用（地址），返回 false
        //boolean result1 = (str1 == str2);
        //System.out.println("使用 == 比较引用结果：" + result1);
       //boolean 是Java中的一种基本数据类型，它只有两个可能的值：true 或 false。boolean 类型主要用于表示逻辑值
        // 使用 equals 比较内容，返回 true
       // boolean result2 = str1.equals(str2);
        //System.out.println("使用 equals 比较内容结果：" + result2);
		
//		質問３︓Float値⇒String⽂字列変更する場合、どうなメソッドを利⽤しますか
//		 1. String.valueOf(“1.0F“)
//		 2. 1.0F + ““
        //这题选择1. String.valueOf(“1.0F“)
        // 使用 String.valueOf 方法将 float 转换为字符串
        float floatValue = 1.0F;
        String stringValue = String.valueOf(floatValue);

        System.out.println("使用 String.valueOf 转换结果：" + stringValue);

        // 使用 float + "" 的方法将 float 转换为字符串
        float floatValue2 = 1.0F;
        String stringValue2 = floatValue2 + "";

        System.out.println("使用 float + \"\" 转换结果：" + stringValue2);
        //输出结果为 使用 String.valueOf 转换结果：1.0
        //  使用 float + "" 转换结果：1.0

//		質問４︓以下式の値を記載してください。
//		 1. 1.0 + 2.0
//		 2. 1.0 + “2.0“
     // 1. 1.0 + 2.0
        double result1 = 1.0 + 2.0;
        System.out.println("1.0 + 2.0 的结果：" + result1);

        // 2. 1.0 + "2.0"
        String result2 = 1.0 + "2.0";
        System.out.println("1.0 + \"2.0\" 的结果：" + result2);
        //输出结果是 1.0 + 2.0 的结果：3.0
        // 1.0 + "2.0" 的结果：1.02.0
        
//		質問５︓以下ステートメントの出⼒を記載してください。
//		 1 public static void main(String[] args) {
//		 2 int a = 10; 
//		 3 System.out.println("a"); 
//		 4 }
//		
       int a = 10;
        System.out.println(a); 
     //输出结果是 10
		

	}
}
