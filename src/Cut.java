
public class Cut implements Order{

	
	public void orderExecute(Patient p) {
		System.out.println("������ ���� ������ �����մϴ�");
		p.getEffect(-7);
		
	}

	public void undo(Patient p) {
		System.out.println("���� ���θ� �����մϴ�. ");
		p.getEffect(-2);
		
	}

}
