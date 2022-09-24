package calculation;

public class Fibonacci {
	
	/**
	// 4번 문제
	System.out.println("*** 4번 문제 ***"); // 피보나치 수열의 n번째 요소 구하기
	System.out.println(fibonacci(6)); // 6 // 1, 1, 2, 3, 5, 8
	System.out.println();
	**/
	private static final int MAX_SIZE = 100;
	private static int [] arr = new int [MAX_SIZE];
	
	public int fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public int fibonacciMemo(int n) {
		if(n == 1 || n == 2) { return arr[n] = 1; }
		if(arr[n] > 0) { return arr[n]; }
		else{
			return arr[n] = fibonacciMemo(n-1) + fibonacciMemo(n-2);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fibo = new Fibonacci();
		// -> 1 하면, 첫번째! // 즉, 여기서는 1부터인 것!
		System.out.println(fibo.fibonacci(6));
		// 1 1 2 3 5 8 13 21 ...
		System.out.println(fibo.fibonacciMemo(6));
		
		for(Integer n : arr) {
			System.out.print(n + " ");
		}
	}
	
}
