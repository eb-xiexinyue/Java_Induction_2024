package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
               
                if (i == j || i + j == 10 || i== 5 || j == 5) {
                    System.out.print(i +" " + j +"");
                } else {
                  
                    System.out.print("   ");
                }
            }
            
            System.out.println();
		  
	}
		
		
	}
}
		
		
	