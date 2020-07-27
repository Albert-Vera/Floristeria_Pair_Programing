package Gestio;


import Model.Floristeria;
import persistence.FloristeriaRepository;

public class FloristeriaController {

	private FloristeriaRepository repository = new FloristeriaRepository();
	
	public FloristeriaController() {
	
	}
	
	public void createFlorist(String name, String address, String phone) throws Exception {
		Floristeria florist = new Floristeria(name, address, phone);
		repository.setFlorist(florist);
		//System.out.println(""+florist.getNom()+ " | "+ florist.getAdress()+ " | " +florist.getPhone());
	}

}
