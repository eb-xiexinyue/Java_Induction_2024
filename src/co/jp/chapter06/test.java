package co.jp.chapter06;

public class test {
	

//		 private static void sayHello(String y) {
//		 y = "Hello world";
//		 }
//		 public static void main(String args[]) {
//		 String x = null;
//		 sayHello(x);
//		
//		 System.out.println(x);
//		 
//		}

//		 private static void fillArray(String[] array) {
//		 array[0] = "value2";
//		 }
//		 public static void main(String args[]) {
//		 String[] array = new String[]{"value1"};
//		 fillArray(array);
//		 System.out.println(array[0]);
//		 }


//	 private static void fillArray(String[] array) {
//	 array = new String[]{"1", "2"};
//	 }
//	 public static void main(String args[]) {
//	 String[] array = null;
//	 fillArray(array);
//	 System.out.println(array == null);
//	 } 

//
//	public static void printArray(Object[] objs) {
//		 if(objs == null) {
//		 System.out.println("null");
//		 return;
//		 }
//		 String prefix = "";
//		 StringBuilder sb = new StringBuilder();
//		 sb.append("[");
//		 for(Object obj : objs) {
//		 sb.append(prefix);
//		 sb.append(String.valueOf(obj));
//		 prefix = ", ";
//		 }
//		 sb.append("]");
//		 System.out.println(sb.toString()); }
//
//public static void main(String[] args) {
//Object[] myArray = {1, "two", 3.0, true};
//printArray(myArray);
////System.out.println(Arrays.toString(myArray)); 
//}

	    public static int[] subArray(int[] array, int startIndex, int length) {

	        if (array == null || startIndex < 0 || startIndex >= array.length || length < 0) {
	            return null;
	        }

	        int actualLength = Math.min(length, array.length - startIndex);

	        int[] subArray = new int[actualLength];

	        System.arraycopy(array, startIndex, subArray, 0, actualLength);

	        return subArray;
	    }

	    public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};

	        int startIndex = 1;
	        int length = 5;
	        int[] resultArray = subArray(originalArray, startIndex, length);

	        System.out.print("Original Array: [");
	        for (int i = 0; i < originalArray.length; i++) {
	            System.out.print(originalArray[i]);
	            if (i < originalArray.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");

	        System.out.print("SubArray: [");
	        for (int i = 0; i < resultArray.length; i++) {
	            System.out.print(resultArray[i]);
	            if (i < resultArray.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	}


