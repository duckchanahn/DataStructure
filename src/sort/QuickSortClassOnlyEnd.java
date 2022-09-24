package sort;

public class QuickSortClassOnlyEnd {
	// pivot이 끝값이어야만 한다!
	
	static void quickSort(int data[], int b, int e) {
		int mid;
		if (e - b == 1) {
			if (data[e] < data[b]) {
				int t = data[e];
				data[e] = data[b];
				data[b] = t;
			}
		} else if (e > b) {
			mid = partition(data, b, e);
			if (mid < 0)
				return;
			quickSort(data, b, mid - 1);
			quickSort(data, mid + 1, e);
		}
	}

	private static int partition(int[] data, int b, int e) {
		int[] temp = new int[data.length];
		int pivot = data[e];
		int f = b;
		int r = e;

		for (int i = b; i < e; i++) {
			if (data[i] <= pivot) {
				temp[f++] = data[i];
			} else {
				temp[r--] = data[i];
			}
		}

		if (f != r) {
			System.out.println("wrong");
			return -1;
		} else {
			temp[f] = pivot;
			for (int i = b; i <= e; i++) {
				data[i] = temp[i];
				System.out.println("partition position : " + f + " pivot : " + pivot);
			}
			return f;
		}
	}

	public static void main(String[] args) {
		int[] data = { 31, 8, 48, 73, 11, 3, 20, 29, 65, 15 };
		quickSort(data, 0, data.length - 1);
		System.out.print("정렬 값 : ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
	
}
