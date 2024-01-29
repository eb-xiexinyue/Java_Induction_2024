package co.jp.chapter09;

public class JavaHomeWork09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//質問１︓以下ソースにラムダ式の使う場所を解釈してください。		
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUISample {

		public static void main(String[] args) {
			JFrame window = new JFrame("DCNet Java 教育");
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setSize(800, 600);
			JButton btn = new JButton("hello world");
			window.getContentPane().add(btn);

			btn.addActionListener((ActionEvent e) -> {
				System.out.println("ボタンクリックしました。");
			});	

			window.setVisible(true);
		}
}
//回答：	btn.addActionListener((ActionEvent e) -> {
//				System.out.println("ボタンクリックしました。");
//			});	
//addActionListener方法期望一个ActionListener对象作为参数，而 ActionListener是一个接口，只包含一个方法actionPerformed，该方法在按钮被点击时调用。




//質問２︓以下ソースに匿名クラスの利用する行は︖
public class Kicker {

	public static void main(String... args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("thread running...");
			}
		}.start();
	}
}		
//回答：new Thread() {
//			@Override
//			public void run() {
//		System.out.println("thread running...");
//			}
//		}.start();		
//new Thread() {...}は匿名クラスを作成してThreadクラスを継承し、run メソッドをオーバーライドしている。
//startメソッドを呼び出すことで、新しいスレッドが開始される。		
		
		
	}

}
