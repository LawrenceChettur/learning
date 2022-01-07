package org.law.java;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class GenericsMain
{
    public static void main( String[] args )
    {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("test");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> items) {
        for(Integer item : items){
            System.out.println(item * 2);
        }
    }
}
