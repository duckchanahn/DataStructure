package calculation;

public class GCD {
	
	public int gcd(int m, int n) {
		// TODO Auto-generated method stub
		// * 유클리드 알고리즘, 호제법 * m > n일 때,
		// m % n == 0 일 때, n이 최대공약수
		// m % n != 0일 때, gcd(n, m%n);
		if(n == 0) {
			return m;
		}else {
			return gcd(n, m % n);
		}
	}
	
}
