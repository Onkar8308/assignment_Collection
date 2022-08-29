package assignment_4_C_C;

public class IceCreamParlor implements Comparable<IceCreamParlor> {
	private int price;
	private String name;
	private double rating;
	
	
	//generating getters to accessing the private data
	public int getPrice() {
		return price;
}
	public String getName() {
		return name;
	}
	
	public double getRating() {
		return rating;
	}
	
	//creating parameterized constructor to initialize data 
	public IceCreamParlor(String name, int price, double rating) {
		super();
		this.price = price;
		this.name = name;
		this.rating = rating;
	}
	@Override
	public int compareTo(IceCreamParlor o) {
		// TODO Auto-generated method stub
		return this.price - o.price;
	}
}