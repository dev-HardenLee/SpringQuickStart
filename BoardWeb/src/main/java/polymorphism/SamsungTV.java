package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public void initMethod() {
		System.out.println("### ��ü �ʱ�ȭ �۾� ó��");
	}
	
	public SamsungTV() {
		System.out.println("### Samsung TV ��ü ����(1)");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("### Samsung TV ��ü ����(2)");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("### Samsung TV ��ü ����(3)");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void destroyMethod() {
		System.out.println("### ��ü ���� ���� �۾� ó��");
	}

	public void setSpeaker(Speaker speaker) {
		System.out.println("### setSpeaker() ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("### setPrice() ȣ��");
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println("�ＺTV ���� Ű�� == ���� : " + price);
		
	}

	@Override
	public void turnOff() {
		System.out.println("�ＺTV ���� ����");
		
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
