package CollectionsFramework.Maps;

import java.util.HashMap;
import java.util.Map;

public class hashFunction {

	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		System.out.println(getHash("CAT"));
		System.out.println(getHash("DOG"));
		System.out.println(getHash("BALL"));
		System.out.println(getHash("GOD"));
	}
	static int getHash(String s) {
		int hash = 0;
		for(int i=0;i<s.length();i++){
			hash += s.charAt(i);
		}
		return hash;
	}
}
