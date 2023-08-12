package com.For.Loop;

import java.util.Scanner;

public class Nested_for_loop {

	public static void main(String[] args) {
		Scanner scanOf = new Scanner(System.in);
		System.out.println("Enter n number");
		int n = scanOf.nextInt();
		int count = 0;
		// Test01
		/*
		 * for (int i = 1; i <=n; i++) { if(n%i==0) { count++; } } if(count==2) {
		 * System.out.println(n+" is prime no "); }
		 */
		// Test02
		/*
		 * for (int i = 0; i <n; i++) { for (int j = 0; j < n; j++) {
		 * System.out.println(i+"\t"+j); } }
		 */
		// Test03
		/*
		 * for (int i = 0; i <n; i++) { for (int j = n; j >=i ; j--) {
		 * System.out.println(i+"\t"+j); } System.out.println("fist iteration"); }
		 */
		// Test04
		/*
		 * for (int i = 1; i<=n; i++) { for (int j =1; j <=10 ; j++) {
		 * System.out.print(i+"*"+j+"="+i*j+"\n"); System.out.print("\t"); } }
		 */
		// Test05
		/*
		 * for (int i = 1; i <=n; i++) { System.out.println(); for (int j = 1; j <=i ;
		 * j++) { System.out.print("\t"+j); } }
		 */
		// Test06
		/*
		 * for (int i = 1; i <=n; i++) {//main increment logic applied on both for (int
		 * j = 1; j <=n-i; j++) {//display spaces System.out.print(" "); } for (int k =
		 * 1; k <=i ; k++) {//now display values System.out.print(k); }
		 * System.out.println(); }
		 */
		// Test07
		/*
		 * for (int i =n; i>=1; i--) {//main increment logic applied on both for (int j
		 * = 1; j <=n-i; j++) {//display spaces System.out.print(" "); } for (int k = 1;
		 * k <=i ; k++) {//now display values System.out.print(k); }
		 * System.out.println(); }
		 */
		// Test08
		/*
		 * for (int i =n; i>=1; i--) {//main increment logic applied on both for (int j
		 * = 1; j <=n-i; j++) {//display spaces System.out.print(" "); } for (int k = 1;
		 * k <=i ; k++) {//now display values System.out.print(k); }
		 * System.out.println(); }
		 */
		/*
		 * for (int i =n; i>=1; i--) {//main increment logic applied on both for (int j
		 * = 1; j <=n-i; j++) {//display spaces System.out.print(" "); } for (int k = 1;
		 * k <=i ; k++) {//now display values System.out.print(k); }
		 * System.out.println(); }
		 */
		/*
		 * //for (int i =n; i>=1; i-- ) {//main increment logic applied on both for (int
		 * i =1; i<=n; i++ ) { for (int j = 1; j <=n-i; j++) {//display spaces
		 * System.out.print(" "); } //for (int k = 1; k <=i ; k++) {//now display values
		 * for (int k = 1; k <=i; k++) { System.out.print(i); } System.out.println(); }
		 */
		/*
		 * for (int i =1; i<=n; i++ ) { for (int k = 1; k <=10; k++) {
		 * System.out.print(i*k+"\t"); } System.out.println(); } var va=10;
		 * System.out.println(var);
		 * 
		 * for (int i = 1; i <=n; i++) { for (int j = 1; j <=10; j++) {
		 * System.out.print(i+"*"+j+"="+i*j+"\t"); System.out.println(); }
		 */
		scanOf.close();
	}
}
