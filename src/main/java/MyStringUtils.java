import java.util.ArrayList;

/**
 * Created by Taylor on 2/21/16.
 */
public class MyStringUtils {
    public static String stringofCharsToReturn = "";
    public static String stringOfStringsToReturn = "";
    public static String[] arrStrings;
    public static String newString = "";
    public static String tempString = "";

    public static String combineCharactersOrStrings(char[] someChars) {
        for (int i = 0; i < someChars.length; i++) {
            if (i != someChars.length - 1) {
                stringofCharsToReturn += someChars[i] + ",";
            } else {
                stringofCharsToReturn += someChars[i];
            }
        }
        return stringofCharsToReturn;
    }

    public static String combineCharactersOrStrings(String[] someStrings) {
        for (int i = 0; i < someStrings.length; i++) {
            if (i != someStrings.length - 1) {
                stringOfStringsToReturn += someStrings[i] + ",";
            } else {
                stringOfStringsToReturn += someStrings[i];
            }
        }
        return stringOfStringsToReturn;
    }

    public static String[] makeArrayOfStrings(String aString) {
        arrStrings = aString.split("\\n");
        return arrStrings;
    }

    public static String reversCapitialize(String aString) {
        char[] chars = new char[aString.length()];
        for (int i = 0; i < aString.length(); i++) {
            chars[i] = aString.charAt(i);
            if (i == 0 || chars[i - 1] == ' ') {
                newString += chars[i];
            } else {
                newString += Character.toUpperCase(chars[i]);

            }
        }
        return newString;
    }

    public static String reverseString(String aString) {
        for (int i = aString.length() - 1; i >= 0; i--) {
            tempString += "" + aString.charAt(i);
        }
        return tempString;
    }

    public static String replaceWhiteSpaceWithNewline(String aString) {
        String newString = aString.replaceAll("\\s", "\n");
        return newString;
    }

    public static ArrayList<String> permutate(String aString) {
        ArrayList<String> permutations = new ArrayList<String>();
        int stringLength = aString.length();
        if (stringLength > 0) {
            // Add first character to arrayList
            permutations.add(Character.toString(aString.charAt(0)));

            // Repeat for rest of chars in aString
            for (int i = 1;  i < stringLength; i++) {

                // Get next char
                char nextChar = aString.charAt(i);

                // For each of the strings currently in arrayList do the following:
                int size = permutations.size();
                for (int j = 0;  j < size; j++) {

                    // remove the string
                    String aNewString = permutations.remove(0);
                    int removedLength = aNewString.length();

                    // Add removedLength + 1 new string to arrayList
                    // Each new string is made up of first captured char plus next characters at new index
                    for (int k = 0;  k <= removedLength; k++) {
                        permutations.add(aNewString.substring(0, k) + nextChar + aNewString.substring(k));
                    }
                }
            }
        }
        return permutations;
    }
}

