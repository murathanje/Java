
public class CustomerManager {

	private BaseLogger logger;
	
	public CustomerManager(BaseLogger _logger){
		this.logger = _logger;
	}
	
	
	public void add() {
		
		System.out.println("Musteri eklendi.");
		this.logger.log("Log Mesaji");
		
	}

}

