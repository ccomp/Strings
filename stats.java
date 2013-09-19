import java.util.Arrays;

// only methods left:
// mode
// standard deviation

public class stats {
	
	public static void main(String[] args) {
		int[] mainArray;
		mainArray = new int[10];
		for (int i =0; i<10; i++) {
			mainArray[i] = (int)(Math.random()* 10);
			System.out.println(Arrays.toString(mainArray));
		};

		quartile3(mainArray);
	}

	public static int max(int[] a) {
		int x=0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] > x) {
				x=a[i];
				System.out.print("Max of array: " + x);
			}
		}
		System.out.println();
		return x;
	}

	public static int min(int[] a) {
		int x=0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] < x) {
				x=a[i];
				System.out.print("Min of array: " + x);
			}
		}
		System.out.println();
		return x;
	}

	public static int mean(int[] a) {
		int x=0;
		for (int i = 0; i<a.length; i++) {
			x+=a[i];
		}
		x/=a.length;
		System.out.print("Mean of array: " + x);
		System.out.println();
		return x;
	}

	public static int median(int[] a) {
		Arrays.sort(a);
		int x=0;
		for (int i = 0; i<a.length; i++) {
			x=a[i];
			if (a.length%2==0) {
				System.out.print("Median of array: " + a[5]);
			} else {
				x=(x/2);
				System.out.print("Median of array: " + x);
			}
			System.out.println();
		}
		return x;
	}

	public static int quartile1(int[] a) {
		Arrays.sort(a);
		int x=0;
		for (int i = 0; i<a.length; i++) {
			System.out.println("1: "+ a[0]);
			System.out.println("2: "+ a[1]);
			System.out.println("3: "+ a[2]);
			System.out.println("4: "+ a[3]);
		}
		System.out.println();
		return x;
	}

	public static int quartile3(int[] b) {
		Arrays.sort(a);
		int x=0;
		for (int i = 0; i<a.length; i++) {
			System.out.println("7: "+ a[6]);
			System.out.println("8: "+ a[7]);
			System.out.println("9: "+ a[8]);
			System.out.println("10: "+ a[9]);
		}
		System.out.println();
		return x;
	}

}
