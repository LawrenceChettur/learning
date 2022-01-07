package org.law.learnings;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int localValue = 5;
        calculatePrimitiveInt(localValue);
        System.out.println("Primitive Int: " + localValue);

        Integer intObj = 5;
        calculateIntObj(intObj);
        System.out.println("Wrapper Int: " + intObj);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        calculateWrapperIntList(integerList);
        System.out.println("Wrapper Int List: " + integerList.size());

    }

    private static void calculateWrapperIntList(List<Integer> integerList) {
        integerList.add(3);
        System.out.println(integerList.size());
    }

    private static void calculateIntObj(Integer intObj) {
        intObj = intObj * 100;
        System.out.println(intObj);
    }

    private static void calculatePrimitiveInt(int localValue) {
        localValue = localValue * 100;
        System.out.println(localValue);
    }
}
