public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        if (str == null) {
            return null;
        }
        String result = "";
        char currentChar;
        int asciiValue;
        for (int i=0; i<str.length(); i++) {
            currentChar = str.charAt(i);
            asciiValue = (int) currentChar;
            if (asciiValue>=65 && asciiValue<=90) {
                result = result + (char) (asciiValue + 32);
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2.length()==0) {
            return true;
        }
        if (str1.length()<str2.length()) {
            return false;
        }
        for (int i=0; i<(str1.length()-str2.length()+1); i++) {
            boolean subString = true;
            for (int j=0; j<str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    subString = false;
                    break;
                }
            }
            if (subString) {
                return true;
            }
        }
        return false;
    }
}
