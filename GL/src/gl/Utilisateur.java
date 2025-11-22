package gl;

public abstract class Utilisateur {
    protected int id;
    protected String nom;
    protected String telephone;
    
    public void connecter() {
        System.out.println("Utilisateur " + nom + " connecté");
    }
    
    public void deconnecter() {
        System.out.println("Utilisateur " + nom + " déconnecté");
    }
}
