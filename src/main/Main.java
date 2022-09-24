package main;

import byIteration.ByIteration;
import hanoiTower.HanoiTower;
import sort.QuickSort;

public class Main {
	
	static int nums[] = new int[100];
	static int sortedArr[] = { 0, 1, 2, 3, 4 };
	// 2 0 4 3 1
	static int unSortedArr[] = { 2, 0, 4, 3, 1 };
	static int maxIdx = -1;
	static int [] sortedTemp;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*** �� ���� ***/
		// Quick Ŭ������ ���� �˴ϴ�! �����մϴ�!
		System.out.println("$$$ ~~~ �� ����  ~~~ $$$");
		for(Integer n : unSortedArr) { System.out.print(n + " "); }
		System.out.println();
		System.out.println("�� ���� ����!");
		
		QuickSort quick = new QuickSort();
        quick.sort(unSortedArr, 0, unSortedArr.length - 1);
        for(Integer n : unSortedArr) { System.out.print(n + " "); }
        
        System.out.println();
        System.out.println("�� ���� ��");
		/*** �� ���� ***/
	}
	
	private static void unSortedArrReset() {
		// TODO Auto-generated method stub
		unSortedArr[0] = 2;
		unSortedArr[1] = 0;
		unSortedArr[2] = 4;
		unSortedArr[3] = 3;
		unSortedArr[4] = 1;
	}
	
}
