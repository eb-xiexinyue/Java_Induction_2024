package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問1
				int a = 56;
				System.out.println("成績ランキング判断。入力値=" + a);
		        

		        if (a >= 90 && a <= 100) {
		            System.out.println("A");
		        } else if (a >= 80 && a <= 90) {
		            System.out.println("B");
		        } else if (a>= 70 && a <= 80 ) {
		            System.out.println("C");
		        } else if (a >= 60 && a <= 70){
		            System.out.println("D");
		        } else {
		            System.out.println("E");
		        }
		        
		 //質問２
		        
		        int okane = 3340; 
		        int[] coin = {500, 100, 10, 5, 1}; 
		        int[] coins = new int[coin.length]; 

		        for (int i = 0; i < coin.length; i++) {
		        coins[i] = okane / coin[i]; 
		        okane -= coins[i] * coin[i]; 
		                }

		                // 結果の表示
		                System.out.println("３３４０円のコイン数をもとめた結果：");
		                for (int i = 0; i < coin.length; i++) {
		                    System.out.println(coin[i] + "円: " + coins[i] + "枚");
		                }
		            }
		        

		    
	
	
}
