package array;

public class GenericNode<T> {

	T data;
	GenericNode<T> next;

	public GenericNode(T str) {
		this.data = str;
		this.next = null;
	}
	
}
