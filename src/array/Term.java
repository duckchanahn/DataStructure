package array;

public class Term {
	
	int coef; // coefficient -> 계수
	int exp; // exponential -> 지수
	
	public Term(int c, int e) {
		// TODO Auto-generated constructor stub
		coef = c;
		exp = e;
	}
	
	
	@Override
	public boolean equals(Object other) {
		// override는, 자기 조상이 가지고 있는 걸 그대로 덮어씌워야 한다!
		return ( this.exp == ((Term)other).exp );
	}
	
	@Override
	public String toString() {
		return coef + "X^" + exp;
	}
	
}
