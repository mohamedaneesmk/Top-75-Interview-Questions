package Strings;

public class SubstringPattern {
    public static void main(String[] args) {
        String str = "abab";
        boolean isTrue = findDoesItContainsPattern(str);
        System.out.println(isTrue);
    }

    private static boolean findDoesItContainsPattern(String str) {
        String doubled = str + str;
        String trimmed = doubled.substring(1,doubled.length()-1);
        return trimmed.contains(str);
    }
}
