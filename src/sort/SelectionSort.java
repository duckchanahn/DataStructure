package sort;

public class SelectionSort {
	
	/*** ���� ���� ***/
	/*
	sortedTemp = new int[unSortedArr.length];
	System.out.println("*** ���� ���� (Selection Sort) ***");
	sortedTemp = selectionSort(unSortedArr, unSortedArr.length, -1);
	for(Integer n : sortedTemp) { System.out.print(n + " "); }
	System.out.println(); System.out.println();
	unSortedArrReset(); // �迭�� �ٽ� ���� �� ���·� ���� ����
	*/
	/*** ���� ���� ***/
	
	int maxIdx = -1;
	
	public int findMax(int[] unSortedArr, int length, int max) {
		// TODO Auto-generated method stub
		// max => -1; // �ʱⰪ
		// arr[l-1] > max? // arr[l-2] > max? // ... // arr[0] > max?
		if(max < unSortedArr[length - 1]) {
			max = unSortedArr[length - 1];
			maxIdx = length - 1;
		}
		
		if(length == 1) {
			return max;
		}else {
			return findMax(unSortedArr, length - 1, max);
		}
	}
	
	public int[] selectionSort(int[] unSortedArr, int length, int max) {
		// TODO Auto-generated method stub
		// toTheEnd(fM(l)) // toTheEnd(fM(l-1)) // ... // toTheEnd(fM(0))
		max = findMax(unSortedArr, length, max);
		unSortedArr[maxIdx] = unSortedArr[length-1];
		unSortedArr[length-1] = max;
		max = -1;
		
		if(length == 1) { // base case
			return unSortedArr;
		}else {
			return selectionSort(unSortedArr, length-1, max);
		}
	}
	
}
