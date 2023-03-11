package homeLesson2;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class task1 {

    // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет
    // строку длины N,
    // которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b')
    // -> "ababab"

    public static void main(String[] args) {

        System.out.println("Длина строки: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Символ 1: ");
        Scanner sc1 = new Scanner(System.in);
        String c1 = sc1.nextLine();
        System.out.println("Символ 2: ");
        Scanner sc2 = new Scanner(System.in);
        String c2 = sc2.nextLine();
        sc.close();
        sc1.close();
        sc2.close();
        
        // long begin = System.currentTimeMillis();
        System.out.println(strConcat(N, c1, c2));
        // long end = System.currentTimeMillis();
        // System.out.println(end - begin);
    }

    
    static String strConcat(int arg, String c1, String c2) {

        StringBuffer res = new StringBuffer(c1);
        while (res.length() != arg) {
            res.append(c2);
            if (res.length() != arg ) {
                res.append(c1);
            }
        }
        return res.toString();

        // String res = ""; 
        // for (int i = 0; i < arg; i++) {
        //     res += c1;
        //     if (res.length() == arg) {
        //         break;
        //     }
        //     res += c2;
        //     if (res.length() == arg) {
        //         break;
        //     }
        // }
        // return res;  
    }
}
