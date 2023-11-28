package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１: 成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓ D, 60以下︓E」
		//回答　:
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		
		if (a>=90) {
			System.out.println("A");
			
		} else if(a>=80) {
			 System.out.println("B"); 
			 
		} else if(a>=70) {
			 System.out.println("C"); 
			 
		} else if(a>=60) {
			 System.out.println("D"); 
			 
	    } else {
			 System.out.println("E"); }	
		
	
		//質問２: ⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０ 円のコイン数をもとめください。
	    //回答　:
	    for (int x=0;x<7;x++) {
	    	for (int y=0;y<34;y++) {
	    		for(int j=0;j<669;j++) {
	    			for(int k=0;k<3341;k++) {
	    				if(500*x+100*y+5*j+1*k==3340) {
	    					System.out.println("500円のコイン数="+x+"  100円のコイン数="+y+"  5円のコイン数="+j+"  1円のコイン数="+k);
	    				}
	    			}
	    	}
	    
	    	}
	    }
	}
}

	
	
	
	
	
	
