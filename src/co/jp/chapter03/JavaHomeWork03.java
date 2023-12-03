package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	//質問１
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);

		if (a >= 90) {
		    System.out.println("A");
		} else if (a >= 80) {
		    System.out.println("B");
		} else if (a >= 70) {
		    System.out.println("C");
		} else if (a >= 60) {
		    System.out.println("D");
		} else {
		    System.out.println("E");
		}
	//質問２
		   int total = 3340;
		   int[] coin= {500, 100, 10, 5, 1};
	       int[] coincounts = new int[coin.length];

	        for (int i = 0; i < coin.length; i++) {
	            coincounts[i] = total/ coin[i];
	            total %= coin[i];
	        }
	        for (int i = 0; i < coin.length; i++) {
	            System.out.println(coin[i] + "円: " + coincounts[i] + "枚");
	        }
	}
}