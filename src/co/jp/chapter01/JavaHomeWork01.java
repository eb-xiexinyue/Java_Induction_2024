package co.jp.chapter01;

public class JavaHomeWork01 {

	static int num;

	public static void main(String[] args) {

		// 質問１：
		// int i = 10;
		// int n = i%5;	
        // 回答　：n=0
		int i = 10;
		int n = i%5;

		System.out.println("nの値は"+n);


		// N = 0

		// 質問２：右の式を解釈してください: a = a > 10 ? 11 : 0;
		// 回答　：if a > 10, 11を返す；if a<=10, 0を返す。
		
		int a;
        a = 33;
		a = a > 10 ? 11 : 0;
		System.out.println(a = a > 10 ? 11 : 0);
				

		// 質問３：変数値を⽐較する演算⼦は = or == ?
        // 回答　：==
		
		// 質問４：ブリアン（ boolean ）変数に設定可能の値は「?」「?」。
		// 回答　：「true」 or 「false」


	}

}
