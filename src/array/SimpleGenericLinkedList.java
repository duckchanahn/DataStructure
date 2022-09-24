package array;

import java.util.NoSuchElementException;

public class SimpleGenericLinkedList<T> {
	
	GenericNode<T> head; // => ���� ���!
	int size;

	public SimpleGenericLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		size = 0;
	}
	
	T get(int index) {
		if (index < 0 || index > size - 1) {
			// return null;
			throw new ArrayIndexOutOfBoundsException();
		}

		GenericNode<T> temp = head;
		for (int i = 0; i < index; i++) { // index-1�� �ƴ�, index
			temp = temp.next; // temp -> �ش� node
			// ����Ʈ�� index, �ٷ� �� ������ node�� ������
			// �� ���� �ڸ��� ã�� �� �ִ�!
			// �� node�� ���� �ٷ� ���� �ּҸ��� ������ �ֱ� ����!
		}
		return (T) temp.data;
	}

	void add(int index, T data) {
		GenericNode<T> newNode = new GenericNode<T>(data);
		// ������ ����ó�� ���!
		if (index < 0 || index > size) { // ����ó��
			return;
		} else if (head == null) { // ���� ó��
			head = newNode;
		} else if (index == 0) { // ���� ó��
			newNode.next = head;
			head = newNode;
		} else if (index == size) { // �������� �߰�
			GenericNode<T> temp = head;
			for (int i = 0; i < size - 1; i++) { // ������ ��� ����
				temp = temp.next;
			}
			temp.next = newNode;
		} else {
			// �Ϲ����� ���
			GenericNode<T> temp = head;
			// aaa bbb ccc // add(1)
			for (int i = 0; i < index - 1; i++) {
				// ����Ʈ�� index, �ٷ� �� ������ node�� ������
				// �� ���� �ڸ��� ã�� �� �ִ�! �� node�� ���� �ٷ� ���� �ּҸ��� ������ �ֱ� ����!
				temp = temp.next;
			} // ���� temp�� ���� �� ���� node // temp.next => ���� ���� �ִ� node�� �ּ�!
			GenericNode<T> retemp = temp.next; // ���� ���� �ִ� node�� ������ retemp�� ����!
			temp.next = newNode; // ���� ���� �ִ� node�� �ּҿ�, newNode�� �ּҷ� ���� ������ ����
			newNode.next = retemp; // newNode�� ���� ����� ��ġ��, �����ص� retemp�� �ּҷ� ���� ������ ����!
		}
		size++;
	}

	// remove by index
	T remove(int index) {
		if (index < 0 || index > size - 1) {
			return null;
		}

		T val = null;
		if (index == 0) {
			val = head.data;
			head = head.next;
		} else {
			GenericNode<T> temp = head;
			for (int i = 0; i < index - 1; i++) { // index - 1�� �¾�!
				temp = temp.next; // temp -> ���� �� ���� node
			}
			GenericNode<T> toBeDeleted = temp.next;
			val = toBeDeleted.data;
			temp.next = toBeDeleted.next;
			// => temp.next = temp.next.next;
			// delete toBeDeleted;
		}

		size--;
		return val;
	}

	// remove by data
	boolean remove(T data) {
		int temp = indexOf(data);
		return (remove(temp) != null);
		// return (data == remove(index)); // �޶�
	}

	int indexOf(T str) {
		GenericNode<T> temp = head;
		for (int i = 0; i < size; i++) {
			// if(temp.data == str) {
			if (temp.data.equals(str)) {
				return i;
			}
			temp = temp.next;
		}
		// return -1;
		throw new NoSuchElementException();
	}

	int sizeOf() {
		return size;
	}

	@Override
	public String toString() {
		GenericNode<T> temp = head;
		String result = "";
		for (int i = 0; i < size; i++) {
			result = result + temp.data.toString() + " ";
			temp = temp.next;
		}
		return result;
	}

	// another toString
	public String toString(String delimiter) {
		GenericNode<T> temp = head;
		String result = "";
		for (int i = 0; i < size; i++) {
			result = result + temp.data.toString() + delimiter;
			temp = temp.next;
		}
		return result;
	}

}
