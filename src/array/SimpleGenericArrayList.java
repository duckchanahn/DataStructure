package array;

public class SimpleGenericArrayList <T> {
	   
	   //어레이에서 어레이리스트로 바꿔볼거얌
	   int capacity = 3;   //나중에 늘려갈거임. 나중에 안바뀌게 하려고 final 쓴대
	   T [] dataArray = (T[]) new Object [capacity];      //표현할 자료구조 만들어야함
	   int size = 0;   //데이터 개수 = 사이즈 개수
	   
	   T get(int index) {
	      //인덱스 값 받아서 저장된 데이터 보내줘야함
	      if(index < 0 || index > size-1) {
	    	  return null;
	      }
	      return dataArray[index];
	   }
	   
	   void add(int index, T data) {
	      //어느 위치에 넣어라
		  if(index<0 || index>size) {
			  return; // validation check
		  }
		  if(size == capacity) {
			  enlargeCapacity(); // return;
		  }
		  for (int i = size-1; i>=index; i--) {
			  dataArray[i+1] = dataArray[i];   //공간확보
		  }
		  dataArray[index] = data;
		  size++;
	   }
	   
	   private void enlargeCapacity() {
		   // TODO Auto-generated method stub
		   T [] bigArray = (T[]) new Object [capacity * 2];
		   System.arraycopy(dataArray, 0, bigArray, 0, size);
		   dataArray = bigArray;
		   capacity = capacity * 2;
	   }
	   
	   // remove by index
	   T remove(int index) {
	      if(index < 0 || index > size-1) {
	         return null;
	      }
	      T val = dataArray[index];
	      for(int i = index+1; i < size; i++) {
	         dataArray[i-1] = dataArray[i];
	      }
	      size--;
	      return val;
	   }
	   
	   // remove by data
	   boolean remove(T data) {
	      int temp = indexOf(data);
	      return (remove(temp) != null);
	   }
	   
	   int indexOf(T data) {
	      for(int i=0; i < size; i++) {
	         // if(data == dataArray[i]) { // 이건 기본 자료형으로만 같은 지 된다!
	         if(data.equals(dataArray[i])) { // Obeject의 equals() Overriding
	        	 // this == parameterObject
	        	 return i;
	         }
	      }
	      return -1;
	   }
	   
	   public int sizeOf() {
	      return size;
	   }
	   
	   @Override
	   public String toString() {
	      String result = "";
	      for(int i=0; i < size; i++) {
	    	  result = result + dataArray[i].toString() + " ";
	      }
	      return result;
	   }
}
