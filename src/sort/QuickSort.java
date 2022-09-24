package sort;

public class QuickSort {
	
	public void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
        	System.out.println("l => " + l);
        	System.out.println("r => " + r);
        	System.out.println("left => " + left);
        	System.out.println("right => " + right);
        	System.out.print("@@@@@@@ -- ");
        	for(Integer n : data) { System.out.print(n + " "); }
            System.out.println();
            System.out.println("pivot " + (l+r)/2 + " idx -- value " + pivot);
            while(data[left] < pivot) { left++; } // pivot���� ���� ���� �ƴ� �� ���� left++;
            while(data[right] > pivot) { right--; } // pivot���� ū ���� �ƴ� �� ���� right++;
            // => ������ �ʿ��� �κб����� ã�ư��� ��!
            System.out.println("before Change Left => " + left);
        	System.out.println("before Change Right => " + right);
        	// ������ �ʿ���, �̻� �ִ� �κп� ����, ���� �� �� �� ��� �ڸ� �ٲٱ�
            if(left <= right){
            	System.out.println("changeLeft " + left +  " idx -- value " + data[left]);
            	System.out.println("changeRight " + right + " idx -- value " + data[right]);
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        	for(Integer n : data) { System.out.print(n + " "); }
        	System.out.print("-- @@@@@@");
            System.out.println();
        }while (left <= right);
        
        System.out.println();
        System.out.println("out while to do recursion");
    	// pivot���� ���� �κа� ū �κ��� ���� ���ȣ��
        if(l < right) { System.out.println("####### l < right, pivot���� ���� �κ�!"); sort(data, l, right);
        	System.out.println("l < right #######"); }
        if(r > left) { System.out.println("$$$$$$$ r > left, pivot���� ū �κ�!"); sort(data, left, r); 
        	System.out.println("r > left $$$$$$$"); }
    }
	
}
