package sec03.exam02;

//상품의 정보를 저장하기 위한 클래스
public class Product {
	private int pno; // productNumber
	private String name; // 이름
	private int price; // 가격
	private int stock; // 재고
	
	// Getter/Setter 자동 생성
	public int getPno() { return pno; }
	public void setPno(int pno) { this.pno = pno; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
	public int getStock() { return stock; }
	public void setStock(int stock) { this.stock = stock; }
}
