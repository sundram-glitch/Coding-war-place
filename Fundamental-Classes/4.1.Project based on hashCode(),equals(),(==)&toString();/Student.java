/*Sample project on hashCode(), equals() and toString() methods
=========================================
Develop student class to group student objects
by their course name and compare Student objects 
by using course and sno. 
When object is displayed display state of this object.
 procedure
  1) create a class Student
  2) declare student properties
  3) generate setter and getter methods
  4) override hashCode() method by returning course
  5) override equals() method by comparing course and sno
  6) override toString() method by return all properties
  7) define main method class to test all above implementation*/
package com.nit.hk.pojo;
public class Student{
 private int sno;
 private String sname;
 private String course;
 private double fee;
 public Student() { }
 public int getSno() {
 return sno;
 }
 public void setSno(int sno) {
 this.sno = sno;
 }
 public String getSname() {
 return sname;
 }
 public void setSname(String sname) {
 this.sname = sname;
 }
 public String getCourse() {
 return course;
 }
 public void setCourse(String course) {
 this.course = course;
 }
 public double getFee() {
 return fee;
 }
 public void setFee(double fee) {
 this.fee = fee;
 }
 @Override
 public int hashCode() {
 return course.toUpperCase().hashCode(); 
 }
 @Override
 public boolean equals(Object obj) {
 if(obj instanceof Student) {
 Student s = (Student)obj;
 return this.course.equalsIgnoreCase(s.course)
 && this.sno == s.sno;
 }
 return false;
 }
 @Override
 public String toString() {
 return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
 }
}//javac -d . Student.java