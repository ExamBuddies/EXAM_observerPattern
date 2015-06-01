package homemade;

public class Boss implements Observer{

	@Override
	public void update(String operation, String record) {
		System.out.println("The boss says a " + " operation was performed on " + record);
	}
	
}
