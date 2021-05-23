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
		System.out.println("### LG TV 객체 생성");
	}

	@Override
	public void turnOn() {
		System.out.println("LG TV 전원 ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("LG TV 전원 OFF");
		
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
