package polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("### AppleSpeaker ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("### AppleSpeaker ���� UP!!");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("### AppleSpeaker ���� DOWN!!");
		
	}
	
	

}
