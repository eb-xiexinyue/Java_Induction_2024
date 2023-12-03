package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		int n = 11; // 菱形的边长

		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        if (i + j >= n / 2 && i <= j && i + j <= 3 * n / 2) {
		            if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i + j == n / 2 || i + j == 3 * n / 2) {
		                System.out.print(i + "" + j + "  ");
		            } else {
		                System.out.print("   ");
		            }
		        } else {
		            System.out.print("   ");
		        }
		    }
		    System.out.println();
		}

	}
}
