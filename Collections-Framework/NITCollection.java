Custom Collection Development
=====================
package com.nit.hk.customcollections;
/**
 * A custom collection for storing <br> 
 * multiple individual homogeneous and heterogeneous <br>
 * unique and duplicate objects including null <br>
 * without size limitation <br>
 * 
 *  @author HK
 *  @since 1.0
 *  @version 1.0
 */
public class NITCollection {
 /** 
  * Object[] object used for storing elements 
  * without type limitation
  */
 private Object[] objArray ;
 /** 
  * count variable used for maintaining number of objects stored and 
  * also used for maintaining next element index 
  */
 private int   elementCount ;
 /** 
  * creates empty collection with the capacity 10
  *   
  */
 public NITCollection() {
 objArray  = new Object[10];
 elementCount  = 0;
 }
 /**
  * adds given element to current collection
  * this method implements growable array algorithm
  * when collection is full, it increases collection capacity to double
  * 
  * @param obj takes any class object including primitives 
  *  
  */
 public void add(Object obj) { 
 if(size() == capacity()) {
 grow();
 }
 objArray[elementCount++] = obj;
 }
 /**
  * increases capacity of this collection by double 
  */
 private void grow() {
 Object[] nextArray = new Object[capacity()*2];
 for(int i=0; i<size(); i++) {
 nextArray[i] = objArray[i];
 }
 objArray = nextArray;
 }
 /**
  * returns current capacity of this collection
  * 
  * @return current capacity
  */
 public int capacity() {
 return objArray.length;
 }
 /**
  * returns current size of this collection
  * 
  * @return current size
  */
 public int size() {
 return elementCount;
 }
 /**
  * searches the given object in this collection
  * 
  * @param obj the object you want to find in this collection
  * @return {@code true} if this collection contains the specified element
  */
 public boolean contains(Object obj) {
 return this.indexOf(obj) >= 0;
 }
 /**
  * returns the given object index number first occurrence 
  *  
  * @param obj the object you want to find in this collection
  * @return element index if found or -1 if not found 
  */
 public int indexOf(Object obj) {
 if(obj == null) {
 for(int index=0; index<size(); index++) {
 System.out.println(obj +" is comparing with "+objArray[index]);
 if(obj == objArray[index])
 return index;
 }
 }else {
 for(int index=0; index<size(); index++) {
 System.out.println(obj +" is comparing with "+objArray[index]);
 if(obj.equals(objArray[index]))
 return index;
 }
 }
 return -1;
 }
 /**
  * returns the given object index number last occurrence 
  *  
  * @param obj the object you want to find in this collection
  * @return element index if found or -1 if not found 
  */
 public int lastIndexOf(Object obj) {
 if(obj == null) {
 for(int index=size()-1; index>=0; index--) {
 System.out.println(obj +" is comparing with "+objArray[index]);
 if(obj == objArray[index])
 return index;
 }
 }else {
 for(int index=size()-1; index>=0; index--) {
 System.out.println(obj +" is comparing with "+objArray[index]);
 if(obj.equals(objArray[index]))
 return index;
 }
 }
 return -1;
 }
 /**
  * returns the object reference available at the given index in this collection
  * 
  * @param index index of the element to return
  * @return the element at the specified position in this list
  * @throws IndexOutOfBoundsException if the given index not found
  */
 public Object get(int index) {
 checkIndex(index);
 return objArray[index];
 }
 /**
  * removes the element from this collection from the given index
  * 
  * @param index index from which the element want to remove
  * @throws IndexOutOfBoundsException if the given index not found
  */
 public void remove(int index) {
 checkIndex(index);
 for(; index<size()-1; index++) {
 objArray[index] = objArray[index+1];
 }
 objArray[index] = null;
 elementCount--;
 }
 /**
  * removes the given element from this collection 
  * 
  * @param obj element that to be removed
  * @return returns true if remove else false 
  */
 public boolean remove(Object obj) {
 if(obj == null) {
 for(int index=0; index<size(); index++) {
 if(obj == objArray[index]) {
 remove(index);
 return true; 
 }
 }
 }else {
 for(int index=0; index<size(); index++) {
 if(obj.equals(objArray[index])) {
 remove(index);
 return true;
 }
 }
 }
 return false; 
 }
 /**
  * inserts the given element at the given index position
  * 
  * @param obj element to be inserted
  * @param index index at which element to be inserted
  * @throws IndexOutOfBoundsException if the given index not found
  */
 public void add(Object obj, int index) {
 checkIndex(index);
 if(size() == capacity()) 
 grow();
 for(int i=size()-1; i>=index; i--) {
 objArray[i+1] = objArray[i];
 }
 objArray[index] = obj;
 elementCount++;
 }
 /**
  * replaces the given index element with given object in this collection
  * 
  * @param index index to be replaced
  * @param obj new object to be stored
  * @throws IndexOutOfBoundsException if the given index not found
  */
 public void set(int index, Object obj) {
 checkIndex(index);
 objArray[index] = obj;
 }
 /**
  * checks the given index available or not
  * here index must be with in 0 to size
  * 
  * @param index index to check
  * @throws IndexOutOfBoundsException if the given index not found
  */
 private void checkIndex(int index) {
 if(index<0 || index>=size())
 throw new IndexOutOfBoundsException(index);
 }
 //String conversion
 /**
     * Returns a string representation of this collection.  The string
     * representation consists of a list of the collection's elements in the
     * order they are stored, enclosed in square brackets
     * ({@code "[]"}).  Adjacent elements are separated by the characters
     * {@code ", "} (comma and space).  Elements are converted to strings as
     * by {@link String#valueOf(Object)}.
     *
     * @return a string representation of this collection
     */
 @Override
 public String toString() {
 if(size() == 0) {
 return "[]";
 }
 StringBuilder sb = new StringBuilder();
 sb.append("[");
 for(int i=0; i<size(); i++) {
 sb.append(objArray[i]);
 sb.append(", ");
 }
 int start  = sb.lastIndexOf(", ");
 int end  = start + 2;  
 sb.delete(start, end);
 sb.append("]");
 return sb.toString();
 }
}
package com.nit.hk.customcollections;
public class Test {
 public static void main(String[] args) {
 //I want to store multiple values or multiple objects 
 //without type and size limitation
 NITCollection col = new NITCollection();
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 col.add("a"); System.out.println(col);
 col.add("b"); System.out.println(col);
 col.add(5); System.out.println(col);
 col.add(6.7); System.out.println(col);
 col.add('p'); System.out.println(col);
 col.add(true); System.out.println(col);
 col.add("a"); System.out.println(col);
 col.add(5); System.out.println(col);
 col.add(6.7); System.out.println(col);
 col.add(true); System.out.println(col);
 col.add(11); System.out.println(col);
 col.add(new A(5, 6)); System.out.println(col);
 col.add(null); System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 System.out.println(col.contains("a"));
 System.out.println(col.contains(true));
 System.out.println(col.contains(null));
 System.out.println(col.contains("A")); 
 System.out.println(col.contains(new A(5, 6)));
 System.out.println();
 System.out.println(col.indexOf("a"));
 System.out.println(col.indexOf(5));
 System.out.println(col.indexOf(null));
 System.out.println(col.indexOf(new A(5, 6)));
 int index = col.indexOf('p');
 System.out.println(index);
 System.out.println(col.indexOf("A"));
 System.out.println(col.lastIndexOf("a"));
 System.out.println(col.lastIndexOf(5));
 System.out.println();
 index  = col.indexOf(new A(5, 6));
 A a  = (A)col.get(index);
 System.out.println(a.getX());
 System.out.println(a.getY());
 a.setX(10);
 a.setY(20);
 System.out.println(a.getX());
 System.out.println(a.getY());
 System.out.println(col);
 System.out.println(col.get(4));
 //System.out.println(col.get(-4));
 //System.out.println(col.get(15));
 System.out.println();
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println(col);
 col.remove(3); 
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 col.remove(5); 
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 col.remove((Integer)5); 
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 col.remove(6.7); 
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 //col.remove('p'); 
 col.remove((Character)'p'); 
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 col.remove(new A(10, 20)); 
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 col.add("c", 3);
 col.add("d", 3);
 col.add("e", 3);
 col.add("f", 3);
 col.add("g", 3);
 col.add("i", 3);
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 col.set(3, "W");
 System.out.println(col);
 System.out.println(col.size());
 System.out.println(col.capacity());
 System.out.println();
 }
}