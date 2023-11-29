package CollectionsPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertArrayToHashset {
	public static void main(String[] args) {

		String[] s = { "a", "b", "c" };
		HashSet h=new HashSet<>(Arrays.asList(s));
		System.out.println(h);

	}
}
