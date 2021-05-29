package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LogAdvice {
	
	/**
	 * XML�� �� ��
	 */
//	public void printLog(Joinpoint jp) {
//		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
//	}
	
	@Before("PointcutCommon.allPointCut()")
	public void printLog() {
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����");
	}
	
	
}
