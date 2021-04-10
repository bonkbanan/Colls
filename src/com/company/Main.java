package com.company;

import java.util.*;

public class Main {

   public static String getPrefix(String[] array){
        //your code here найти спільний префікм
       return null;
   }

    public static Boolean hasRepetitions(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //your code here найти повторяюще число
            }
        }
        return false;
    }

    public static void main(String[] args) {
	    int[] array= {1, 9, 8, 16, 35, 7, 56, 2, 1, 8};
	    String[] array2={"abc","abcd","abcde","aba"};
        System.out.println(hasRepetitions(array));
        System.out.println("_______Collections_______");
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1,23,54,765,876,5,464,56)
        );
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1) {
                System.out.print(array[i] + ", ");
            }else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.println(Arrays.toString(array));
        List<String> greetings=new ArrayList<>(
                Arrays.asList("Hello","Hi","Good morning","Good evening","Sup")
        );
        greetings.add("Greetings");
        greetings.add(2,"Shalom");
        greetings.remove(1);
        System.out.println(greetings.get(1));
        greetings.remove("Sup");
        System.out.println(greetings);
        greetings.stream().filter(item->item.contains("Good"))
                .forEach(System.out::println);

        Set<String> set = new HashSet<>();
        set.add("abc");
        set.add("abd");
        set.add("abe");
        System.out.println(set);
        Map<String,Integer> map = new HashMap<>();
        map.put("Artem",8);
        map.put("Sasha",9);
        map.put("David",8);
        map.put("Max",3);
        map.put("Denys",7);
        System.out.println(map);
        map.put("Denys",0);
        System.out.println(map);
    }
}
