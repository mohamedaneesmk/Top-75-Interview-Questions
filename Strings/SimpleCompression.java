package Strings;

public class SimpleCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int len = compress(chars);
        System.out.println("Length: " + len);  // 6
        System.out.print("Compressed: ");
        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");  // a 2 b 2 c 3
        }
    }

    private static int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while(i<chars.length){
            char current = chars[i];
            int count = 0;

            // How many times the character appear in a row 
            while(i<chars.length && chars[i]==current){
                i++;
                count++;
            }

            // Write the letter 
            chars[write++] = current;

            // Write the number if more than 1 
            if(count>1){
                String str = String.valueOf(count);
                for(char c:str.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        
        return write;
    }
}
