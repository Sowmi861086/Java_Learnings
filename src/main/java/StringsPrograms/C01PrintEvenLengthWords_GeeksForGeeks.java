package StringsPrograms;

public class C01PrintEvenLengthWords_GeeksForGeeks {
	public static void main(String[] args) {
		
		
		String s="this is my wallet and handbag";
		String[] sarray=s.split("\\s");
		
		for (String x : sarray) {
			if(x.length()%2==0) {
				System.out.println(x);
			}
		}
		
	}

}
