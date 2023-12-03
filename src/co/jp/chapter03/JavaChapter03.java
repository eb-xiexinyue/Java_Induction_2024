package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 int totalAmount = 3340;
		   int[] coinValues = {500, 100, 10, 5, 1};
	        int[] coinCounts = new int[coinValues.length];

	        for (int i = 0; i < coinValues.length; i++) {
	            coinCounts[i] = totalAmount / coinValues[i];
	            totalAmount %= coinValues[i];
	        }
	        for (int i = 0; i < coinValues.length; i++) {
	            System.out.println(coinValues[i] + "円: " + coinCounts[i] + "枚");
	        }
	     
	}
}
