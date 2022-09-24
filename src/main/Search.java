package main;

public class Search {
	
	/*** 연습 2 ***/
	/*
	System.out.println("*** 1번 문제 ***");
	int keyForLinear = 3; // 3을 순차 탐색
	System.out.println(linearSearch(unSortedArr, unSortedArr.length, keyForLinear));
	System.out.println();
	
	System.out.println("*** 2번 문제 ***"); // 최댓값 구하기
	System.out.println(findMax(unSortedArr, unSortedArr.length, -1));
	System.out.println();
	
	System.out.println("*** 3번 문제 ***");
	int keyForBinary = 3; // 3을 이진 탐색
	System.out.println(binarySearch(sortedArr, keyForBinary, 0, sortedArr.length));
	System.out.println();
	*/
	/*** 연습 2 ***/
	
	int sortedArr[] = { 0, 1, 2, 3, 4 };
	
	public int binarySearch(int[] searchArr, int key,
			int low, int high) {
		// TODO Auto-generated method stub
		int mid = (low + high) / 2;
		if(low > high) {
			return -1;
		}else {
			if(sortedArr[mid] == key) {
				return mid;
			}else if(mid < key) { // 교수님 피피티는 부등호 방향 반대라네!
				return binarySearch(searchArr, key, mid, high);
			}else { // mid > key
				return binarySearch(searchArr, key, low, mid);
			}
		}
	}
	
	public int linearSearch(int[] sortedArr, int length, int key) {
		// TODO Auto-generated method stub
		// sA[l-1] == key? // sA[l-2] == key? // ... // sA[0] == key?
		if(sortedArr[length-1] == key) {
			return sortedArr[length-1]; // found
		}
		
		if(length == 1) { // base case, not found
			return -1;
		}else {
			return linearSearch(sortedArr, length - 1, key);
			// not yet found, so keep on linearSearching
		}
	}
	
}
