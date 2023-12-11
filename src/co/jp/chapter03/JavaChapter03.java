package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		for(int i=0;i<11;i++) {
//			for(int j=0;j<11;j++) {
//				if(Math.abs(i-5)+Math.abs(j-5)==5) {
//					System.out.print(i+""+j+"	");
//				}else {
//					System.out.print("	");
//				}
//			}
//			System.out.println();
//		}

		int in = 8;
		
		for(int i=0;i<in;i++) {
			for(int j=0;j<in;j++) {
//				if(i==j||i+j==10||i==5||j==5) {
//					System.out.print(i+""+j+"	");
//				if(i+j==5||i-j==5||i+j==15||j-i==5) {
//					System.out.print(i+""+j+"	");
//				}else {
//					System.out.print("	");
//				}
				
				if(in%2==1) {
					if((Math.abs(i-(in-1)/2)+Math.abs(j-(in-1)/2))==(in-1)/2) {
						System.out.print(i+""+j+"	");
					}else {
						System.out.print("	");
					}
				}
				else {
					if(i+j==in-4||i-j==in-4||i+j==in+3||j-i==in-4) {
						System.out.print(i+""+j+"	");
					}
					else {
						System.out.print("	");
					}
				}
								
//				 if (j == 5 - i || j == i - 5 || j == 15 - i || j == i + 5) {
//		                
//	                    if (!(i == 5 && j == 5)) {
//	                        System.out.print(i + "" + j + "	");
//	                    }
//	                } else {
//	                    System.out.print("	"); 
//	            }
			}
			System.out.println();
		}
	}
}
