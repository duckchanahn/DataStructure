package calculation;

public class GCD {
	
	public int gcd(int m, int n) {
		// TODO Auto-generated method stub
		// * ��Ŭ���� �˰���, ȣ���� * m > n�� ��,
		// m % n == 0 �� ��, n�� �ִ�����
		// m % n != 0�� ��, gcd(n, m%n);
		if(n == 0) {
			return m;
		}else {
			return gcd(n, m % n);
		}
	}
	
}
