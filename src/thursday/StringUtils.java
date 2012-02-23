package thursday;

public class StringUtils {

	public static String reverse(String _string) {
		String reversed = "";
		for (int i = _string.length() - 1; i >= 0; i--) {
			reversed += _string.charAt(i);
		}
		return reversed;
	}

	public static String camelCase(String _string) {
		String camelCase = "";
		for (int i = 0; i < _string.length(); i++) {
			if (i % 2 == 1) {
				camelCase += Character.toString(_string.charAt(i))
						.toUpperCase();
			} else {
				camelCase += Character.toString(_string.charAt(i))
						.toLowerCase();
			}
		}
		return camelCase;
	}

	public static String scramble(String _string) {
		String scrambled = "";
		while (_string.length() >= 1) {
			int random = (int) Math.round((Math.random() * _string.length()) - 1);
			random = (random == -1) ? 0 : random;
			scrambled += _string.charAt(random);
			_string = (random == 0) ? _string = _string.substring(random + 1,
					_string.length()) : _string.substring(0, random)
					+ _string.substring(random + 1, _string.length());
		}
		return scrambled;
	}

	public static void main(String[] args) {
		String name = "John Moses";
		System.out.println(StringUtils.reverse(name));
		System.out.println(StringUtils.camelCase(name));
		System.out.println(StringUtils.scramble(name));
	}

}
