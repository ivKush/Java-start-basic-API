package lesson2;

public class task1 {

    public static void main(String[] args) {

        System.out.println(compress("aaaabbbcdd"));
    }
        static String compress(String input) {
            String result = "";
            int count = 1;
            char[] chars = input.toCharArray();
            char tmp = chars[0];
            for (int i = 1; i < chars.length; i++) {
                char c = chars[i];
            if (tmp == c) {
                count++;
            } else {
                if (count > 1) {
                    result += String.valueOf(tmp) + count;
                } else {
                result += tmp;
                }
                tmp = c;
                count = 1;
            }
            }
            if (count > 1) {
                result += String.valueOf(tmp) + count;
            } else {
                result += tmp;
            }
            return result;
        }    
    
}
