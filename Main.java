package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();

        // adding element at last
        list.add(5);
        list.add(9);
        list.add(7);

        System.out.println("List = "+list);
        System.out.println("Size = "+list.size());
        System.out.println("Element at 1st index = "+list.get(1));

        // adding element in between
        list.add(1,3);
        System.out.println("NewList = "+list);

        // removing element from ArrayList
        list.remove(2);
        System.out.println("List after removing 2nd index = "+list);
    }
}
