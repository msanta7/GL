package gl;

public class GestionDechets {
    public static void main(String[] args) {
        
        Citoyen citoyen = new Citoyen();
        citoyen.nom = "Jean Dupont";
        citoyen.setAdresse("123 Rue Example");
        citoyen.connecter();
        citoyen.signaler();
        
        Conducteur conducteur = new Conducteur();
        conducteur.consulterSignalements();
        conducteur.planifierIntervention();
        
        AgentTri agentTri = new AgentTri();
        agentTri.trierDechets();
        agentTri.genererRapportTri();
        
        Administrateur admin = new Administrateur();
        admin.gererUtilisateurs();
        admin.genererRapports();
    }
}
