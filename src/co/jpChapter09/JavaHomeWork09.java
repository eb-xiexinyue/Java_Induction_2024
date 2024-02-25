package co.jpChapter09;

public class JavaHomeWork09 {
	public static void main(String[] args) {
		
	//質問１︓以下ソースにラムダ式の使う場所を解釈してください。
	     //import java.awt.event.ActionEvent;
	     //import java.awt.event.ActionListener;
	     //import javax.swing.JButton;
	     //import javax.swing.JFrame;
	     //public class GUISample {
	     // public static void main(String[] args) {
	     //JFrame window = new JFrame("DCNet Java 教育");
	     //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     //window.setSize(800, 600);
	     //JButton btn = new JButton("hello world");
	     //window.getContentPane().add(btn);
	     //btn.addActionListener((ActionEvent e) -> {
	     //System.out.println("ボタンクリックしました。");
	     //});
	     //window.setVisible(true);
	     // }
	     //}
	//答え：
	     //ラムダ式の使う場所はbtn.addActionListener((ActionEvent e) -> {である。
	     //ラムダ式は、ActionListenerのactionPerformedメソッドに対応します。
	     //ActionEventパラメータは使用されませんが、ラムダ式の形式を保つために引数として記述されています。
	
	//質問２︓以下ソースに匿名クラスの利用する行は？
	     //public class Kicker {
	     // public static void main(String... args) {
		 // new Thread() {
		 //@Override
		 //public void run() {
		 //System.out.println("thread running...");
		 //}
		 //}.start();
		 //}
		 //}
	//答え；
	     // new Thread() {
	     //@Override
	     //public void run() {
	     //System.out.println("thread running...");
	     //}
	     //}.start();
	     //}

}
}



