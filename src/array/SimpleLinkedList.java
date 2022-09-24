package array;

public class SimpleLinkedList {
	
	Node head; // => 시작 노드!
	int size;
	
	public SimpleLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	
	String get(int index) {
		if(index < 0 || index > size-1) {
			return null;
			// throw new ArrayIndexOutOfBoundsException();
		}
		Node temp = head;
		for(int i=0; i < index; i++) { // index-1이 아닌, index
			temp = temp.next; // temp -> 해당 node
			// 리스트는 index, 바로 그 직전의 node로 가서야
			// 그 다음 자리를 찾을 수 있다!
			// 각 node는 본인 바로 뒤의 주소만을 가지고 있기 때문!
		}
		return temp.data;
	}
	
	void add(int index, String data) {
		Node newNode = new Node(data);
		// 무식한 예외처리 방식!
		if(index < 0 || index > size){ // 예외처리
			return;
		}else if(head == null) { // 예외 처리
			head = newNode;
		}else if(index == 0) { // 예외 처리
			newNode.next = head;
			head = newNode;
		}else if(index == size) { // 마지막에 추가
			Node temp = head;
			for(int i=0; i < size-1; i++) { // 마지막 요소 직전
				temp = temp.next;
			}
			temp.next = newNode;
		}else {
			// 일반적인 경우
			Node temp = head;
			// aaa bbb ccc // add(1)
			for(int i=0; i < index-1; i++) {
				// 리스트는 index, 바로 그 직전의 node로 가서야
				// 그 다음 자리를 찾을 수 있다! 각 node는 본인 바로 뒤의 주소만을 가지고 있기 때문!
				temp = temp.next;
			} // 현재 temp는 넣을 곳 직전 node // temp.next => 넣을 곳에 있는 node의 주소!
			Node retemp = temp.next; // 넣을 곳에 있는 node의 내용을 retemp에 보존!
			temp.next = newNode; // 넣을 곳에 있는 node의 주소에, newNode의 주소로 값을 복사해 세팅
			newNode.next = retemp; // newNode의 다음 노드의 위치는, 보존해둔 retemp의 주소로 값을 복사해 세팅!
		}
		size++;
	}
	
	// remove by index
    String remove(int index) {
        if(index < 0 || index > size-1) {
           return null;
        }
        
        String val = "";
        if(index == 0) {
        	val = head.data;
        	head = head.next;
        }else {
            Node temp = head;
    		for(int i=0; i < index-1; i++) { // index - 1이 맞아!
    			temp = temp.next; // temp -> 지울 곳 직전 node
    		}
    		Node toBeDeleted = temp.next;
    		val = toBeDeleted.data;
    		temp.next = toBeDeleted.next;
    		// => temp.next = temp.next.next;
    		// delete toBeDeleted;
        }
        size--;
        return val;
    }
	   
	// remove by data
	boolean remove(String data) {
		int temp = indexOf(data);
		return (remove(temp) != null);
	}
	
	int indexOf(String str) {
		Node temp = head;
		for(int i=0; i<size; i++) {
			if(temp.data == str) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}
	
	int sizeOf() {
		return size;
	}
	
	@Override
	public String toString() {
		Node temp = head;
		String result = "";
	    for(int i = 0; i < size; i++) {
	    	result = result + temp.data.toString() + " ";
	    	temp = temp.next;
	    }
	    return result;
	}
	
}
