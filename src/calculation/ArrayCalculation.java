package calculation;

public class ArrayCalculation {
	
	/*
	// 5�� ����
	System.out.println("*** 5�� ���� ***"); // ���ڿ��� ���� ���ϱ�
	System.out.println(countLength("game")); // 4 // g, a, m, e
	System.out.println();
	
	// 6�� ����
	System.out.println("*** 6�� ���� ***"); // �迭 �� ��ҵ��� ��
	int [] arrForSum = { 1, 2, 3, 4 }; // 10 // 1 + 2 + 3 + 4
	System.out.println(sumArr(arrForSum.length, arrForSum));
	System.out.println();
	*/
	
	public int sumArr(int length, int[] arrForSum) {
		// TODO Auto-generated method stub
		if(length == 1) { // arrForSum[0]
			return arrForSum[length-1]; // ������ ����Ƽ�� �� �κ��� �ٸ���, ���� �´�!
		}else { // arrForSum[length-1] + arrForSum[length-2] + ...
			return arrForSum[length-1] + sumArr(length-1, arrForSum);
		}
	}
	
	public int countLength(String line) {
		// TODO Auto-generated method stub
		if(line.length() == 0) {
			return 0;
		}else {
			return 1 + countLength(line.substring(1));
		}
	}
	
}
