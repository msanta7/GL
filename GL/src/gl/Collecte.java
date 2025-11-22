package gl;

import java.util.Date;

public class Collecte {
    private int idCollecte;
    private Date dateCollecte;
    private double quantite;
    
    public void effectuer() {
        System.out.println("Collecte effectuée");
    }
    
    public void valider() {
        System.out.println("Collecte validée");
    }
}