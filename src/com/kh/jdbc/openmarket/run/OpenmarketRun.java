package com.kh.jdbc.openmarket.run;

import com.kh.jdbc.openmarket.model.vo.Member;

public class OpenmarketRun {

	public static void main(String[] args) {
		Member member = null;
		
		while(true) {      
			if(member == null) {
				while(true) {
					// 1. 로그인 -> 성공시 break;
					// 2. 회원가입
				}
			}
			
			// 로그인 성공시 USER_ADMIN 칼럼값이 0이면 user, 1이면 admin
			// 로그아웃시 member값을 null로.
			if(member.getMemberAdmin() == 0) {
			// user페이지
				
				
				
			} else {        
			// admin페이지
				
				
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
