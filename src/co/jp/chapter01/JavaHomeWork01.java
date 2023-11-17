package co.jp.chapter01;

public class JavaHomeWork01 {

	static int num;

	public static void main(String[] args) {

		// 質問０１    
		//变量 i 被赋值为 10，然后计算 i 除以 5 的余数，结果赋给变量 n。所以，10 除以 5 的余数是0,n为0
	    int i = 10;
	    int n = i%5;
		System.out.println(n);
		//输出n=0
		
		// 質問２︓ 右の式を解釈してください: a = a > 10 ? 11 : 0;
		// 回答:a大于10的时候，a=11，否则a就为0
		
		// 質問３︓変数値を⽐較する演算⼦は = or == ?

		int x = 5;
		int y = 10;
		if (x == y) {
			System.out.println("xとyは等しいです。");
		 } else {
		  System.out.println("xとyは等しくありません。");
		}


		// 質問４︓ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		//true or false
	}

}
