class InnerTryDemo{
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			System.out.println("a:"+a);
			try{
				int[] x = new int[a];
				System.out.println("Array size:"+x.length);
			}
			catch(NegativeArraySizeException nas){
				int[] x = new int[3];
				System.out.println("Array size:"+x.length);
			}
			int b = a+20;
			System.out.println("b:"+b);
		}
		catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println("Pass One int value");
		}
		catch(NumberFormatException nfe){
			System.out.println("pass only int value");
		System.out.println("end of main!");
	}
	}
}
