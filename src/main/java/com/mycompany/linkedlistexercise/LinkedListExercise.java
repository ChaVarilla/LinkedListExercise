/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linkedlistexercise;

import java.util.LinkedList;

/**
 *
 * @author Cha
 */
public class LinkedListExercise {

    public static void main(String[] args) {
        /*Print the list using println.
        Add orange to the beginning of the list.
        Print the list again.
        Remove an element from the list.
        Print the list again.
        Get an element at a specific index.
        Print the size of the list.*/
        
        LinkedList<String> color = new LinkedList<>();
        color.add("red");
        color.add("yellow");
        color.add("green");
        System.out.println("color linkedlist: "+color);
        String c1 = "orange";
        System.out.println("added color: "+c1);
        color.addFirst(c1);
        System.out.println("new color linkedlist: "+color);
        String c2 = "yellow";
        System.out.println("removed color: "+c2);
        color.remove(c2);       
        System.out.println("new color linkedlist: "+color);
        int c3 = 1;
        System.out.println("get element at index: "+c3);
        System.out.println("element: "+color.get(c3));
        System.out.println("Size of list: "+color.size());
    }
}
