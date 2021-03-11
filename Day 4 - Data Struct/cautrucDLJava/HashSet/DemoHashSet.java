/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luvina.Lec5.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class DemoHashSet {
    public static void main(String[] args) {
        Set<Book> setBook = new HashSet<>();
        setBook.add(new Book("X", "Putin", 6));
        setBook.add(new Book("A", "Trump", 13));
        setBook.add(new Book("B", "Poroshenko", 19));
        setBook.add(new Book("D", "NPT", 17));
        Iterator<Book> iterator = setBook.iterator();
        while(iterator.hasNext()){
            Book b = iterator.next();
            System.out.println(b);
        }
        // O(1)
        boolean kt=setBook.contains( new Book("X...", "Putin", 6));
        if (kt) System.out.println("Found");
   }
}
