Differences between Enumeration and Iterator upto Latest version(Java 15)
=========================================
package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Diff #1:
/*
* Enumeration is a legacy interface.
* - It is used for retrieving elements from legacy collections.
* - If we want to use Enumeration on Collections Framework collections
* we must use Collections.enumeraiton(c) method
*
* Iterator is a collections framework interface.
* - It is used for retrieving elements from both
* collections framework and legacy collections
*
*/

//Diff #2:
/*
* Enumeration<E> has only two methods
* - for checking and retrieving elements from underlying collection
* 1) public boolean hasMoreElements()
* 2) public E nextElement()
*
* Iterator<E> as three methods
* - for checking, retrieving and also for removing
* 1) public boolean hasNext()
* 2) public E next()
* 3) public void remove()
*
* Note: Enumeration<E> has one more method "asIterator()" added in Java 9v
* to use Enumeration as Iterator.
* public Iterator<E> asIterator()
*
* Note: Iterator<E> has one more method "forEachRemaining(Consumer);" added in Java 8v
* public void forEachRemaining(Consumer<? super E>);
*
* In total, in Enumeration we have 3 methods
* In total, in Iterator we have 4 methods
*
*/

//Diff #3
/*
* Using Enumeration we can not remove elements while iterating
* Using Iterator we can remove elements while iterating
*
*/

//Diff #4:
/*
* If we want allow other programmer to only retrieve elements from our collection
* we must return our collection as Enumeration object
*
* If we want allow other programmer to retrieve and also remove elements from colletion
* we must return collection as Iterator
*
*/

//Diff #5:
/*
* Iterator is fail-fast
* on both collections framework and legacy collections
*
* Enumeration is both fail fast and not fail fast
* on legacy collections by using elements() method
*
* via Collections.enumeration(c) method on
* both collections framework and legacy collections
*
*/

/*
* A cursor that does not allow modifying a collection
* structurally by using collection method, is called fail fast.
*
* (or)
*
* A cursor object that does not allow Concurrent Modifications on collection
* is called fail fast cursor.
*
* It means after cursor object obtained, if we modify collection object structurally
* by using collection methods and if this cursor throws ConcurrentModificationException
* with next() method call, we call this cursor as fail fast cursor.
*
*/

public class Test21_IteratorVsEnumeration {
public static void main(String[] args) {

ArrayList<Object> al = new ArrayList<>();

al.add("a");
al.add("b");
al.add("c");
al.add("d");

Iterator<Object> itr1 = al.iterator();
System.out.println(itr1.next());

al.add("e"); //concurrently modified with collection method
//System.out.println(itr1.next()); //throws CME because Iterator is fail fast cursor

//============================================================================================

Enumeration<Object> e1 = Collections.enumeration(al);
System.out.println(e1.nextElement());

al.add("f"); //concurrently modified with collection method
//System.out.println(e1.nextElement()); //throws CME because
//Collection.enumeration(-) is fail fast cursor
System.out.println();
//============================================================================================
Vector<Object> v1 = new Vector<>();
v1.add(5);

Iterator<Object> itr2 = v1.iterator();
System.out.println(itr2.next());

v1.add(6); //concurrently modified with collection method
//System.out.println(itr2.next()); //throws CME because Iterator is fail fast cursor
System.out.println();

//============================================================================================

Enumeration<Object> e2 = v1.elements();
System.out.println(e2.nextElement());

v1.add(7);
System.out.println(e2.nextElement()); //no exception, because Enumeration via
//elements() method with legacy
//implementation is not fail fast

Enumeration<Object> e3 = Collections.enumeration(v1); //by default fail fast
//implementation because
v1.add(8); //it is common to all
//System.out.println(e3.nextElement()); //collections


}
}