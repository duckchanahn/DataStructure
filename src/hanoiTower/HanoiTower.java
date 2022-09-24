package hanoiTower;

import java.util.EmptyStackException;
import java.util.Stack;

public class HanoiTower {
	
	/**
	int n = 5; // �ϳ��� Ÿ��
	HanoiTower hanoi = new HanoiTower(n);
	hanoi.hanoi(n, 'A', 'B', 'C');
	**/
	
	/*
	 * �ϳ��� Ÿ���� �ּ� ������ 2���� ������ ���� ���ε�,
	 * (ó���� �� ���� ���� ����, �� �Ʒ� ����� ū �������� ����)
	 * 1. ���� ������ A->B�� �ű��,
	 * 2. ū ������ A->C�� �ű��,
	 * 3. ���� ������ B->C�� �ű�� �ȴ�.
		��ó: https://ledgku.tistory.com/39 [�߿�� ����]
	 */
	
	public static void main(String[] args) {
		int n = 4; // �ϳ��� Ÿ��
		HanoiTower hanoi = new HanoiTower(n);
		hanoi.hanoi(n, 'A', 'B', 'C');
	}
	
	private Stack<Integer> towerA;
	private Stack<Integer> towerB;
	private Stack<Integer> towerC;
	
	public HanoiTower(int n) {
		// TODO Auto-generated constructor stub
		this.towerA = new Stack<Integer>();
		this.towerB = new Stack<Integer>();
		this.towerC = new Stack<Integer>();
		for(int i=1; i<n+1; i++) { this.towerA.add((n+1)-i); }
		this.print();
		System.out.println();
	}
	
	public void hanoi(int n, char from, char by, char to){
	    if (n == 1) {
	        move(from, to, n);
	    }else{
	    	// ������ 2���� ��Ȳ���� �����ؼ� �̸� �ɰ��鼭 ���
	    	
	    	// from -> from, to -> by, by -> to
	        hanoi(n - 1, from, to, by); // !! �����ư��鼭 �ű��, n--�� ������, to�� by�� �����ȴ�!
	        // ���� ū ������ �����ϰ�, ó�� from����, ó�� to�� ����, ó�� by�� �ϴ� �� �����Բ�
	        // System.out.println("Up -- " + n);
	        
	        move(from, to, n); // !! ���� n�� �� ������ ������, �ٷ� �� ���� to�� by�� �����Ǿ �̰� ����ȴ�!
	        // ���� ū ������ ó�� to�� �� ������
	        // System.out.println("Middle -- " + n);
	        
	        // by -> from, from -> by, to -> to
	        hanoi(n - 1, by, from, to); // !! ���ʹ� �ݴ� �������� �����ư��鼭 �ű��
	        // ���� ū ������ �ִ� ������, ó�� by����, ó�� from�� ����, ó�� to�� �ϴ� �� �����Բ�
	        // System.out.println("Down -- " + n);
	    }
	}
	
	private void move(char from, char to, int n){
		System.out.printf("***** Move from %c to %c *****\n", from, to);
		try {
			if(from == 'A' && to == 'B') { this.towerB.add(n); this.towerA.pop(); }
			if(from == 'A' && to == 'C') { this.towerC.add(n); this.towerA.pop(); }
			if(from == 'B' && to == 'A') { this.towerA.add(n); this.towerB.pop(); }
			if(from == 'B' && to == 'C') { this.towerC.add(n); this.towerB.pop(); }
			if(from == 'C' && to == 'A') { this.towerA.add(n); this.towerC.pop(); }
			if(from == 'C' && to == 'B') { this.towerB.add(n); this.towerC.pop(); }
		}catch(EmptyStackException e) {
			// skip
		}
		this.print();
		System.out.println();
	}
	
	private void print() {
		System.out.print("towerA => ");
		for(Integer n : this.towerA) { System.out.print(n + " "); }
		System.out.println();
		
		System.out.print("towerB => ");
		for(Integer n : this.towerB) { System.out.print(n + " "); }
		System.out.println();
		
		System.out.print("towerC => ");
		for(Integer n : this.towerC) { System.out.print(n + " "); }
		System.out.println();
	}
	
}
