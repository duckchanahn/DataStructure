package sort;

public class MergeSort {
	
	int unSortedArr[] = { 2, 0, 4, 3, 1 };
	int [] sortedTemp;
	 	
	/*** 병합 정렬 ***/
	/**
		sortedTemp = new int[unSortedArr.length];
		System.out.println("~~~ 병합 정렬 직전 배열 ~~~");
		for(Integer n : unSortedArr) { System.out.print(n + " "); }
		System.out.println(); System.out.println();
		System.out.println("*** 병합 정렬 (Merge Sort) ***");
		
		mergeSort(0, unSortedArr.length - 1);
		
		System.out.println("~~~ 병합 정렬 결과 ~~~");
		for(Integer n : unSortedArr) { System.out.print(n + " "); }
		System.out.println(); System.out.println();
	**/
	/*** 병합 정렬 ***/
	
	public MergeSort() {
		// TODO Auto-generated constructor stub
		sortedTemp = new int[unSortedArr.length];
	}
	
	public void mergeSort(int begin,int end) {
		int mid;
		if (begin < end) {
			mid = (begin + end) / 2;
			mergeSort(begin, mid);
			mergeSort(mid + 1, end);
			merge(begin, end);
		}
	}
	
	public void merge(int begin, int end) {
		int mid = (begin + end) / 2;
		int leftBegin = begin;
		int rightBegin = mid + 1;
		int idxForResult = begin;
		
		for(int t=leftBegin; t <= mid; t++) {
			System.out.print(unSortedArr[t] + " ");
		}
		System.out.print("- 전반부 ~ 병합하면서 정렬 ~ 후반부 - ");
		for(int t=rightBegin; t <= end; t++) {
			System.out.print(unSortedArr[t] + " ");
		}
		
		// 병합하면서 정렬, 주요 동작
		while(leftBegin <= mid && rightBegin <= end) {
			if(unSortedArr[leftBegin] <= unSortedArr[rightBegin]) {
				sortedTemp[idxForResult++] = unSortedArr[leftBegin++];
			}else {
				sortedTemp[idxForResult++] = unSortedArr[rightBegin++];
			}
		}
		
		// int tmp = i>mid ? j : i;
		// 남아 있는 값들을 일괄 복사
		if(leftBegin>mid){
			for(int t=rightBegin; t<=end; t++) {
				sortedTemp[idxForResult++] = unSortedArr[t];
			}
		}else{
			for(int t=leftBegin; t<=mid; t++) {
				sortedTemp[idxForResult++] = unSortedArr[t];
			}
		}
		
		// 옮겨 주기
		System.out.println();
		System.out.print("=> 합치면서 정렬한 내용 : ");
		for (int t=begin;t<=end;t++) {
			unSortedArr[t] = sortedTemp[t];
			System.out.print(unSortedArr[t] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
}
