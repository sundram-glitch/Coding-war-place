class Test {
	public static void main(String[] args)throws Exception{
	StackByArrays st = new StackByArrays(5);
    for (int i =1;i<6 ;i++ )    
	st.push(i*5);
		System.out.println("topOfStack "+st.topOfStack);
    /*for (int i=0;i<5 ;i++ )
	st.pop();*/
	    System.out.println("topOfStack "+st.topOfStack);
	System.out.println("isEmptyStack "+st.isEmptyStack());
	System.out.println("isFullStack "+st.isFullStack());
	st.peekOperation();
	st.deleteStack();
	st.peekOperation();
	}
}
