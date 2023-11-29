package StringsPrograms;

public class C02StringInsertInAnotherString_GeeksForGeeks {
	public static void main(String[] args) {
		
		String s="GeeksGeeks";
		int index=4;
		String insertString="for";
		String sub1=s.substring(0,index+1);
		String sub2=s.substring(index,s.length());
		String finals=sub1+insertString+sub2;
		System.out.println(finals);
	}

}
