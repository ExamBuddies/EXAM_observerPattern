package homemade;

public class Archiver implements Observer{

	@Override
	public void update(String operation, String record) {
		System.out.println("The archiver says a " + " operation was performed on " + record);
	}
	
}
