package array;

public class SimpleDoubleLinkedList {

	DoubleNode head; // => ���� ���!
	int size;

	public SimpleDoubleLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	
	/*** => get�� ��, ���ݺ��� ū ���� ����, ũ��, �ڿ��� ���� �� ���� �ְ����� �ϴ� �׳� ������ ***/
	String get(int index) {
		if (index < 0 || index > size - 1) {
			return null;
			// throw new ArrayIndexOutOfBoundsException();
		}
		DoubleNode temp = head;
		for (int i = 0; i < index; i++) { // index-1�� �ƴ�, index
			temp = temp.next; // temp -> �ش� node
			// ����Ʈ�� index, �ٷ� �� ������ node�� ������
			// �� ���� �ڸ��� ã�� �� �ִ�!
			// �� node�� ���� �ٷ� ���� �ּҸ��� ������ �ֱ� ����!
		}
		return temp.data;
	}

	void add(int index, String data) {
		DoubleNode newNode = new DoubleNode(data);
		// ������ ����ó�� ���!
		if (index < 0 || index > size) { // ����ó��
			return;
		} else if (head == null) { // ���� ó��
			head = newNode;
		} else if (index == 0) { // ���� ó��
			newNode.next = head; // newNode.prev = null;
			head = newNode;
			if (head.next != null) { // ++
				(head.next).prev = head; // ++
			} // ++
		} else if (index == size) { // �������� �߰�
			DoubleNode temp = head;
			for (int i = 0; i < size - 1; i++) { // ������ ��� ����
				temp = temp.next;
			} // -> get(size-1);
			temp.next = newNode;
			newNode.prev = temp; // ++
		} else {
			// �Ϲ����� ���
			DoubleNode temp = head;
			// aaa bbb ccc // add(1)

			for (int i = 0; i < index - 1; i++) { // i<index��, �ش� index�� node�� ��
				// ����Ʈ�� index, �ٷ� �� ������ node�� ������
				// �� ���� �ڸ��� ã�� �� �ִ�! �� node�� ���� �ٷ� ���� �ּҸ��� ������ �ֱ� ����!
				temp = temp.next; // temp => aaa // temp.next => bbb
			} // ���� temp�� ���� �� ���� node // temp.next => ���� ���� �ִ� node�� �ּ�!

			DoubleNode retemp = temp.next; // ���� ���� �ִ� node�� ������ retemp�� ����!
			// retemp => bbb

			temp.next = newNode; // ���� ���� �ִ� node�� �ּҿ�, newNode�� �ּҷ� ���� ������ ����
			(temp.next).prev = temp; // ++ // ���Ӱ� ���� ��, �ٷ� ���� aaa
			// ���� bbb�� �ִ� �ڸ���, newNode�� ����!

			newNode.next = retemp; // newNode�� ���� ����� ��ġ��, �����ص� retemp�� �ּҷ� ���� ������ ����!
			(newNode.next).prev = newNode; // ++
			// newNode�� ���� �ڸ���, �����ص� bbb�� ��ġ�Ѵ�!
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
			DoubleNode temp = head;
			for (int i = 0; i < index - 1; i++) { // index - 1�� �¾�!
				temp = temp.next; // temp -> ���� �� ���� node
			}
			DoubleNode toBeDeleted = temp.next;
			val = toBeDeleted.data;
			temp.next = toBeDeleted.next; // ������ ���� ��ŵ�ϰԲ�
			(temp.next).prev = temp; // ���� temp.next�� ������ �� �ٷ� ���� ��
			// ++ ������ �� �ٷ� ���� ���� prev�� toBeDeleted�� ��ŵ�ϰԲ�
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
		DoubleNode temp = head;
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
		DoubleNode temp = head;
		String result = "";
		for (int i = 0; i < size; i++) {
			result = result + temp.data.toString() + " ";
			temp = temp.next;
		}
		return result;
	}

}