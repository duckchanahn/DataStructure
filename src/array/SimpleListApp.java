package array;

public class SimpleListApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// SimpleGenericArrayList<String> simpleGenericArrayList = new SimpleGenericArrayList<>();
		// 기본 자료형일 때만, 뒤 <>, 여기에 자료형 적는 걸 생략 가능
		/*
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "aaa"); // 0
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "bbb"); // 1
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "ccc"); // 2
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "ddd"); // 3
		simpleGenericArrayList.add(simpleGenericArrayList.sizeOf(), "eee"); // 4
		System.out.println(simpleGenericArrayList);
		*/
		
		// SimpleGenericArrayList로도 가능!
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
		// equals를 Term에서 Override해야지 이걸 찾을 수 있다!
		
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
System.out.println("ArrayList 끼어들기 add, 2번 인덱스, 실행!");
simpleArrayList.add(2, "fff");
System.out.println(simpleArrayList);

System.out.println();
System.out.println("ArrayList 끼어들기 remove 실행!");
simpleArrayList.remove(2);
System.out.println(simpleArrayList);

System.out.println();
System.out.println("ArrayList get(2) 실행!");
System.out.println(simpleArrayList.get(2));

System.out.println();
System.out.println("ArrayList indexOf(" + "aaa" + ")실행!");
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
System.out.println("LinkedList 끼어들기 add, 1번 인덱스, 실행!");
simpleLinkedList.add(1, "ggg");
System.out.println(simpleLinkedList);

System.out.println();
System.out.println("LinkedList 끼어들기 remove 실행!");
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
System.out.println("LinkedList get(1) 실행!");
System.out.println(simpleLinkedList.get(1));

System.out.println();
System.out.println("LinkedList indexOf(" + "ccc" + ")실행!");
System.out.println(simpleLinkedList.indexOf("ccc"));
**/
