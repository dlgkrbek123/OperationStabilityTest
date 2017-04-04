
public class TransPlant implements Order{

	
	public void orderExecute(Patient p) {
		System.out.println("장기 이식을 수행합니다.");
		p.getEffect(-25);
	}

	
	public void undo(Patient p) {
		System.out.println("장기이식 후 처리를 합니다/ ");
		p.getEffect(-10);
	}

}
