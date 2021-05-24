package com.springbook.biz;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardVO;
import com.springbook.biz.user.impl.UserService;
import com.springbook.biz.user.impl.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너를 구동한다
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 UserServiceImpl 객체를 Look Up 한다.
		UserService userService = (UserService)container.getBean("userService");
		
		// 3. 로그인 테스트
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + " 님 환영합니다.");
		}else {
			System.out.println("로그인 실패!!");
		}
		
		// 5. Spring 컨테이너 종료
		container.close();

	}

}
