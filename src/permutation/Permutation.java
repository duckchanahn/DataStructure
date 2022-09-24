package permutation;

public class Permutation {

	static char[] data = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
	static int n = 3; // => 이걸 바꾸면, 뽑을 대상의 수를 조절 가능!
	static int numberOfCases = 0;
	
	public static void main(String[] args) {
		permutation(0);
		System.out.println(numberOfCases);
	}
	
	private static void permutation(int k) {
		if (k == n) {
			printData();
			numberOfCases++;
			return;
		} else {
			for (int i = k; i < n; i++) {
				swap(data, i, k);
				permutation(k + 1);
				swap(data, i, k);
			}
		}
		return;
	}

	private static void swap(char[] data, int i, int k) {
		char temp = data[i];
		data[i] = data[k];
		data[k] = temp;
	}

	private static void printData() {
		for (int i = 0; i < n; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println(" ");
	}
	
}
