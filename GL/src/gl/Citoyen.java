package gl;

public class Citoyen extends Utilisateur {
    private String adresse;
    
    public void signaler() {
        System.out.println("Signalement créé");
    }
    
    public void suivreEtat() {
        System.out.println("Suivi de l'état des signalements");
    }

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}