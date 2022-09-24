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
            while(data[left] < pivot) { left++; } // pivot보다 작은 값이 아닐 때 까지 left++;
            while(data[right] > pivot) { right--; } // pivot보다 큰 값이 아닐 때 까지 right++;
            // => 정렬이 필요한 부분까지를 찾아가는 것!
            System.out.println("before Change Left => " + left);
        	System.out.println("before Change Right => " + right);
        	// 정렬이 필요한, 이상 있는 부분에 대해, 서로 양 끝 간 계속 자리 바꾸기
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
    	// pivot보다 작은 부분과 큰 부분을 각각 재귀호출
        if(l < right) { System.out.println("####### l < right, pivot보다 작은 부분!"); sort(data, l, right);
        	System.out.println("l < right #######"); }
        if(r > left) { System.out.println("$$$$$$$ r > left, pivot보다 큰 부분!"); sort(data, left, r); 
        	System.out.println("r > left $$$$$$$"); }
    }
	
}
