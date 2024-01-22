package co.jp.chapter07.copy;

public class JavaHomeWork07 {

	public static void main(String[] args) {

		//質問１
		//Pet类中没有setAge方法。其次，Kicker类中试着调用Pet的setAge方法，但这个setage方法在Pet类中不存在。

		//質問２
		public class Math {
		  
		    public static int findMax(int[] array) {
		        if (array.length == 0) {
		            throw new IllegalArgumentException("配列が空です。");
		        }

		        int max = array[0];
		        for (int value : array) {
		            if (value > max) {
		                max = value;
		            }
		        }
		        return max;
		    }

		  
		    public static int findMin(int[] array) {
		        if (array.length == 0) {
		            throw new IllegalArgumentException("配列が空です。");
		        }

		        int min = array[0];
		        for (int value : array) {
		            if (value < min) {
		                min = value;
		            }
		        }
		        return min;
		    }

		  
		    public static double findAverage(int[] array) {
		        if (array.length == 0) {
		            throw new IllegalArgumentException("配列が空です。");
		        }

		        int sum = 0;
		        for (int value : array) {
		            sum += value;
		        }

		        return (double) sum / array.length;
		    }

		  
		    public static int max(int[] input) {
		        return findMax(input);
		    }

		   
		    public static int min(int[] input) {
		        return findMin(input);
		    }

		
		    public static double average(int[] input) {
		        return findAverage(input);
		    }

	
		    public static void main(String[] args) {
		        int[] numbers = {14,28, 18, 901, 127};

		       
		        int max = max(numbers);
		        System.out.println("最大値: " + max);

		    
		        int min = min(numbers);
		        System.out.println("最小値: " + min);

		      
		        double average = average(numbers);
		        System.out.println("平均値: " + average);
		    }
		}
        //質問2.2
		//还没学会
	}

}
