
public class Anesthesia implements Order{

	
	public void orderExecute(Patient p) {
		System.out.println("마취를 실시합니다.");
		p.getEffect(-10);
	}

	
	public void undo(Patient p) {
		System.out.println("마취를 해제합니다.");
		p.getEffect(3);
	}

}
