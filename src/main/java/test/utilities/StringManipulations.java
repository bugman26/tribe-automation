package test.utilities;

public class StringManipulations {
	
	public static String generateRandomString(int count, String stringChoices) {

		String aphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String withSpecialChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*(())_+><.,'";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numeric = "0123456789";

		StringBuilder builder = new StringBuilder();
		String randomString = "";

		if (stringChoices.equalsIgnoreCase("aphaNumeric")) {
			randomString = aphaNumeric;
		} else if (stringChoices.equalsIgnoreCase("withSpecialChars")) {
			randomString = withSpecialChars;
		} else if (stringChoices.equalsIgnoreCase("alphabet")) {
			randomString = alphabet;
		} else if (stringChoices.equalsIgnoreCase("numeric")) {
			randomString = numeric;
		}

		while (count-- != 0) {
			int character = (int) (Math.random() * randomString.length());
			builder.append(randomString.charAt(character));
		}
		return builder.toString().toLowerCase();
	}

}
