package gl;

import java.util.Date;

public class Intervention {
    private String idIntervention;
    private Date datePlanifier;
    private Date dateRealisation;
    private String statut;
    
    public void planifier() {
        System.out.println("Intervention planifiée");
    }
}