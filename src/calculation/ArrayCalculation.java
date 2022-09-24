package calculation;

public class ArrayCalculation {
	
	/*
	// 5번 문제
	System.out.println("*** 5번 문제 ***"); // 문자열의 길이 구하기
	System.out.println(countLength("game")); // 4 // g, a, m, e
	System.out.println();
	
	// 6번 문제
	System.out.println("*** 6번 문제 ***"); // 배열 내 요소들의 합
	int [] arrForSum = { 1, 2, 3, 4 }; // 10 // 1 + 2 + 3 + 4
	System.out.println(sumArr(arrForSum.length, arrForSum));
	System.out.println();
	*/
	
	public int sumArr(int length, int[] arrForSum) {
		// TODO Auto-generated method stub
		if(length == 1) { // arrForSum[0]
			return arrForSum[length-1]; // 교수님 피피티는 이 부분이 다른데, 내가 맞다!
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
