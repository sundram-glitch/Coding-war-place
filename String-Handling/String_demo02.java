 class String_demo02 
    {
        public static void main(String args[])
        {
            char chars[] = {'a', 'b', 'c'};
            String s = new String(chars);
            String s1 = "abc";
            int len1 = s1.length();
            int len2 = s.length();
            System.out.println(s+"\t"+s1+"\t"+java.util.Arrays.toString(chars));
            System.out.println(len1 + "\t" + len2+"\t"+chars.length);
        }
   }