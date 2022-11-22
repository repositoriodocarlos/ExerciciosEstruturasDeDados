package model;

public class Order {
	
	public String OrderId;
	public String Customer;
	public String OrderPrice;
	public String Description;
	
	@Override
	public String toString() {
		return "Id:" + OrderId + ", Nome:" + Customer + ", OrderPrice: " + OrderPrice + ", Description: "
				+ Description;
	}
	
	public String generateOrderStringToStore() {
		return OrderId + ";" + Customer + ";" + OrderPrice + ";" + Description;
	}
}
