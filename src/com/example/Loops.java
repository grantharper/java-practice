package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Loops {

    public static void main(String[] args) {

        int[] basic = { 1, 2, 3, 4 };

        // standard for loop
        for (int i = 0; i < basic.length; i++) {
            System.out.print(basic[i]);
            if (i < basic.length - 1)
                System.out.print(", ");
        }

        System.out.println();

        // enhanced for loop
        for (int b : basic) {
            System.out.print(b + ", "); // no way to eliminate comma from end
            // can't keep track of location in loop without a counter variable
        }

        System.out.println();

        // horrible usage of a do-while when it should be a for loop
        int i = 0;
        do {

            System.out.print(basic[i]);
            i++;
            if (i == basic.length)
                break;
        } while (true);

        System.out.println();

        // iterator and a while loop to iterate over a collection
        List<String> list = new ArrayList<>();

        list.add("This");
        list.add("is");
        list.add("lame");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {

            System.out.print(it.next());
            if (it.hasNext())
                System.out.print(" ");
        }

        System.out.println();

        // example of using a continue
        for (int a : basic) {
            for (int b : basic) {
                System.out.print(" " + a + ":" + b + " ");
                if (b == 2)
                    break; // will break out of inner loop at element 2 each
                           // time
            }
        }

        System.out.println();

        // example of using labels and break
        outer: for (int a : basic) {
            for (int b : basic) {
                System.out.print(" " + a + ":" + b + " ");
                if (b == 2)
                    break outer; // will make the loop stop after it hits 1:2
            }
        }

        System.out.println();

        // example of using labels and continue
        outer: for (int a : basic) {
            for (int b : basic) {
                System.out.print(" " + a + ":" + b + " ");
                if (b == 2)
                    continue outer; // will make the loop continue to iterate
                                    // over 1:1 1:2 2:1 2:2 ...
            }
        }
        
        
        System.out.println();
        
        //introducting some lack of bracket confusion
        int i1 = 0;
        while(i1 > 0)
            ; //this is necessary to close the while statement
        do i1++;
            while(i1 < 0);
        
        System.out.println(i1); //prints 1
    }

}
