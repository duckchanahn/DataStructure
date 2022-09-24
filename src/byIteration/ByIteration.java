package byIteration;

public class ByIteration {
	
	private int findMax(int[] unSortedArr) {
		// TODO Auto-generated method stub
		int max = unSortedArr[0];
		for(int i = 0; i < unSortedArr.length; i++) {
			if(max < unSortedArr[i]) {
				max = unSortedArr[i];
			}
		}
		return max;
	}

	private int linearSearch(int[] sortedArr, int key) {
		// TODO Auto-generated method stub
		for(int i = 0; i < sortedArr.length; i++) {
			if(sortedArr[i] == key) {
				return sortedArr[i];
			}
		}
		return -1;
	}
	
	public int[] selectionSort(int[] unSortedArr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < unSortedArr.length; i++) {
			int max = -1; // 계속 초기화
			int maxIdx = -1;
			for(int j = 0; j < unSortedArr.length - i; j++) {
				if(max < unSortedArr[j]) {
					max = unSortedArr[j];
					maxIdx = j;
				}
			}
			unSortedArr[maxIdx] = unSortedArr[unSortedArr.length-1 - i];
			unSortedArr[unSortedArr.length-1 -i] = max;
		}
		
		System.out.println("######");
		for(int i = 0; i < unSortedArr.length; i++) {
			System.out.print(unSortedArr[i] + " ");
		}
		System.out.println("######");
		
		return unSortedArr;
	}
	
}
