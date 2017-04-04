
public class Surgeon {

	
	private Patient patient; 
	
	public Surgeon(Patient patient){
		this.patient=patient;
	}
	
	public void operate(Order o){
		o.orderExecute(patient);
	}
	
	public void rollBack(Order o){
		o.undo(patient);
	}
}
