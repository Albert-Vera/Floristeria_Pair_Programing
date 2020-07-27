package Floristeria.Model;


public class Floristeria {
    private String nom, adress, phone;
    
    public Floristeria() {
    }
    
    public Floristeria(String nom, String adress, String phone) {
		super();
		this.nom = nom;
		this.adress = adress;
		this.phone = phone;
	}

	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
