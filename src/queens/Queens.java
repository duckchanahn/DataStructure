package queens;

public class Queens {
	
	int N=4;
	int [] cols = new int [N+1]; // col[i] means column # of i-th Queen
	
	private boolean queens(int row) {
		if (!feasible(row)) {
			return false;
		}
		else {
			if (row==N) {
				return true;  // ==> Found!
			}
			else {
				System.out.println(" level "+ row);
				printCols();
				for (int i =1; i<=N; i++) {
					cols[row+1]=i;
					if (queens(row+1)) {
						return true; // Àç±Í! Recursion!
					}
				}
			}
			System.out.println(" false : backtracking to level "+ (row-1));
			for (int j=row; j<N+1; j++) {
				cols[j]=0;
			}
			return false;
		}
	}
	
	private void printCols() {
		System.out.print(" column status : ");
		for (int i=1; i<=N; i++) {
			System.out.print("  "+ cols[i]);	
		}
		System.out.println();
	}
	
	private boolean feasible(int row) {
		System.out.print("  --- "+row+"-th Queen ");
		for (int i=1; i<row; i++) {
			if (cols[i]==cols[row]) {
				System.out.print("-> column "+ i+" : column occupied \n");
				return false;
			}
			else 
				if((row-i) == Math.abs(cols[i]-cols[row])) {
					System.out.print("-> column "+ cols[row]+" : diagonal condition failed \n");
					return false;
				}
		}
		System.out.print("-> column "+ cols[row]+" :  feasible !\n");
		return true;
	}
	
	public static void main(String[] args) {
		Queens q = new Queens();
		if (q.queens(0)) {
			System.out.println("\n ===> Found !!! ");
			q.printCols();
		}
		else {
			System.out.println("\n ===> Impossible...  ");
		}

	}

}
