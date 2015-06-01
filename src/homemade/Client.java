package homemade;

public class Client implements Observer{

	@Override
	public void update(String operation, String record) {
		System.out.println("The client says a " + " operation was performed on " + record);
	}

}
