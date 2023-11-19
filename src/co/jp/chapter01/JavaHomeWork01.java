package co.jp.chapter01;

public class JavaHomeWork01 {

	static int num;

	public static void main(String[] args) {

		// 質問０１
		// int i = 10;
		// int n = i%5;
		int i=10;
		int n=i%5;
		System.out.println(n);

		// N = 0

		// 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		// 回答：这是一个条件的三元运算符。其格式为：条件表达式？值1：值2；
        //执行流程是：首先计算关系表达式的值，即a>10是否等于a，如果值为true，则返回值1，即11。如果为false，则返回值2，即0。
		
		

		// 質問３︓変数値を比較する演算⼦は = or == ?
		//回答：应该使用“==”来判断变数是否相等。
		//因为，“=”符号代表的是一般的赋值关系，代表将等号右边的数值赋值给左边。而“==”符号代表的是“判断两个值是否相等”，相等则返回true，不相等则返回false。
		//因此“==”更适合用于比较值。


		// 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
        //回答：true和false

	}

}
