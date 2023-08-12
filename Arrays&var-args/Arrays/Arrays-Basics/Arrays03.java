class  Arrays03{
	public static void main(String[] args){
		int[] a=new int[10];
		//int[] b=new int[10];
		int []b={1,2,3,4,5,6,7,8,9,0,0};
		//b[0]=1;
		for(int i:b)
			if(i==b.length)
        System.out.println("b[("+i+"-1):"+(i-2)+"]:"+b[i-2]);
		else
		System.out.println("b[("+i+"-1):"+(i-1)+"]:"+b[i-1]);
		for (int i=0;i<10;i++)
		{
		a[i]=i*i;	
	System.out.println("a["+i+"]:"+a[i]);
		}
	}
}