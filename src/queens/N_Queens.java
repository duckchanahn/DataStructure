package queens;

import java.util.Scanner;

public class N_Queens {
	
	public static void main(String[] args) {
		System.out.println("몇 * 몇 체스판으로 가정할 지, 숫자를 입력하세요!");
		Scanner sc = new Scanner(System.in);
		N_Queens nq = new N_Queens(sc.nextInt());

		nq.back_tracking(0);
		
		System.out.println("해당 체스판 크기에서의 퀸 위치 열 번호들!");
		System.out.println("행 번호는 각 숫자들의 순서 인덱스 값!");
		System.out.println("모든 경우의 수!");
	}
	
	private int n;
	private int[] cols; // 열 ->>>>
	
	// constructor
	public N_Queens(int n) {
		this.n = n;	//n*n
		cols = new int[n];
	}
	
	private void back_tracking(int level) { // 한 행 더 파고 내려가기!
		// level: 행(가로)(row) ↓
		
		if (level == n) {
			// 마지막 n번째 경우 - 끝난경우
			for (int i = 0; i < level; i++) {
				System.out.print(" " + (cols[i] + 1));	//출력
			}
			System.out.println("");
		} else {
			// 이전의 퀸이 놓여져 있다는 것 가정, 다음 퀸을 어느 열에 놓을지 결정
			for (int i = 0; i < n; i++) { // 0 ~ n-1까지 놓는 경우 따지기.
				cols[level] = i;
				if (isPossible(level)) {
					back_tracking(level + 1);
				}
			}
		}
	}
	
	private boolean isPossible(int level) {
		for (int i = 0; i < level; i++) {
			// 퀸이 자리에 들어갈 수 있는지 경우 계산
			if (cols[i] == cols[level] || Math.abs(level - i) == Math.abs(cols[level] - cols[i])) {
				// i번째 퀸의 위치와 level위치의 퀸이 같은 일직선 상에 있는 경우(가로는 안 봄. 아래로 내려가니까)
				// i번째 퀸의 위치와 level위치의 퀸이 대각선 상에 있는 경우	// 밑변 = 높이 -> 대각선 상
				return false;
			}
		}
		return true;
	}
}
