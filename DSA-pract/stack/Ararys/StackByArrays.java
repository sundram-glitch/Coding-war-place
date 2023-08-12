class StackByArrays{
    int []arr; 
	int topOfStack;
	public StackByArrays(int size){
	   arr=new int[size];
	   topOfStack=-1;	
	System.out.println("Stack successfully created using arrays!!");
	}

	public void push(int value)throws ArrayIndexOutOfBoundsException{
	//if stack show exception arraysindexoutofboundException
	if(isFullStack())throw new ArrayIndexOutOfBoundsException("No space any more!!");
	else arr[topOfStack+1]=value;
    topOfStack++;
	}

	public  void pop()throws Exception{
    //if  stack empty throws stack underflow error
	if(isEmptyStack()) throw new Exception("Value might have not been initialized!!");
	else System.out.println("popping value into stack"+arr[topOfStack]+" ....");
	topOfStack--;
	}

	public boolean isEmptyStack(){
	//if top pointer is zero the stack is empty 
    if(topOfStack<0) return true;
	return false;
	}

	public boolean isFullStack(){
    return topOfStack+1==arr.length? true: false;
	}
   
    public void peekOperation(){
    if(!isEmptyStack())System.out.println("Top of Stack "+arr[topOfStack]);
	else System.out.println("Stack is empty");
	}

	public void deleteStack(){
     arr=null;
	 System.out.println("Stack deleted successfully");
	}
}
