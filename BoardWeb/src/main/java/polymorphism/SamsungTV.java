package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("### 객체 초기화 작업 처리");
	}
	
	public SamsungTV() {
		System.out.println("### Samsung TV 객체 생성(1)");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("### Samsung TV 객체 생성(2)");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("### Samsung TV 객체 생성(3)");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void destroyMethod() {
		System.out.println("### 객체 삭제 전에 작업 처리");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("### setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("### setPrice() 호출");
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println("삼성TV 전원 키기 == 가격 : " + price);
		
	}

	@Override
	public void turnOff() {
		System.out.println("삼성TV 전원 끄기");
		
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
