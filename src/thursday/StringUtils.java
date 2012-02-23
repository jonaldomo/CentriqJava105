package thursday;

import java.util.Arrays;

public class StringUtils {
	
	public static String reverse(String _string) {
		String reversed = "";
		for(int i = _string.length()-1; i >= 0; i--) {
			reversed += _string.charAt(i);
		}
		return reversed;		
	}
	
	public static String camelCase(String _string) {
		String camelCase = "";
		for(int i = 0; i < _string.length(); i++) {
			if(i%2 == 1) {
				camelCase += Character.toString(_string.charAt(i)).toUpperCase();
			}else {
				camelCase += Character.toString(_string.charAt(i)).toLowerCase();
			}
		}
		return camelCase;
	}
	
	public static String scramble(String _string) {
		String scrambled = "";
		while(_string.length() >= 1) {
			int random = (int)Math.round((Math.random()*_string.length())-1);
			if(random == -1) random = 0;
			System.out.println("Length is " + _string.length());
			System.out.println("Random is " + random);
			System.out.println("Character is " + Character.toString(_string.charAt(random)));
			scrambled += _string.charAt(random);
			System.out.println(_string.substring(0, random));
			if(random == 0) {
				_string = _string.substring(random+1, _string.length()-1);
			}else {
				_string = _string.substring(0, random) + _string.substring(random, _string.length());
			}
			System.out.println(_string);
			System.out.println(scrambled);
		}
		return scrambled;
	}
	
	public static void main(String[] args) {
		String name = "John Moses";
		System.out.println(StringUtils.reverse(name));
		System.out.println(StringUtils.camelCase(name));
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(StringUtils.scramble(name));
	}

}
