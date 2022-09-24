package array;

public class SimpleGenericArrayList <T> {
	   
	   //��̿��� ��̸���Ʈ�� �ٲ㺼�ž�
	   int capacity = 3;   //���߿� �÷�������. ���߿� �ȹٲ�� �Ϸ��� final ����
	   T [] dataArray = (T[]) new Object [capacity];      //ǥ���� �ڷᱸ�� ��������
	   int size = 0;   //������ ���� = ������ ����
	   
	   T get(int index) {
	      //�ε��� �� �޾Ƽ� ����� ������ ���������
	      if(index < 0 || index > size-1) {
	    	  return null;
	      }
	      return dataArray[index];
	   }
	   
	   void add(int index, T data) {
	      //��� ��ġ�� �־��
		  if(index<0 || index>size) {
			  return; // validation check
		  }
		  if(size == capacity) {
			  enlargeCapacity(); // return;
		  }
		  for (int i = size-1; i>=index; i--) {
			  dataArray[i+1] = dataArray[i];   //����Ȯ��
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
	         // if(data == dataArray[i]) { // �̰� �⺻ �ڷ������θ� ���� �� �ȴ�!
	         if(data.equals(dataArray[i])) { // Obeject�� equals() Overriding
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
