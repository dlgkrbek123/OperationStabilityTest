import java.util.Scanner;

public class TestStart {
	
	public static void printResult(boolean b, int c,int v){
		if(b)
			System.out.println("patient is dead remaning last"+c+"order");
		else
			System.out.println("patient is survive vital at"+v );
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		System.out.print("input vital of the patient: ");
		int vital=s.nextInt();
		LogQueue operation=new LogQueue();
		operation.insert(new Anesthesia());
		operation.insert(new Cut());
		operation.insert(new Cut());
		operation.insert(new TransPlant());
		int count=operation.getNumOfOrder()*2;
		int item=operation.getNumOfOrder();
		Patient patient=new Patient(vital);	
		Surgeon surgeon=new Surgeon(patient);
		s.nextLine();
		for(int i=0;i<item;i++){
			surgeon.operate(operation.getOrder(i));
			System.out.println("환자의 바이탈: "+patient.getVital());
			count--;
			s.nextLine();
			if(patient.isDead())
			{
				printResult(true,count,patient.getVital());
				return;
			}
		}	
		
		for(int i=item-1;i>=0;i--){
			surgeon.rollBack(operation.getOrder(i));
			System.out.println("환자의 바이탈: "+patient.getVital());
			count--;
			s.nextLine();			
			if(patient.isDead())
				break;	
			
		}
		
		printResult(patient.isDead(),count,patient.getVital());
	}
}
