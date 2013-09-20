public class exercise10 {
	
	public static void main(String[] args) {
		isAbecedarian("deflux");
		if (isAbecedarian == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean isAbecedarian(String s) {
		int chr=26;
		int r=0;
		for (int i=0; i<s.length(); i++) {
			r+=s.charAt(i);
			if (chr<r) {
				return false;
			}
			chr=result;
		}
		return true;
	}

	public static String captainCrunch(String s) {
		String result = "";

		for (int i=0; i<s; i++) {
			char c = s.charAt(i);
			char coded = (char)((int)c+13);
			double x = (double)3;
			int i = (int)3.3;

			if (c<26) {

			}

			String str = "" + 3.0;

			result = result + coded;
		}
		System.out.println(result);
		return result;

	}
}
