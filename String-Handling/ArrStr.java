class  ArrStr{
	public static void main(String[] args) {
		String str="how.much.money.you.want.?";
		String strArr[] = str.split(".");
		for(int i=0; i<str.length(); i++)
		System.out.println(strArr[i]);
}
}
