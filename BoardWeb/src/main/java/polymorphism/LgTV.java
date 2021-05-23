package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("### LG TV ��ü ����");
	}

	@Override
	public void turnOn() {
		System.out.println("LG TV ���� ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LG TV ���� OFF");
		
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
		
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
		
	}
	
	

}
