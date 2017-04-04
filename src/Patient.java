
public class Patient {
	private boolean isDead;
	private int vital;

	public Patient(int vital) {
		isDead = false;
		this.vital = vital;
	}

	public boolean getEffect(int vital) {
		this.vital += vital;
		if (vitalTest())
			return true;
		return false;
	}

	public boolean vitalTest() {
		if (vital < 30) {
			isDead = true;
			return true;
		}
		return false;
	}

	public boolean isDead() {
		return isDead;
	}
	public int getVital(){
		return vital;		
	}
}
