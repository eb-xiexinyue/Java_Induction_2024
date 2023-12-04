package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
//	質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
//	D, 60以下︓E」
//	回答：
	
//	int a = 56;
//	System.out.println("成績ランキング判断。入力値=" + a);
//	
//	// 以下コードを完成してください。
//	if(a>=90 && a<=100  ) {
//	 System.out.println("A");
//	} else if(a>=80 ) {
//	 System.out.println("B");
//	} else if(a>=70 ) {
//	 System.out.println("C");
//	} else if(a>=60 ) {
//	 System.out.println("D");
//	} else {
//	 System.out.println("E");
//	}
//	
//	}

//  質問２：日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
//　回答：


   int money = 3340;
   
   int n500 = money/500;
   int n100 = (money % 500) / 100;
   int n50 = (money % 100) / 50;
   int n10 = (money % 50) / 10;
   int n5 = (money % 10) / 5;
   int n1 = (money % 5);

    System.out.println( money +"は 500円 " + n500 +"枚");
    System.out.println("100円 " + n100 +"枚");
    System.out.println("50円 " + n50 +"枚");
    System.out.println("10円 " + n10 +"枚");
    System.out.println("1円 " + n1 +"枚");
	
}
}


  
    
    

	
