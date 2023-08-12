package cpa20;
import java.util.Scanner;
public class FlowerManagement {
	static int x;
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 x = sc.nextInt();
	 Flower[] flower = new Flower[x];
	 for (int i = 0; i < flower.length; i++) {
	  int flowerid = sc.nextInt(); sc.nextLine();
	  String flowerName = sc.nextLine();
	  int price = sc.nextInt();
	  int rating = sc.nextInt(); sc.nextLine();
	  String type = sc.nextLine();
		 flower[i] = new Flower(flowerid, flowerName, price, rating, type);	
	 }
	 Flower res = findMinPriceByType(flower,sc.nextLine());sc.close();
	 if(res!=null)System.out.println(res.getFlowerID()); 
	 else System.out.println("There is no flower with gieven type");
   }
private static Flower findMinPriceByType(Flower[] flower, String type) {
    Flower temp  = null;
    int minprice = Integer.MAX_VALUE;
	for (Flower itr : flower) 
		if(itr.getType().equalsIgnoreCase(type) && itr.getPrice()<minprice && itr.getRating()>3) {
			temp  = itr;
			minprice = itr.getPrice();
		}
    return temp;
}
} 
class Flower{
	public Flower(int flowerid, String flowerName, int price, int rating, String type) {
		this.setFlowerID(flowerid);
		this.setFlowerName(flowerName);
		this.setPrice(price);
		this.setRating(rating);
		this.setType(type);
	}
	public int getFlowerID() {
		return flowerID;
	}
	public void setFlowerID(int flowerID) {
		this.flowerID = flowerID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private int flowerID,price, rating;
	private String flowerName, type;
    	
}