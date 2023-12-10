package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
		int a =56;
		System.out.println("成績ランキング判断。入力値＝" + a);
		if(a>=90)  {
			System.out.println("A");
		}else if(90>a && a>=80) {
			System.out.println("B");
		}else if(80>a && a>=70) {
			System.out.println("C");
		}else if(70>a && a>=60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}

/*質問２︓日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。	
		
答え：	500円コイン数：6
		100円コイン数：3
		10円コイン数：4
		計：3340
		*/
		
		int x = 3340;
		int b = 0;//500円
		int c = 0;//100円
		int d = 0;//10円
		int e = 0;//5円
		int f = 0;//1円
		
		while (500*b<=x) {
			b++;
			
			if(500*b==3000) {
				System.out.println("500円コイン数：" + b);
				while (100*c<=x) {
					c++;
					if(100*c==300) {
						System.out.println("100円コイン数：" + c);
						while (10*d<=x) {
							d++;
							if(10*d==40) {
								System.out.println("10円コイン数：" + d);
								System.out.println(d*10+c*100+b*500);//確認のため
							}
							
							
						}
					}

				}
			}

			
		}
		
				
		}
		
			
		
		
		

    }


