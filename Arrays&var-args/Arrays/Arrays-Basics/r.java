class  r{
	public static void main(String[] args) {
		StringBuilder sv = new StringBuilder();
		sv.append("aaa").insert(1,"bb").insert(5,"ccc");
		System.out.println(sv.length());
		System.out.println(sv);
	}
}
