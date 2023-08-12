    class multithreaded_programing
    {
        public static void main(String args[])
        {
            Thread t = Thread.currentThread();
            System.out.println(t);//by default it return thread,df priority,threadname        
		      main();
		}
        public static void main(){
            Thread t = Thread.currentThread();
            System.out.println(t);        
        }
    }