package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		     //答え：array[0]=0,array[1]=0,array[2]=0,array[3]=0なので、｛0,0,0,0｝の行列になります。

		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		     //答え：array[0]=5,array[1]=6なので、｛5,6｝の行列になります。

		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		     //答え：二行三列の行列で、デフォルトは0ですので、
		     //     ｛0,0,0}
		     //      {0,0,0}           になります。

		//問題４︓以下２重Foreachを理解してください。
		//int[][] array2d = new int[4][2];
		//for (int[] out : array2d) {
			// for (int inner : out) {
			 //System.out.println(inner);
			   //  }
		       //}
		     //答え：４行２列の行列で、デフォルトは0ですので、
			 //｛0,0}
			 //｛0,0}
			 //｛0,0}
			 //｛0,0}             になります。
			 //for (int[] out : array2d) {  は各行から順番に取り出しの意味で、
			 // for (int inner : out) {     は各行の中の要素から順番に取り出すという意味です。
			 //System.out.println(inner);   は最後でプリントアウトします。

		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
             //答え：
			 int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 
			 int maxValue = array[0];
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] > maxValue) {
		                maxValue = array[i];
		                                     }
		                                               }
		        System.out.println("最大値: " + maxValue);
			
		        int minValue = array[0];
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] < minValue) {
		                minValue = array[i];
		            }
		        }
		        System.out.println("最小値: " + minValue);

		 //問題６︓問題１の配列のSUMを求める。
		        int[] array1 = new int[4];
		        int sum = 0;
                for (int a = 0; a < array1.length; a++) {
		            sum += array1[a];
		        }
                System.out.println("Sum= " + sum);

	    //問題７ 行列（２次元配列）の和と積を計算してください。
        //答え：和
                int[][] matrix1 = new int[][]{
                	{1, 2},
                	{3, 4}
                };
                int[][] matrix2 = new int[][]{
                	{5, 6},
                	{7, 8}
                };
                int[][] resultMatrix = new int[2][2];
                for (int i = 0; i < 2; i++) {
                	for (int j = 0; j < 2; j++) {
                		resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                	}
                }    
                for (int i = 0; i < resultMatrix.length; i++) {
                	for (int j = 0; j < resultMatrix[i].length; j++) {
                		System.out.print(resultMatrix[i][j] + " ");
                	}
                	System.out.println();
                	}
                
          //積
                int[][] matrixA = {
        	            {1, 2},
        	            {3, 4}
        	        };

        	        int[][] matrixB = {
        	            {5, 6},
        	            {7, 8}
        	        };

        	       
        	        int rows = matrixA.length;
        	        int cols = matrixB[0].length;
        	        int[][] resultMatrix２= new int[rows][cols];

        	        for(int i = 0; i < rows; i++) {
        	            for(int j = 0; j < cols; j++) {
        	                for(int k = 0; k < matrixB.length; k++) {
        	                    resultMatrix２[i][j] += matrixA[i][k] * matrixB[k][j];
        	                }
        	            }
        	        }

        	        for(int i = 0; i < resultMatrix２.length; i++) {
        	            for(int j = 0; j < resultMatrix２[i].length; j++) {
        	                System.out.print(resultMatrix２[i][j] + " ");
        	            }
        	            System.out.println();
        	        }
        	    }
	 }
 


	                     
                    

