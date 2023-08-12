class TestNITCollection {
	public static void main(String[] args) {
		NITCollection col=new NITCollection();
		System.out.println(col);
		col.add(3);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add("a");
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add("b");
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add("c");
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(5);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(45);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(10);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(87);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(90);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(21);
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());
		col.add(22);
		col.add(null);
		System.out.println(col.contains(null));
		System.out.println("Size:: "+col.size());
		System.out.println("Capacity::"+col.Capacity());

		System.out.println("8 contains ?:: "+col.contains(8));
		System.out.println("a contains ?:: "+col.contains("a"));
		System.out.println("a index no ?:: "+col.indexOf("a"));
		System.out.println("a contains ?:: "+col);
		System.out.println();
		System.out.println();
		System.out.println("a index no ?:: "+col.lastIndexOf("a"));
		System.out.println("a index no ?:: "+col.indexOf(22));
		}
}
