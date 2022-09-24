package hanoiTower;

import java.util.EmptyStackException;
import java.util.Stack;

public class HanoiTower {
	
	/**
	int n = 5; // 하노이 타워
	HanoiTower hanoi = new HanoiTower(n);
	hanoi.hanoi(n, 'A', 'B', 'C');
	**/
	
	/*
	 * 하노이 타워의 최소 단위는 2개의 원반이 있을 때인데,
	 * (처음에 맨 위를 작은 원반, 그 아래 덩어리를 큰 원반으로 간주)
	 * 1. 작은 원반을 A->B로 옮기고,
	 * 2. 큰 원반을 A->C로 옮기고,
	 * 3. 작은 원반을 B->C로 옮기면 된다.
		출처: https://ledgku.tistory.com/39 [견우와 직녀]
	 */
	
	public static void main(String[] args) {
		int n = 4; // 하노이 타워
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
	    	// 원반이 2개인 상황으로 간주해서 이를 쪼개면서 재귀
	    	
	    	// from -> from, to -> by, by -> to
	        hanoi(n - 1, from, to, by); // !! 번갈아가면서 옮기되, n--될 떄마다, to와 by가 반전된다!
	        // 가장 큰 원반을 제외하고, 처음 from에서, 처음 to를 거쳐, 처음 by로 일단 다 보내게끔
	        // System.out.println("Up -- " + n);
	        
	        move(from, to, n); // !! 낮은 n의 콜 스택이 끝나고, 바로 그 위의 to와 by가 반전되어서 이게 실행된다!
	        // 가장 큰 원반을 처음 to로 다 보내기
	        // System.out.println("Middle -- " + n);
	        
	        // by -> from, from -> by, to -> to
	        hanoi(n - 1, by, from, to); // !! 위와는 반대 방향으로 번갈아가면서 옮기기
	        // 가장 큰 원반이 있는 곳으로, 처음 by에서, 처음 from을 거쳐, 처음 to로 일단 다 보내게끔
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
