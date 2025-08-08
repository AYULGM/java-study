package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {
	// Product가 저장된 List 컬렉션
	private List<Product> list = new ArrayList<Product>();
	// 키보드 입력 Scanner 생성
	private Scanner sc = new Scanner(System.in);
	private int counter; // 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	
	public void showMenu() {
		while (true) {
			System.out.println("--------------------------------");
			System.out.println("1.등록  |  2.목록   |  3.종료");
			System.out.println("--------------------------------");
			
			System.out.print("선택: ");
			String selectNo = sc.nextLine();
			switch (selectNo) {
				case "1": 
					// Product 등록
					registerProduct();
					break;
				case "2": 
					// 등록된 모든 Product 정보 보기
					showProducts();
					break;
				case "3": 
					// 프로그램 종료
					return;
			}
		}
	}
	
	
	public void registerProduct() {
		
		// Quiz
		
		try { // 예외 때문에 프로그램이 멈추는게 싫다면 try-catch문
			Product product = new Product(); // 기본생성자만 주어졌으니까 객체 생성
			
			// 상품 번호는 1부터
			product.setPno(++counter);
			
			System.out.print("상품명: ");
			product.setName(sc.nextLine());
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(sc.nextLine()));
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(sc.nextLine()));
			
			list.add(product); // list에 product를 저장한다.
		} catch (Exception e) {
			e.printStackTrace(); // 개발자용 디버깅용 메시지
			System.out.println("----------------");
			System.out.println("등록 에러 메세지: " + e.getMessage()); // 사용자를 위한 간단한 메시지
		} 
	}
	
	public void showProducts() {
		for (Product p : list) {
			System.out.println(p.getPno() + "번\t" + p.getName() + "\t" + p.getPrice() + "원\t" + p.getStock() + "개");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
