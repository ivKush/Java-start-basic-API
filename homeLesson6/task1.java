package homeLesson6;

import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
        
        ArrayList<String[]> workers = new ArrayList<>();

        String[] work1 = {"Иванов", "Иван", "30", "муж", "бугалтер", "Краснодар"}; 
        String[] work2 = {"Петров", "Роман", "25", "муж", "слесарь", "Москва"}; 
        String[] work3 = {"Семенов", "Иван", "18", "муж", "слесарь", "Краснодар"}; 
        String[] work4 = {"Иванов", "Петр", "20", "муж", "бугалтер", "Москва"}; 
    
        workers.add(work1); 
        workers.add(work2); 
        workers.add(work3); 
        workers.add(work4); 
        
        for (String[] work : workers) {
            if (Integer.parseInt(work[2]) > 20) {
                Person staff = new Person(work[0], work[1], work[2], work[3], work[4], work[5]);
                System.out.println(staff);
            }
            
        }

        System.out.println(work1[1].equals(work3[1]));
        System.out.println(work1[1].hashCode());
        System.out.println(work3[1].hashCode());

    }

}
