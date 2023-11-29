package programs.leetcode;

public class C04LongestCommonPrefix {
	static int min;
	static String s;
	static int arrLength;
	static int temp;
	static String[] array = { "flower", "flow", "flight" };
	static boolean flag = false;
	static String finalString;

	public static void main(String[] args) {

		arrLength = array.length;
		for (int i = 0; i < arrLength - 1; i++) {
			min = Math.min(array[i].length(), array[i + 1].length());
			s = array[i];
		}

		System.out.println(prefix());

	}

	static String prefix() {
		boolean flag = false;
		String sam = s;
		//for (int i = 0; i <=min; i++) {
		while(s.length()>0) {
			for (int j = 0; j <arrLength; j++) {
				if (array[j].contains(s)) {
					flag = true;
				} else {
					s = sam.substring(0, min - 1);
					flag=false;
				}
			}
			if(flag==true) {
				return s;
			}else {
				break;
			}
		}

		return finalString = flag ? s : "-1";
	}

}
