package inheritance;

public class Bus implements Transport  {
 
	private String busNumber;
	private StringBuffer serviceNumber;
	
	public Bus()
	{
		busNumber="AP2451";
		serviceNumber=new StringBuffer("5925");
	}
	
	public void start()
	{
		// TODO Auto-generated method stub
		System.out.println("bus starts");
	}
	
   public void stop() 
   {
		// TODO Auto-generated method stub
		System.out.println("bus stops ");
	}

@Override
public String toString() {
	return "Bus [busNumber=" + busNumber + ", serviceNumber=" + serviceNumber + "]";
}


}


