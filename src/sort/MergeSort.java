package sort;

public class MergeSort {
	
	int unSortedArr[] = { 2, 0, 4, 3, 1 };
	int [] sortedTemp;
	 	
	/*** ���� ���� ***/
	/**
		sortedTemp = new int[unSortedArr.length];
		System.out.println("~~~ ���� ���� ���� �迭 ~~~");
		for(Integer n : unSortedArr) { System.out.print(n + " "); }
		System.out.println(); System.out.println();
		System.out.println("*** ���� ���� (Merge Sort) ***");
		
		mergeSort(0, unSortedArr.length - 1);
		
		System.out.println("~~~ ���� ���� ��� ~~~");
		for(Integer n : unSortedArr) { System.out.print(n + " "); }
		System.out.println(); System.out.println();
	**/
	/*** ���� ���� ***/
	
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
		System.out.print("- ���ݺ� ~ �����ϸ鼭 ���� ~ �Ĺݺ� - ");
		for(int t=rightBegin; t <= end; t++) {
			System.out.print(unSortedArr[t] + " ");
		}
		
		// �����ϸ鼭 ����, �ֿ� ����
		while(leftBegin <= mid && rightBegin <= end) {
			if(unSortedArr[leftBegin] <= unSortedArr[rightBegin]) {
				sortedTemp[idxForResult++] = unSortedArr[leftBegin++];
			}else {
				sortedTemp[idxForResult++] = unSortedArr[rightBegin++];
			}
		}
		
		// int tmp = i>mid ? j : i;
		// ���� �ִ� ������ �ϰ� ����
		if(leftBegin>mid){
			for(int t=rightBegin; t<=end; t++) {
				sortedTemp[idxForResult++] = unSortedArr[t];
			}
		}else{
			for(int t=leftBegin; t<=mid; t++) {
				sortedTemp[idxForResult++] = unSortedArr[t];
			}
		}
		
		// �Ű� �ֱ�
		System.out.println();
		System.out.print("=> ��ġ�鼭 ������ ���� : ");
		for (int t=begin;t<=end;t++) {
			unSortedArr[t] = sortedTemp[t];
			System.out.print(unSortedArr[t] + " ");
		}
		System.out.println();
		System.out.println();
	}
	
}
