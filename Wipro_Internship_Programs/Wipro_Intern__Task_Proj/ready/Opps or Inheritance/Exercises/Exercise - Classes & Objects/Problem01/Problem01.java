package com.wipro.org.cls;
import java.util.Scanner;
public class Box01 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  private int width, height, depth;
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Box01 call = new Box01(sc.nextInt(), sc.nextInt(), sc.nextInt());
     System.out.println(call.volume());
  }
  public Box01(int width, int height ,int depth) {
	  this.width = width;
	  this.height = height;
	  this.depth = depth;
  }
  public int volume() {
	  return this.width*this.height*this.depth;
  }
}
