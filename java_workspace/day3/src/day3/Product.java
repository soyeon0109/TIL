package day3;

//정보 저장 클래스 -private 변수 / public setter/getter 메소드
class Product {
	private int code;
	private String productName;
	private double price;
	private int balance;//상품 재고
	
	//source -> generate getter setter
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
