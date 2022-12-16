//Задание 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Domashka4;

import java.util.LinkedList;
import java.util.Iterator;

public class Zadacha1 {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        Iterator<Integer> iterator = ll.descendingIterator();
        // System.out.print("[");
        while (iterator.hasNext()) 
        {
            System.out.print(iterator.next());
        }
        // System.out.print("]");
    }

    
}
