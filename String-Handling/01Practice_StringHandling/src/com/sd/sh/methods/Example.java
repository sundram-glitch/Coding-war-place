package com.sd.sh.methods;

public class Example {
    private int x;
    public Example(int x) {
    	this.x=x;
    }
	public Example() {
	}
	public static void main(String[] args) {
		String s33="hari,balayya,pawankalayan";
        String[] s34=s33.split(",");
        System.out.println(s34.length);
        System.out.println(s34[1]+" "+s34[1].length());
        System.out.println(java.util.Arrays.toString(s34));
	    System.out.println();
	}
	@Override
	public String toString() {
		//return " "+x;
		//return String.valueOf(x);
		return Integer.toString(x);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.x;
	}
    
}
