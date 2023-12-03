package co.jp.chapter03;

public class Javahomework3 {
	//質問２
	public static void main(String[] args) {
	 int a = 3340;
	  System.out.println("総金額" + a);
	  
	  if(a%500>=0) {
		  System.out.println("五百円枚数="+(a-a%500)/500);
	  if((a%500)%100>=0){
		  System.out.println("百円枚数="+(a%500)/100);
		 
	 if(((a%500)%100)%10>=0) {
			 System.out.println("十円枚数="+ ((a%500)%100)/10);
			 if((((a%500)%100)%10)%5>=0){
				 System.out.println("五円枚数="+ (((a%500)%100)%10)/5);
				 if ((((a%500)%100)%10)%5>=0) {
					 System.out.println("一円枚数="+ ((((a%500)%100)%10)%5)/1);
					 
				 }
			 }
		 }
	  }
	  }

	}

			 
	 
		// TODO 自動生成されたメソッド・スタブ
	//質問１
	public static void main1(String[] args) {
       int a = 56;
         System.out.println("成績ランキング判断。入力値=" + a);
          
          if(a>90) {
        	  System.out.println("A");

          } else if(a<=90&&a>80);{ 

        	  System.out.println("B"); 
        	  
          }else if(a<=80&&a>70){ 

        	  System.out.println("C");

          } else if(a<=70&&a>60){ 

        	  System.out.println("D");
	
          } else{

     	  System.out.println("E"); 
          
          }
}

}

		   

//