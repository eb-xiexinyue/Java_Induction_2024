package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		int a = 56;
			System.out.print("成績ランキング判断。入力値=" + a);
		// 以下コードを完成してください。
		if(a>=90) {
			System.out.println("A");
		} else if(a>=80) {
			System.out.println("B");
		} else if(a>=70) {
			System.out.println("C");
		} else if(a>=60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		
		
		//質問２︓日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		int A = 3340;
		
		int c500 = A / 500;
			System.out.println("500円: " + c500 + "枚");
		A %= 500;

        int c100 = A / 100;
        	System.out.println("100円: " + c100 + "枚");
        A %= 100;

        int c10 = A / 10;
         	System.out.println("10円: " + c10 + "枚");
         A %= 10;

        int c5 = A / 5;
		 	System.out.println("5円: " + c5 + "枚");
		 A %= 5;

        int c1 = A;
        	System.out.println("1円: " + c1 + "枚");

        int cA= c500 + c100 + c10 + c5 + c1;
        	System.out.println("合計コイン数: " + cA + "枚");	
		

	}
}