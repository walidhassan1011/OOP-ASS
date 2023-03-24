import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(5);
        list.add(8);
       int n=max(list);
       ArrayList<Integer> list2=Sort(list);
       System.out.println(list2);
        System.out.println(n);
    }

    // question 2

    public static Integer max (ArrayList<Integer> list) {


        if (list.size() == 0) {
            System.out.println("The list is empty");
            return null   ;
        }
        if (list.size() == 1) {
            System.out.println("The list has only one element");
            return list.get(0);
        }


        Collections.sort(list);

        return list.get(list.size() - 1);
    }
    // question 3
    public static ArrayList<Integer> Sort (ArrayList<Integer> list) {
        if (list.size() == 0) {
            System.out.println("The list is empty");
            return null;
        }
        Collections.sort(list);

        return list;
    }
}