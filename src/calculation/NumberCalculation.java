package calculation;

public class NumberCalculation {
	
	/*** ���� 1 ***/
	// 1�� ����
	/*
	System.out.println("*** 1�� ���� ***"); // �ڿ��� n������ �� ���ϱ�
	System.out.println(sum(3)); // 0 1 2 3 => 6
	System.out.println();
	
	// 2�� ����
	System.out.println("*** 2�� ���� ***"); // n ���丮�� ���ϱ�
	System.out.println(factorial(3)); // 3*2*1 => 6
	System.out.println();
	
	// 3�� ����
	System.out.println("*** 3�� ���� ***"); // �ִ����� ���ϱ�
	System.out.println(gcd(3, 6)); // 1, 2, 3 // 1, 2, 3, 6
	System.out.println();
	*/
	/*** ���� 1 ***/
	
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
