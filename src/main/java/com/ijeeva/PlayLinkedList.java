package com.ijeeva;

import java.util.LinkedList;

public class PlayLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(7);
        list.add(1);
        System.out.println(list);

        list.addFirst(10);
        list.addLast(0);
        System.out.println(list);

        list.add(2, 6);
        System.out.println(list);

        list.remove(Integer.valueOf(5));
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("print all the elements from the linked list");
        for(int element : list) {
            System.out.println(element);
        }

        // Linked List as a stack
        LinkedList<String> game = new LinkedList<>();
        game.push("mehul");
        game.push("rahul");
        game.push("jane");
        game.push("jill");
        System.out.println(game);

        // which person comes out first from the game
        System.out.println(game.pop());

        // which person comes out next from the game
        System.out.println(game.pop());

        // which person comes out next from the game
        System.out.println(game.pop());

        // which person comes out next from the game
        System.out.println(game.pop());

    }
}
