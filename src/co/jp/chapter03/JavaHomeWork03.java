package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
	// 質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓
				// D, 60以下︓E」
				 int a = 56;
				 System.out.println("成績ランキング判断。入力値=" + a);  
				 if(a >= 90) { 
				 System.out.println("A"); 
				 } else if(a >= 80 && a < 90) { 
				 System.out.println("B"); 
				 } else if(a >= 70 && a < 80) { 
                 System.out.println("C"); 
				 } else if(a >= 60 && a < 70) { 
				 System.out.println("D"); 
				 } else { 
				 System.out.println("E"); 
				 }
        // 質問２：日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。

				int sum = 3340;
				int[] coin= {500, 100, 10, 5, 1};
			    int[] coincounts = new int[coin.length];

			        for (int i = 0; i < coin.length; i++) {
			            coincounts[i] = sum/ coin[i];
			            sum %= coin[i];
			        }
			        for (int i = 0; i < coin.length; i++) {
			            System.out.println(coin[i] + "円: " + coincounts[i] + "枚");
			        }

		
		}
		
	}	


	}
}
