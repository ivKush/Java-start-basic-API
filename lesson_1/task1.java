/**
 * task1 Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести масимальное количество подряд идущих 1.
 */
public class task1{
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        int count = 0;
        int max = 0;
        for (int i : arr) {
            if (i == 1) {
                count += 1;
                
            } else {
                count = 0;
            }  
            if (count > max) 
                max = count;
        }
        System.out.println(max);
    }
}            
// }

//     public static void main(String[] args) {
//         int[] array = {1, 1, 0, 1, 1, 1};
        
//         int curr = 0;
//         int best = 0;
//         for (int i = 0; i < array.length; i++) {
//             int a = array[i];
//             if (a == 1) {
//                 curr++;
//             } else {
//                 if (curr > best) {
//                     best = curr;
//             }
//             curr = 0;
//             }
//         }
//         if (curr > best) {
//             best = curr;
//         }
        
//         System.out.println(best);
//     }
// }