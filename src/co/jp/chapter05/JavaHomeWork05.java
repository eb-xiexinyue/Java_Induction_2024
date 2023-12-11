package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問1
//		int sum = 0;
//		for(int i = 0; i < 101; i=i+2) {
//			
//		
//			sum = sum + i;
//		
//		}
//		 
//		System.out.println(sum);
		
//		質問2
//		int j = 1;
//		for(int i = 1; i < 6; i++) {
//			j = j * i  ;
//			
//		}
//		System.out.println(j);
		
//		質問3
//		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		int max = array[0]; 
//		for(int i = 0; i < array.length; i++) {
//		 if(array[i] > max) {
//			 max = array[i];
//		 }
//		}
//		System.out.println("配列に最大値=" + max); 
		
//		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		int min = array[0]; 
//		for(int i = 0; i < array.length; i++) {
//		 if(array[i] < min) {
//			 min = array[i];
//		 }
//		}
//		System.out.println("配列に最小値=" + min); 
		
//		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		int sum = 0; 
//		for(int i = 0; i < array.length; i++) {
//			 sum = sum+array[i];
//		 }
//		
//		System.out.println("配列に和=" + sum); 
		
//		
//		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		int j = array.length;
//		int sum = array[0]; 
//		for(int i = 0; i < array.length; i++) {
//		 
//			 sum = sum+array[i];
//		}
//		System.out.println("配列に平均数=" + (sum/j)); 
		
////		質問4
//	    int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//	    int same=0;
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array.length; j++)
//			  if (array[i] == array[j]) {
//				  same = array[i];
//			  }
//		}
//		
//		System.out.println("同じ要素=" + same ); 
		
//		質問5
//		 int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
//		    int index7=0;
//			for(int i = 0; i < array.length; i++) {
//				  if (array[i] == 7) {
//					  index7 = i;
//				  }
//			}
//			
//			System.out.println("同じ要素=" + index7 ); 
		
//		質問6 不会

//		質問7 
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(i!=j) {
					if(array[i]>array[j]) {
						int temp=array[j];
						array[i]=array[j];
						array[i]=temp;
					}
				}
			}
		}
		
//		質問8 不会
		

	}
}
