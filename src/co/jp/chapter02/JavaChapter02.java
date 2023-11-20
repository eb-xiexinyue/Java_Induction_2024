package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
	
		int n = 10;
		
		String s = "abc";
		
		String s1 = null;
		
		System.out.println(s);
		
		System.out.println(s1);
		
		System.out.println(n==10);
		
		System.out.println(s=="abc");
		
		System.out.println("「==」の比較結果"+(s1==s));
		
		System.out.println("「equals」の比較結果"+"abc".equals(s));
		
		String s2 = "";   //ブランク
		
		System.out.println("「equals」の比較結果"+s2.equals(s));
		
		System.out.println("length()　"+s.length());
		
		System.out.println("123".length());
		
		System.out.println("１２３".length());
		
		String mix = "ab" + "cd";
		
		String res1 = "1" + 2.0;  //　= "1"+"2.0"
		
		System.out.println(mix);
		System.out.println(res1);
		
		System.out.println("\\");
		
		char c = 'a';
		
		System.out.println("\'");
	}

}
