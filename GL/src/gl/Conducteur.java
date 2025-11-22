package gl;

public class Conducteur extends Utilisateur {
    private int camionId;
    
    public void mettreAJourEtat() {
        System.out.println("Mise à jour de l'état du signalement");
    }
    
    public void consulterSignalements() {
        System.out.println("Consultation des signalements");
    }
    
    public void planifierIntervention() {
        System.out.println("Intervention planifiée");
    }
}