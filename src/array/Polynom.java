package array;

public class Polynom extends SimpleGenericLinkedList <Term> {
	// 다항식 // 2x^3 + 3x^2 + 5x + 7
	char polyName;
	
	public Polynom(char polyName) {
		// TODO Auto-generated constructor stub
		super();
		this.polyName = polyName;
	}
	
	public void addTerm(Term t) {
		if(head == null) {
			this.add(0, t);
		}else {
			GenericNode<Term> temp = head;
			int beforeSize = this.size; // 추가 이전의 사이즈를 저장해 고정
			for(int i=0; i < beforeSize; i++) { // 1
				// temp.data.exp == t.exp
				if(temp.data.equals(t)) { // 지수가 같은 경우
					int v = temp.data.coef + t.coef;
					if( v == 0 ) {
						remove(temp.data);
					}else {
						temp.data.coef = v;
					}
					break;
				}else { // 지수가 다른 경우
					// 원래 있는 게 차수가 더 작은 경우 -> 그 자리에다가 넣어줘야 한다!
					if(temp.data.exp < t.exp) {
						this.add(i, t);
						break;
					}else if(i == beforeSize-1) {
						// 하다하다 이게 제일 작은 차수인 경우
						this.add(this.sizeOf(), t);
						// break; // 마지막이니까 안 해도 된다!
					}
				}
				temp = temp.next; // 다음 차수의 항으로 이동
			}
		}
	}
	
	public void addPoly(Polynom other) {
		// Nothing
	}
	
	public Polynom addPoly(Polynom A, Polynom B) {
		GenericNode<Term> a = A.head;
		GenericNode<Term> b = B.head;
		Polynom newPoly = new Polynom('h');
		
		while (a != null && b != null) { // B의 지수가 A의 지수보다 큰 경우
			if (a.data.exp < b.data.exp) {
				newPoly.addTerm(new Term(b.data.coef, b.data.exp));
				b = b.next;
			} else if (a.data.exp > b.data.exp) {
				newPoly.addTerm(new Term(a.data.coef, a.data.exp));
				a = a.next;
			} else {
				newPoly.addTerm(new Term(a.data.coef + b.data.coef, a.data.exp));
				a = a.next;
				b = b.next;
			}
		}
		while (a != null) {
			newPoly.addTerm(new Term(a.data.coef, a.data.exp));
			a = a.next;
		}
		// B에 항이 남아 잇는 경우 B에 추가
		while (b != null) {
			newPoly.addTerm(new Term(b.data.coef, b.data.exp));
			b = b.next;
		}
		return newPoly;
	}
	
	public int calculate(int x) {
		int realX = x;
		int result = 0;
		GenericNode<Term> temp = head;
		for(int i=0; i < this.size; i++) {
			int block = 1;
			for(int j = 0; j < temp.data.exp; j++) {
				block = block * realX;
			}
			result = result + (temp.data.coef * block);
			temp = temp.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polynom p1 = new Polynom('f');
		p1.addTerm(new Term(1, 2));
		p1.addTerm(new Term(3, 2));
		p1.addTerm(new Term(2, 3));
		p1.addTerm(new Term(3, 4));
		p1.addTerm(new Term(4, 5));
		p1.addTerm(new Term(1, 3));
		p1.addTerm(new Term(-4, 4));
		System.out.println(p1.toString("+"));
		System.out.println("f(2) = " + p1.calculate(2));
		
		System.out.println("#############################");
		
		Polynom p2 = new Polynom('g');
		p2.addTerm(new Term(2, 1));
		p2.addTerm(new Term(4, 3));
		p2.addTerm(new Term(6, 7));
		System.out.println(p2.toString("+"));
		
		System.out.println("#############################");
		// p1.addPoly(p2);
		// System.out.println(p2.toString("+"));
		
		Polynom p3 = new Polynom('r');
		p3 = p1.addPoly(p1,p2);
		System.out.println(p3.toString("+"));
		
		System.out.println("#############################");
		
		Polynom p4 = new Polynom('g');
		p4.addTerm(new Term(1, 3));
		p4.addTerm(new Term(2, 7));
		p4.addTerm(new Term(7, 3));
		System.out.println(p3.toString("+"));
		
		System.out.println("#############################");
		
		p4 = p4.addPoly(p3, p4);
		System.out.println(p4.toString("+"));
		
		System.out.println("#############################");
		
		Polynom p5 = new Polynom('t');
		p5.addTerm(new Term(5, 3));
		p5.addTerm(new Term(5, 2));
		p5.addTerm(new Term(3, 1));
		// p5.addTerm(new Term(2, 0));
		System.out.println(p5.toString("+"));
		System.out.println(p5.polyName + "(3) = " + p5.calculate(3));
		
		System.out.println("#############################");
		
	}
	
}
