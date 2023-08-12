 class String_demo 
    {
        public static void main(String args[])
        {
            int ascii[] = {'a', 66, 67, 68};
            String s = new String(ascii, 0, 2);
			System.out.println(ascii[0]);
            System.out.println(s);
        }
   }