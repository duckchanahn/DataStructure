package array;

public class SimpleListApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SimpleGenericArrayList<String> simpleGenericArrayList = new SimpleGenericArrayList<>();
		// �⺻ �ڷ����� ����, �� <>, ���⿡ �ڷ��� ���� �� ���� ����
		/*
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "aaa"); // 0
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "bbb"); // 1
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "ccc"); // 2
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "ddd"); // 3
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "eee"); // 4
		System.out.println(simpleGenericArrayList);
		*/
		
		// SimpleGenericArrayList�ε� ����!
		SimpleGenericLinkedList<Term> simpleGenericLinkedList = new SimpleGenericLinkedList<Term>();
		simpleGenericLinkedList.add(0, new Term(1,2)); // 5
		simpleGenericLinkedList.add(0, new Term(2,3)); // 4
		simpleGenericLinkedList.add(0, new Term(4,7)); // 3
		simpleGenericLinkedList.add(0, new Term(5,5)); // 2
		simpleGenericLinkedList.add(0, new Term(3,6)); // 1
		Term temp = new Term(7, 9);
		simpleGenericLinkedList.add(0, temp); // 0
		System.out.println(simpleGenericLinkedList);
		
		System.out.println(simpleGenericLinkedList.get(4));
		System.out.println(simpleGenericLinkedList.indexOf(temp));
		System.out.println(simpleGenericLinkedList.indexOf(new Term(3, 6)));
		// equals�� Term���� Override�ؾ��� �̰� ã�� �� �ִ�!
		
		System.out.println(simpleGenericLinkedList.toString("+"));
		
	}
	
}

/**
SimpleArrayList simpleArrayList = new SimpleArrayList();
simpleArrayList.add(simpleArrayList.sizeOf(), "aaa"); // 0
simpleArrayList.add(simpleArrayList.sizeOf(), "bbb"); // 1
simpleArrayList.add(simpleArrayList.sizeOf(), "ccc"); // 2
simpleArrayList.add(simpleArrayList.sizeOf(), "ddd"); // 3
simpleArrayList.add(simpleArrayList.sizeOf(), "eee"); // 4
System.out.println(simpleArrayList);

System.out.println();
System.out.println("ArrayList ������ add, 2�� �ε���, ����!");
simpleArrayList.add(2, "fff");
System.out.println(simpleArrayList);

System.out.println();
System.out.println("ArrayList ������ remove ����!");
simpleArrayList.remove(2);
System.out.println(simpleArrayList);

System.out.println();
System.out.println("ArrayList get(2) ����!");
System.out.println(simpleArrayList.get(2));

System.out.println();
System.out.println("ArrayList indexOf(" + "aaa" + ")����!");
System.out.println(simpleArrayList.indexOf("aaa"));

System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();

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
