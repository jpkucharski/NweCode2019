package main;

import java.util.*;

public class LambdaComparator {

    public static void main (String[] args){

        List<String> list = Arrays.asList("Ala","Magda", "Kamila","Agnieszka", "Iwona","Natalia");
        list.forEach(item -> {
            if(item.startsWith("K")) System.out.println(item);
            else System.out.print("");
        });

        list.forEach(item ->{
            if(item.startsWith("A")) System.out.println(item);
        });
        System.out.println("-----------------------------------------");

        Comparator<String> comparator = (first, second) -> {
            if(first.length()> second.length()) return -1;
            else if(first.length()< second.length()) return 1;
            else return 0;
        };

        List<String> copyOfList = new ArrayList(list);

        list.sort(comparator);
        Collections.sort(copyOfList, Collections.reverseOrder());
        copyOfList.forEach(item -> System.out.println(item));
    }
}
