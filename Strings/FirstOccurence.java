package Strings;

public class FirstOccurence {
    public static void main(String[] args) {
        String needle = "anees";
        String heyStack = "mohamedaneesmk";
        int resultIndex = findIndexOfFirstOccurence(heyStack,needle);
        System.out.println(resultIndex);
    }

    private static int findIndexOfFirstOccurence(String heyStack, String needle) {
        int m = heyStack.length();
        int n = needle.length();

        if(n==0) return 0;

        for(int i=0;i<m-n;i++){
            if(heyStack.substring(i, i+n).equals(needle)){
                return i;
            }
        }

        return -1;
    }
}
