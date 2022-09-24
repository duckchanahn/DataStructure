package sort;

import java.util.Scanner;

public class QuickSortClassMid {

	public static void main(String[] args) {
		// int[] list = { 84, 29, 32, 12, 3, 63, 99, 101, 33 };
		
		Scanner scan = new Scanner(System.in);
		int[] array;
		System.out.println("�迭�� ����� �Է��ϼ���");
		int size = scan.nextInt();
		array = new int[size];
		System.out.println("�迭�� ������ �Է��ϼ���(�ߺ�����)");
		int count = 0;
		while (count != size) {
			array[count] = scan.nextInt();
			count++;
		}
		System.out.println("------------------------");
		System.out.println("----Quick Sort Start----");
		System.out.println("------------------------");
		array = quickSort(array, 0, array.length - 1);
		// printf(array);
		System.out.println("-----Quick Sort End-----");
		System.out.println("------------------------");
	}

	private static int[] quickSort(int[] list, int beginIndex, int endIndex) {
		if (beginIndex < endIndex) {
			int p = partition(list, beginIndex, endIndex);
			quickSort(list, beginIndex, p - 1);
			quickSort(list, p + 1, endIndex);
		}
		return list;
	}

	private static int partition(int[] list, int beginIndex, int endIndex) {
		int[] temp = new int[list.length];
		int p = (beginIndex + endIndex) / 2;
		int pivot = list[p];
		int a = beginIndex;
		int b = endIndex;
		
		for (int i = beginIndex; i <= endIndex; i++) {
			if (i == p) {
				p = i;
			} else {
				if (list[i] <= pivot) {
					temp[a++] = list[i];
				} else if (list[i] == pivot) {
					p = i;
				} else {
					temp[b--] = list[i];
				}
			}
		}
		temp[a] = list[p];
		p = a;

		for (int i = beginIndex; i <= endIndex; i++) {
			list[i] = temp[i];
		}
		System.out.println("pivot : " + temp[a]);
		System.out.print("���ĵȰ� : ");
		printf(temp);
		System.out.println(" ");
		System.out.print("����迭 : ");
		printf(list);
		System.out.println("\n" + "------------------------");
		return p;
	}

	private static void printf(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
