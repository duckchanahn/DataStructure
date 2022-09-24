package array;

public class DoubleGenericNode<T> {
	
	String data;
	DoubleGenericNode<T> next;
	DoubleGenericNode<T> prev;
	
	public DoubleGenericNode(String str) {
		this.data = str;
		this.next = null;
		this.prev = null;
	}
	
}
