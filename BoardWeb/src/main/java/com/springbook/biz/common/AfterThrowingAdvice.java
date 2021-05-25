package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		System.out.println("[���� ó��] ����Ͻ� ���� ���� �� ���� �߻� " + method + "() �޼ҵ� ���� �� �߻��� ���� �޽��� : " + exceptObj.getMessage());
		
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�.");
		}else if(exceptObj instanceof NumberFormatException) {
			System.out.println("���� ������ ���� �ƴմϴ�.");
		}else if(exceptObj instanceof Exception) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}
		
	}

}
