
public class TransPlant implements Order{

	
	public void orderExecute(Patient p) {
		System.out.println("��� �̽��� �����մϴ�.");
		p.getEffect(-25);
	}

	
	public void undo(Patient p) {
		System.out.println("����̽� �� ó���� �մϴ�/ ");
		p.getEffect(-10);
	}

}
