package co.jp.chapter03;

//public class JavaHomeWork03 {

//	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


//	}
//	{

// 質問1		
// public static String calculateRank(int score) {
//       if (score >=90) {
//    	   return "A";
//       } else if (score >= 80) {
//    	   return "B";
//       } else if (score >= 70) {
//       	   return "C";
//       } else if (score >= 60) {
//    	   return "D";
//    	 }else {
//    		 return "E";
    				
//    	 }
//     }
//   }     


//質問2
//import java.util.Scanner;

//public class CoinCount {
//    public static void main(String[] args) {
//       
//		Scanner scanner = new Scanner(System.in);
//        System.out.print("3340円");
//        int amount = scanner.nextInt();

        
//        int[] coinCounts = calculateCoinCount(amount);

        
//        System.out.println("5枚");
//        System.out.println("500円: " + coinCounts[0] + " 6枚");
//        System.out.println("100円: " + coinCounts[1] + " 3枚");
//        System.out.println("10円: " + coinCounts[2] + " 4枚");
//        System.out.println("5円: " + coinCounts[3] + " 枚");
//        System.out.println("1円: " + coinCounts[4] + " 枚");

        
//        scanner.close();


    
//    public static int[] calculateCoinCount(int amount) {
//        int[] coinValues = {500, 100, 10, 5, 1};
//        int[] coinCounts = new int[5];

//        for (int i = 0; i < coinValues.length; i++) {
//            coinCounts[i] = amount / coinValues[i];
//            amount %= coinValues[i];
//        }

//        return coinCounts;
//    }
// }
