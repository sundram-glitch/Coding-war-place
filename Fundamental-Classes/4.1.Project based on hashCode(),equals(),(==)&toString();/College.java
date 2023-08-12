package com.nit.hk.user;
import java.util.Scanner;
import com.nit.hk.pojo.Student;
public class College{
 public static void main(String[] args) {
 Scanner scn = new Scanner(System.in);
 System.out.println("Enter student1 details");
 Student s1 = new Student();
 System.out.print("  Enter sno\t: ");
 s1.setSno(scn.nextInt()); scn.nextLine();
 System.out.print("  Enter sname\t: ");
 s1.setSname(scn.nextLine()); 
 System.out.print("  Enter course\t: ");
 s1.setCourse(scn.nextLine()); 
 System.out.print("  Enter fee\t: ");
 s1.setFee(scn.nextDouble()); scn.nextLine(); 
 System.out.println("\nEnter student2 details");
 Student s2 = new Student();
 System.out.print("  Enter sno\t: ");
 s2.setSno(scn.nextInt()); scn.nextLine();
 System.out.print("  Enter sname\t: ");
 s2.setSname(scn.nextLine()); 
 System.out.print("  Enter course\t: ");
 s2.setCourse(scn.nextLine()); 
 System.out.print("  Enter fee\t: ");
 s2.setFee(scn.nextDouble()); scn.nextLine(); 
 System.out.println("s1 and s2 objects details ");
 System.out.println(s1);
 System.out.println(s2);
 System.out.println("\n=====================================================");
 if(s1.hashCode() == s2.hashCode()) {
 System.out.println("both students are belongs to same bucket/grooup");
 }else {
 System.out.println("both students are belongs to diff bucket/grooup");
 }
 if(s1.equals(s2)) {
 System.out.println("both students are equal(duplicates)");
 }else {
 System.out.println("both students are not equal(unique)");
 }
 System.out.println("=======================================================");
 }
}//javac -d . College.java
//java  com.nit.hk.user.College