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
		System.out.println("ArrayList ³¢¾îµé±â add, 2¹ø ÀÎµ¦½º, ½ÇÇà!");
		simpleDoubleLinkedList.add(2, "fff");
		System.out.println(simpleDoubleLinkedList);
		
		System.out.println();
		System.out.println("ArrayList ³¢¾îµé±â remove ½ÇÇà!");
		simpleDoubleLinkedList.remove(2);
		System.out.println(simpleDoubleLinkedList);
		
		System.out.println();
		System.out.println("ArrayList get(2) ½ÇÇà!");
		System.out.println(simpleDoubleLinkedList.get(2));
		
		System.out.println();
		System.out.println("ArrayList indexOf(" + "aaa" + ")½ÇÇà!");
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
		System.out.println("LinkedList ³¢¾îµé±â add, 1¹ø ÀÎµ¦½º, ½ÇÇà!");
		simpleLinkedList.add(1, "ggg");
		System.out.println(simpleLinkedList);
		
		System.out.println();
		System.out.println("LinkedList ³¢¾îµé±â remove ½ÇÇà!");
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
		System.out.println("LinkedList get(1) ½ÇÇà!");
		System.out.println(simpleLinkedList.get(1));
		
		System.out.println();
		System.out.println("LinkedList indexOf(" + "ccc" + ")½ÇÇà!");
		System.out.println(simpleLinkedList.indexOf("ccc"));
		**/
		
	}
	
}
