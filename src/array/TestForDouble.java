package array;

public class TestForDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SimpleDoubleLinkedList simpleDoubleLinkedList = new SimpleDoubleLinkedList();
		
		SimpleDoubleLinkedList simpleDoubleLinkedList = new SimpleDoubleLinkedList();
		simpleDoubleLinkedList.add(simpleDoubleLinkedList.sizeOf(), "aaa"); // 0
		simpleDoubleLinkedList.add(simpleDoubleLinkedList.sizeOf(), "bbb"); // 1
		simpleDoubleLinkedList.add(simpleDoubleLinkedList.sizeOf(), "ccc"); // 2
		simpleDoubleLinkedList.add(simpleDoubleLinkedList.sizeOf(), "ddd"); // 3
		simpleDoubleLinkedList.add(simpleDoubleLinkedList.sizeOf(), "eee"); // 4
		System.out.println(simpleDoubleLinkedList);
		
		System.out.println();
		System.out.println("ArrayList ������ add, 2�� �ε���, ����!");
		simpleDoubleLinkedList.add(2, "fff");
		System.out.println(simpleDoubleLinkedList);
		
		System.out.println();
		System.out.println("ArrayList ������ remove ����!");
		simpleDoubleLinkedList.remove(2);
		System.out.println(simpleDoubleLinkedList);
		
		System.out.println();
		System.out.println("ArrayList get(2) ����!");
		System.out.println(simpleDoubleLinkedList.get(2));
		
		System.out.println();
		System.out.println("ArrayList indexOf(" + "aaa" + ")����!");
		System.out.println(simpleDoubleLinkedList.indexOf("aaa"));
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		/**
		SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
		simpleLinkedList.add(simpleLinkedList.sizeOf(), "aaa"); // 0
		simpleLinkedList.add(simpleLinkedList.sizeOf(), "bbb"); // 1
		simpleLinkedList.add(simpleLinkedList.sizeOf(), "ccc"); // 2
		simpleLinkedList.add(simpleLinkedList.sizeOf(), "ddd"); // 3
		simpleLinkedList.add(simpleLinkedList.sizeOf(), "eee"); // 4
		System.out.println(simpleLinkedList);
		
		System.out.println();
		System.out.println("LinkedList ������ add, 1�� �ε���, ����!");
		simpleLinkedList.add(1, "ggg");
		System.out.println(simpleLinkedList);
		
		System.out.println();
		System.out.println("LinkedList ������ remove ����!");
		simpleLinkedList.remove(2);
		System.out.println(simpleLinkedList);
		
		System.out.println("############################");
		simpleLinkedList.remove(0);
		System.out.println(simpleLinkedList);
		System.out.println("**********");
		simpleLinkedList.remove(simpleLinkedList.sizeOf() - 1);
		System.out.println(simpleLinkedList);
		System.out.println("############################");
		
		System.out.println();
		System.out.println("LinkedList get(1) ����!");
		System.out.println(simpleLinkedList.get(1));
		
		System.out.println();
		System.out.println("LinkedList indexOf(" + "ccc" + ")����!");
		System.out.println(simpleLinkedList.indexOf("ccc"));
		**/
		
	}
	
}
