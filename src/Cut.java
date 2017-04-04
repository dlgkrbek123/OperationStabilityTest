
public class Cut implements Order{

	
	public void orderExecute(Patient p) {
		System.out.println("개복을 위한 절단을 수행합니다");
		p.getEffect(-7);
		
	}

	public void undo(Patient p) {
		System.out.println("열린 복부를 봉합합니다. ");
		p.getEffect(-2);
		
	}

}
