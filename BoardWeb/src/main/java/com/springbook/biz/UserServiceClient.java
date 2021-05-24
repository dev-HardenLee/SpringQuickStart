package com.springbook.biz;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardVO;
import com.springbook.biz.user.impl.UserService;
import com.springbook.biz.user.impl.UserVO;

public class UserServiceClient {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� UserServiceImpl ��ü�� Look Up �Ѵ�.
		UserService userService = (UserService)container.getBean("userService");
		
		// 3. �α��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + " �� ȯ���մϴ�.");
		}else {
			System.out.println("�α��� ����!!");
		}
		
		// 5. Spring �����̳� ����
		container.close();

	}

}
