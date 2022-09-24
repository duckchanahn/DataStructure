package array;

public class SimpleDoubleGenericLinkedList<T> {
	
	DoubleGenericNode<T> head; // => 시작 노드!
	int size;

	public SimpleDoubleGenericLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	
	/*** => get할 때, 절반보다 큰 지에 따라, 크면, 뒤에서 부터 할 수도 있겠지만 일단 그냥 놔두자 ***/
	@SuppressWarnings("unchecked")
	T get(int index) {
		if (index < 0 || index > size - 1) {
			return null;
			// throw new ArrayIndexOutOfBoundsException();
		}
		DoubleGenericNode<T> temp = head;
		for (int i = 0; i < index; i++) { // index-1이 아닌, index
			temp = temp.next; // temp -> 해당 node
			// 리스트는 index, 바로 그 직전의 node로 가서야
			// 그 다음 자리를 찾을 수 있다!
			// 각 node는 본인 바로 뒤의 주소만을 가지고 있기 때문!
		}
		return (T) temp.data;
	}

	void add(int index, String data) {
		DoubleGenericNode<T> newNode = new DoubleGenericNode<T>(data);
		// 무식한 예외처리 방식!
		if (index < 0 || index > size) { // 예외처리
			return;
		} else if (head == null) { // 예외 처리
			head = newNode;
		} else if (index == 0) { // 예외 처리
			newNode.next = head; // newNode.prev = null;
			head = newNode;
			if (head.next != null) { // ++
				(head.next).prev = head; // ++
			} // ++
		} else if (index == size) { // 마지막에 추가
			DoubleGenericNode<T> temp = head;
			for (int i = 0; i < size - 1; i++) { // 마지막 요소 직전
				temp = temp.next;
			} // -> get(size-1);
			temp.next = newNode;
			newNode.prev = temp; // ++
		} else {
			// 일반적인 경우
			DoubleGenericNode<T> temp = head;
			// aaa bbb ccc // add(1)

			for (int i = 0; i < index - 1; i++) { // i<index면, 해당 index의 node인 것
				// 리스트는 index, 바로 그 직전의 node로 가서야
				// 그 다음 자리를 찾을 수 있다! 각 node는 본인 바로 뒤의 주소만을 가지고 있기 때문!
				temp = temp.next; // temp => aaa // temp.next => bbb
			} // 현재 temp는 넣을 곳 직전 node // temp.next => 넣을 곳에 있는 node의 주소!
			
			DoubleGenericNode<T> retemp = temp.next; // 넣을 곳에 있는 node의 내용을 retemp에 보존!
			// retemp => bbb
			
			temp.next = newNode; // 넣을 곳에 있는 node의 주소에, newNode의 주소로 값을 복사해 세팅
			(temp.next).prev = temp; // ++ // 새롭게 넣은 곳, 바로 앞은 aaa
			// 원래 bbb가 있던 자리에, newNode가 들어간다!

			newNode.next = retemp; // newNode의 다음 노드의 위치는, 보존해둔 retemp의 주소로 값을 복사해 세팅!
			(newNode.next).prev = newNode; // ++
			// newNode의 다음 자리에, 보존해둔 bbb를 배치한다!
		}
		size++;
	}

	// remove by index
	String remove(int index) {
		if (index < 0 || index > size - 1) {
			return null;
		}

		String val = "";
		if (index == 0) {
			val = head.data;
			head = head.next;
		} else {
			DoubleGenericNode<T> temp = head;
			for (int i = 0; i < index - 1; i++) { // index - 1이 맞아!
				temp = temp.next; // temp -> 지울 곳 직전 node
			}
			DoubleGenericNode<T> toBeDeleted = temp.next;
			val = toBeDeleted.data;
			temp.next = toBeDeleted.next; // 지워진 곳은 스킵하게끔
			(temp.next).prev = temp; // 이제 temp.next는 지워진 곳 바로 다음 곳
			// ++ 지워진 곳 바로 다음 곳의 prev를 toBeDeleted를 스킵하게끔
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
		DoubleGenericNode<T> temp = head;
		for (int i = 0; i < size; i++) {
			if (temp.data == str) {
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
		DoubleGenericNode<T> temp = head;
		String result = "";
		for (int i = 0; i < size; i++) {
			result = result + temp.data.toString() + " ";
			temp = temp.next;
		}
		return result;
	}
	
}
