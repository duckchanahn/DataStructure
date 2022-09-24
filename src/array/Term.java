package array;

public class Term {
	
	int coef; // coefficient -> ���
	int exp; // exponential -> ����
	
	public Term(int c, int e) {
		// TODO Auto-generated constructor stub
		coef = c;
		exp = e;
	}
	
	
	@Override
	public boolean equals(Object other) {
		// override��, �ڱ� ������ ������ �ִ� �� �״�� ������� �Ѵ�!
		return ( this.exp == ((Term)other).exp );
	}
	
	@Override
	public String toString() {
		return coef + "X^" + exp;
	}
	
}
