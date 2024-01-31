package ch09.resolve07;

public class ArrayUtility {
	private double[] intToDouble;	// int배열을 double배열로 변환
	private int[] doubleToInt;		// double배열을 int배열로 변환
	
	public ArrayUtility(double[] intToDouble,int[] doubleToInt) {
		this.doubleToInt = doubleToInt;
		this.intToDouble = intToDouble;
	}
	
    // int 배열을 double 배열로 변환하는 static 메소드
    public static double[] intToDouble(int[] source) {
        double[] result = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = (double) source[i];
        }
        return result;
    }
    // double > int 변환하는 static 메소드
    public static int[] doubleToInt(double[] source) {
    	int[] result = new int[source.length];
    	for(int i=0; i<source.length; i++) {
    		result[i] = (int)source[i];
    	}
    	return result;
    }
    // 테스트를 위한 main 메소드
    public static void main(String[] args) {
        // int 배열 생성 및 초기화
        int[] intArray = {1, 2, 3, 4, 5};

        // int 배열을 double 배열로 변환
        double[] doubleArray = intToDouble(intArray);

        // 변환된 double 배열 출력
        System.out.print("int 배열을 double 배열로 변환한 결과: ");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }

        System.out.println(); // 줄 바꿈

        // double 배열 생성 및 초기화
        double[] anotherDoubleArray = {2.5, 4.0, 6.3, 8.1};

        // double 배열을 int 배열로 변환
        int[] anotherIntArray = doubleToInt(anotherDoubleArray);

        // 변환된 int 배열 출력
        System.out.print("double 배열을 int 배열로 변환한 결과: ");
        for (int value : anotherIntArray) {
            System.out.print(value+" ");
            	
        }
    }
	
}
