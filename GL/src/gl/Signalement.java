package gl;

import java.util.Date;

public class Signalement {
    private int idSignalement;
    private Date dateSignalement;
    private String etat;
    private String adresse;
    private String description;
    private String photo;
    
    public void creer() {
        System.out.println("Signalement créé");
    }
    
    public void modifierEtat() {
        System.out.println("État du signalement modifié");
    }
    
    public void suivre() {
        System.out.println("Suivi du signalement");
    }
}
