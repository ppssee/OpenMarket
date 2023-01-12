package com.kh.jdbc.openmarket.run;

import com.kh.jdbc.openmarket.model.vo.Member;

public class OpenmarketRun {

	public static void main(String[] args) {
		Member member = null;
		
		end : 
		while(true) {      
			if(member == null) {
				while(true) {
					// 1. 로그인 -> 성공시 break;
					// 2. 회원가입
					// 3. 종료 break end; (switch문)
				}
			}
			{
			
			// 로그인 성공시 USER_ADMIN 칼럼값이 0이면 user, 1이면 admin
			// 로그아웃시 member값을 null로.
//			if(member.getMemberAdmin() == 0) {
//			// user페이지
//             end :			
//			   while(true){ 
//				1. 상품 목록()
//					- Product productBuy = Product 목록출력() , ProductDAO-productAllView() // 구매할물건번호, 개수 입력받고 product.set으로 수정후 product값 반환
//					- 물건개수보다 구매할개수가 크면 에러메세지 출력,
//					  Product productCount = ProductDAO - getProductCount(),  select로 물건번호와 물건개수를 가져옴
//					  run에서 선택한개수(productBuy)와 가져온개수(productCount)를 비교.
//                                       proudctBut <= productCount 성공			
//					  실패시 에러메세지 출력.
//					  
//					- int = 1.결제 or 2.장바구니 view로출력 int형으로 1,2 반환
//					- 1일시
//						
//						PaymentDAO - payment() 결제 ,
//						PaymentDAO - listInsert() 결제내역등록 
//						
//					 - 2일시 CartDAO-cartInsert()  
//						 
//				2. 장바구니()
//					- List<Cart> list =  Cart 목록출력, CartDAO- printAll() list에저장, AllView() list목록 출력
//			          int num = CartSelectMenu() , 1 2 3 선택.
//					  switch(num) {
//						case 1: 개별삭제, List<Int> choice로 그만 누를 때까지 번호를 계속 입력받음 
//			        			Run에서 choice.length만큼 반복하면서 choice.[i] 값을 넘김            
//								CartDAO()- deleteOneByCart(int choice)
//			                    리턴값 result로 삭제성공, 삭제실패 여부 Run에서 출력 
//			                    
//                      case 2: 전체삭제, deleteAllbyCart() , DELETE FROM CART 
//			            case 3: 결제하기, 
//			                     CartList들 전부가져와서 결제 목록 출력
//			                     DAO, 개별삭제와 같이 하나씩 UPDATE SET 과
//								 PaymentDAO - listInsert() 결제내역 등록
//				3. 로그아웃()
//					member=null;
//					
//			} else {        
//			// admin페이지
//				
				
		
			}
		}
	}
}
