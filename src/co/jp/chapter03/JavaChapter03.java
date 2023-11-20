package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 3;
		
		int b = 2;
		
		int c = 3;
		
//		if(a<b) {
//			System.out.println("a<b");
//		}else {
//			System.out.println("a>=b");
//		}
		
		int age = 60;
		
		if(age<12) {
			
			System.out.println("子供");
			
		}else if(age < 18){ //  age < 18 && age >= 12
			
			System.out.println("少年");
			
		}else if(age < 35){ //  age < 35 && age >= 18
			
			System.out.println("青年");
			
		}else if(age < 60) { //  age < 60 && age >= 35
			
			System.out.println("中年");
			
		}else { //  age >=60
			
			System.out.println("高齢者");
			
		}
		
		int grade = 10;
		
		switch(grade) {
			case 1 : 
				System.out.println("一年生");
				break;
			case 2 : 
				System.out.println("二年生");
				break;
			case 3 : 
				System.out.println("三年生");
				break;
			case 4 : 
				System.out.println("四年生");
				break;
			case 5 : 
				System.out.println("五年生");
				break;
			case 6 : 
				System.out.println("六年生");
				break;
			default:
				System.out.println("入力エラー");
				break;
		}
		
//		for(int i=0;i<5;i++) {
//			System.out.println("現時点のiの値は："+i);
//		}
		
		int i = 0;
		
		
		
//		for(;;) {
//			if(i<5) {
//				System.out.println("現時点のiの値は："+i);
//				i++;
//			}
//			else {
//				break;
//			}
//		}
		
		for(;i<5;) {
			System.out.println("現時点のiの値は："+i);
			i++;
		}
		
		System.out.println("----------------------------------");
		
		int j = 0;
		
		while(j<5) {
			System.out.println("現時点のiの値は："+j);
			j++;
		}
	}
}
