package co.jp.chapter09;

public class JavaHomeWork09 {
	
//	質問１︓以下ソースにラムダ式の使う場所を解釈してください。
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	class GUISample {
		 public static void main(String[] args) {
		 JFrame window = new JFrame("DCNet Java 教育");
		 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 window.setSize(800, 600);
		 JButton btn = new JButton("hello world");
		 window.getContentPane().add(btn);
		 btn.addActionListener((ActionEvent e) -> {   //ここで、ラムダ式の使う場所で、
		 System.out.println("ボタンクリックしました。");  //ボタンをクリックすると、"ボタンクリックしました。"そういうメセージがコンソールに表示することを定義する。
		 });
		 window.setVisible(true);
		 }
		}
	
//	質問２︓以下ソースに匿名クラスの利⽤する⾏は︖
	public class Kicker {
		 public static void main(String... args) {
		 new Thread() {   //ここから（27行から32行まで）、匿名クラスの利⽤する⾏である。
		 @Override
		 public void run() {
		 System.out.println("thread running...");
		 }
		 }.start();
		 }
		}

}
