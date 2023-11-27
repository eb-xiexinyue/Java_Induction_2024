package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		int a = 3;
//		
//		int b = 2;
//		
//		int c = 3;
//		
//		if(a<b) {
//			System.out.println("a<b");
//		}else {
//			System.out.println("a>=b");
//		}
//		
//		int age = 60;
//		
//		if(age<12) {
//			
//			System.out.println("子供");
//			
//		}else if(age < 18){ //  age < 18 && age >= 12
//			
//			System.out.println("少年");
//			
//		}else if(age < 35){ //  age < 35 && age >= 18
//			
//			System.out.println("青年");
//			
//		}else if(age < 60) { //  age < 60 && age >= 35
//			
//			System.out.println("中年");
//			
//		}else { //  age >=60
//			
//			System.out.println("高齢者");
//			
//		}
//		
//		int grade = 10;
//		
//		switch(grade) {
//			case 1 : 
//				System.out.println("一年生");
//				break;
//			case 2 : 
//				System.out.println("二年生");
//				break;
//			case 3 : 
//				System.out.println("三年生");
//				break;
//			case 4 : 
//				System.out.println("四年生");
//				break;
//			case 5 : 
//				System.out.println("五年生");
//				break;
//			case 6 : 
//				System.out.println("六年生");
//				break;
//			default:
//				System.out.println("入力エラー");
//				break;
//		}
		
//		for(int i=0;i<5;i++) {
//			System.out.println("現時点のiの値は："+i);
//		}
		
		
		
		
		
//		for(;;) {
//			if(i<5) {
//				System.out.println("現時点のiの値は："+i);
//				i++;
//			}
//			else {
//				break;
//			}
//		}
		
		//int i = 0;
		
//		System.out.println("for loop start");
//		
//		for(int i=0;i<5;i++) {
//			
//			if(i%2==1) {
//				System.out.println("現時点のiの値は："+i);
//			}
//			else {
//				continue;
//			}		
//			//i++;
//			
//		}
		
		//dead code
		
//		System.out.println("for loop end");
//		
//		System.out.println("while loop start");
//		
//		int j = 0;
//		
//		while(j<5) {
//			System.out.println("現時点のjの値は："+j);
//			j++;
//			
//			if(j==3) {
//				break;
//			}
//		}
//		
//		System.out.println("while loop end");
//		
//		System.out.println("do...while loop start");
//		
//		int k=0;
//		
//		do {
//			System.out.println("現時点のkの値は："+k);
//			k++;
//			
//			if(k==3) {
//				break;
//			}
//		}while(k<5);
//		
//		System.out.println("do...while loop end");
		
//		System.out.println("----------------------------------");
//		
//		int j = 0;
//		
//		while(j<5) {
//			System.out.println("現時点のiの値は："+j);
//			j++;
//		}
		
		
		//20231127
		
		int in = 22;
		
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
					
					//方案1
//					if(i+j==in/2-1||i-j==in/2||i+j==in/2+1||j-i==in/2) {
//						System.out.print(i+""+j+"	");
//					}
//					else {
//						System.out.print("	");
//					}
					
					//方案2
					if(i<in/2) {
						if(j<in/2) {
							if(Math.abs(i-(in/2-1))+Math.abs(j-(in/2-1))==(in/2-1)) {
								System.out.print(i+""+j+"	");
							}
							else {
								System.out.print("	");
							}
						}
						else {
							if(Math.abs(i-(in/2-1))+Math.abs(j-(in/2))==(in/2-1)) {
								System.out.print(i+""+j+"	");
							}
							else {
								System.out.print("	");
							}
						}
					}
					else {
						if(j<in/2) {
							if(Math.abs(i-(in/2))+Math.abs(j-(in/2-1))==(in/2-1)) {
								System.out.print(i+""+j+"	");
							}
							else {
								System.out.print("	");
							}
						}else {
							if(Math.abs(i-(in/2))+Math.abs(j-(in/2))==(in/2-1)) {
								System.out.print(i+""+j+"	");
							}
							else {
								System.out.print("	");
							}
						}
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
		
		//郑桑方案
		
		int in1 = 22;
		
		for(int i=0;i<in1;i++) {
			for(int j=0;j<in1;j++) {
//				if(i==j||i+j==10||i==5||j==5) {
//					System.out.print(i+""+j+"	");
//				if(i+j==5||i-j==5||i+j==15||j-i==5) {
//					System.out.print(i+""+j+"	");
//				}else {
//					System.out.print("	");
//				}
				
				if(in1%2==1) {
					if((Math.abs(i-(in1-1)/2)+Math.abs(j-(in1-1)/2))==(in-1)/2) {
						System.out.print(i+""+j+"	");
					}else {
						System.out.print("	");
					}
				}
				else {
					if(i+j==in1/2-1||i-j==in1/2||i+j==in1/2+in1-1||j-i==in1/2) {
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
