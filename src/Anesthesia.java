
public class Anesthesia implements Order{

	
	public void orderExecute(Patient p) {
		System.out.println("���븦 �ǽ��մϴ�.");
		p.getEffect(-10);
	}

	
	public void undo(Patient p) {
		System.out.println("���븦 �����մϴ�.");
		p.getEffect(3);
	}

}
