package queens;

import java.util.Scanner;

public class N_Queens {
	
	public static void main(String[] args) {
		System.out.println("�� * �� ü�������� ������ ��, ���ڸ� �Է��ϼ���!");
		Scanner sc = new Scanner(System.in);
		N_Queens nq = new N_Queens(sc.nextInt());

		nq.back_tracking(0);
		
		System.out.println("�ش� ü���� ũ�⿡���� �� ��ġ �� ��ȣ��!");
		System.out.println("�� ��ȣ�� �� ���ڵ��� ���� �ε��� ��!");
		System.out.println("��� ����� ��!");
	}
	
	private int n;
	private int[] cols; // �� ->>>>
	
	// constructor
	public N_Queens(int n) {
		this.n = n;	//n*n
		cols = new int[n];
	}
	
	private void back_tracking(int level) { // �� �� �� �İ� ��������!
		// level: ��(����)(row) ��
		
		if (level == n) {
			// ������ n��° ��� - �������
			for (int i = 0; i < level; i++) {
				System.out.print(" " + (cols[i] + 1));	//���
			}
			System.out.println("");
		} else {
			// ������ ���� ������ �ִٴ� �� ����, ���� ���� ��� ���� ������ ����
			for (int i = 0; i < n; i++) { // 0 ~ n-1���� ���� ��� ������.
				cols[level] = i;
				if (isPossible(level)) {
					back_tracking(level + 1);
				}
			}
		}
	}
	
	private boolean isPossible(int level) {
		for (int i = 0; i < level; i++) {
			// ���� �ڸ��� �� �� �ִ��� ��� ���
			if (cols[i] == cols[level] || Math.abs(level - i) == Math.abs(cols[level] - cols[i])) {
				// i��° ���� ��ġ�� level��ġ�� ���� ���� ������ �� �ִ� ���(���δ� �� ��. �Ʒ��� �������ϱ�)
				// i��° ���� ��ġ�� level��ġ�� ���� �밢�� �� �ִ� ���	// �غ� = ���� -> �밢�� ��
				return false;
			}
		}
		return true;
	}
}
