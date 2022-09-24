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
		
		/*** 퀵 정렬 ***/
		// Quick 클래스만 보면 됩니다! 감사합니다!
		System.out.println("$$$ ~~~ 퀵 정렬  ~~~ $$$");
		for(Integer n : unSortedArr) { System.out.print(n + " "); }
		System.out.println();
		System.out.println("퀵 정렬 시작!");
		
		QuickSort quick = new QuickSort();
        quick.sort(unSortedArr, 0, unSortedArr.length - 1);
        for(Integer n : unSortedArr) { System.out.print(n + " "); }
        
        System.out.println();
        System.out.println("퀵 정렬 끝");
		/*** 퀵 정렬 ***/
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
