package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean isValindPalindrome = findValidPalindrome(str);
        System.out.println(isValindPalindrome);
    }

    private static boolean findValidPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int i = 0;
        int j = str.length() - 1;
        while (i<=j) {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
