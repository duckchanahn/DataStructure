package calculation;

public class NumberCalculation {
	
	/*** 연습 1 ***/
	// 1번 문제
	/*
	System.out.println("*** 1번 문제 ***"); // 자연수 n까지의 합 구하기
	System.out.println(sum(3)); // 0 1 2 3 => 6
	System.out.println();
	
	// 2번 문제
	System.out.println("*** 2번 문제 ***"); // n 팩토리얼 구하기
	System.out.println(factorial(3)); // 3*2*1 => 6
	System.out.println();
	
	// 3번 문제
	System.out.println("*** 3번 문제 ***"); // 최대공약수 구하기
	System.out.println(gcd(3, 6)); // 1, 2, 3 // 1, 2, 3, 6
	System.out.println();
	*/
	/*** 연습 1 ***/
	
	public int factorial(int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
			return 1;
		}
		return factorial(n-1) * n;
	}
	
	public int sum(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 0;
		}
		return sum(n-1) + n;
	}
	
}
