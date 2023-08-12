class  recur{

	static int recur(int x,int y){
    if(x==0)return y;
	else return recur(x-1,x+y);
	}
	public static void main(String[] args) 
	{
		System.out.println(recur(9,7));
	}
}
/*
0,53 ---> return 52;
1,52
2,51
3,49
4,46
5,42
6,37
7,31
8,24
9,16
*/