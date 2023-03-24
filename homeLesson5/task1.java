package homeLesson5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.sound.sampled.AudioFormat.Encoding;

public class task1 {
    /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "UTF-8");
        String text = sc.nextLine();
        sc.close();
        // String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";

        long start = System.currentTimeMillis();
        colltext(text);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        long start2 = System.currentTimeMillis();
        collectStats(text);
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
        
    }
    static void colltext(String text) {
        String[] splitText = text.split(" ");
        Map<Integer, Collection<String>> collText = new TreeMap<>();

        for (int i = 0; i < splitText.length; i++) {
            ArrayList<String> lenText = new ArrayList<>();
            for (String s : splitText) {
                if (splitText[i].length() == s.length()) {
                    lenText.add(s);
                }
            }
            collText.put(splitText[i].length(), lenText);
        }
        // System.out.println(collText);
        for (Collection<String> s : collText.values()) {
        System.out.println(s);
        }
    }
    // Решение Якова
    static void collectStats(String text) {
        List<String> listStr = Arrays.asList(text.split(" "));
        Map<Integer, List<String>> stats = new HashMap<>();
        listStr.forEach(str -> {
            stats.merge(str.length(), Arrays.asList(str),
                    (oldList, newList) -> Stream.concat(oldList.stream(), newList.stream()) // <--*
                            .collect(Collectors.toList()));
        });
        System.out.println(stats);
    }
}
