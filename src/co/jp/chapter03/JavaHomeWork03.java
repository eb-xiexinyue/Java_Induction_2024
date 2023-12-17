package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//2023.11.27上课课堂练习
//		 for(int i=0;i<11;i++) {
//			for(int j=0;j<11;j++) {
//				if(i==j||i+j==10||i==5||j==5 ) {
//					System.out.print(i+""+j+"	");
//				}else {
//					System.out.print("	");
//				}
//			}
//			System.out.println();
//		}
		// 質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
		// D, 60以下︓E」
//		 int a = 56;
//		 System.out.println("成績ランキング判断。入力値=" + a);  
//		 if(a >= 90) { 
//		 System.out.println("A"); 
//		 } else if(a >= 80 && a < 90) { 
//		 System.out.println("B"); 
//		 } else if(a >= 70 && a < 80) { 
//		 System.out.println("C"); 
//		 } else if(a >= 60 && a < 70) { 
//		 System.out.println("D"); 
//		 } else { 
//		 System.out.println("E"); 
//		 }
		// 質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０ 
		 //円のコイン数をもとめください。

//		int amount = 3340;
//		int count500 = amount / 500;//%= 是一个复合赋值运算符，表示取余并赋值.
//		amount %= 500;//将 amount 除以 500 得到余数，并将余数赋值给 amount,
//                      //amount 的值就更新为剩下的金额，即 340 元。
//		int count100 = amount / 100;
//		amount %= 100;
//
//		int count10 = amount / 10;
//		amount %= 10;
//
//		int count5 = amount / 5;
//		amount %= 5;
//
//		int count1 = amount;
//
//		System.out.println("500円: " + count500 + "枚");
//		System.out.println("100円: " + count100 + "枚");
//		System.out.println("10円: " + count10 + "枚");
//		System.out.println("5円: " + count5 + "枚");
//		System.out.println("1円: " + count1 + "枚");
     
		
		
		
		
		
		
		
		
		
		
        System.out.println(sumOverload(3,7));
		
		System.out.println(sumOverload("3","7"));
		
		System.out.println(sumOverload("3","7","10"));
	}
	
	//a=1,b=2    return 3
	static int sumOverload(int a, int b) {
		return a+b;
	}
	
	//a="1",b="2"  return 3
	static int sumOverload(String a, String b) {
		return Integer.valueOf(a) + Integer.valueOf(b);
	}
	
		static int sumOverload(String a, String b,String c) {
			return Integer.valueOf(a) + Integer.valueOf(b)+Integer.valueOf(c);
		}
		
	

		
		
		 
	
		
		
	}

