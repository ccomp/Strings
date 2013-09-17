public class multi {

	// sumRow(n)
	// sumCol
	// sum total
	// reverserow
	// reverse col
	// determinate


	public static void main(String[] args) {
		int[][] a = { {1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15} };
		reverserow(a);
	}


	public void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void sumRow(int[][] a) {
		int x=0;
		for (int i=0; i<a.length; i++) {
			for (int c=0; c<a[i].length; c++) {
				x += a[i][c];
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public static void sumCol(int[][] a) {
		int x=0;
		for (int i=0; i<a.length; i++) {
			for (int c=0; c<a[i].length; c++) {
				x=a[0][c];
				x+=a[i][c];
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public static void sumTot(int[][] a) {
		int x=0;
		for (int i=0; i<a.length; i++) {
			for (int c=0; c<a[i].length; c++) {
				x += a[i][c];
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

	public static void reverserow(int[][] a) {
		int x=0;
		for (int i=0; i<a.length; i++) {
			for (int c=0; c<a[i].length; c++) {
				x=a[2][4];
				x-=a[i][c];
				x++;
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
}
