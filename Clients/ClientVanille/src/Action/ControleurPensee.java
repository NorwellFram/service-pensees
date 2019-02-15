package Action;
import java.util.Iterator;
import java.util.List;

import Vue.VuePensee;
import accesseur.PenseeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import modele.Pensee;
import outils.Journal;

public class ControleurPensee {
	
	public ControleurPensee() {
		PenseeDAO penseeDAO = new PenseeDAO();
		List<Pensee> listePensees = penseeDAO.listerPensees();
		
		for(Iterator<Pensee> visiteur = listePensees.iterator(); visiteur.hasNext(); )
		{
			Pensee pensee = visiteur.next();		
			Journal.ecrire(5, pensee.getMessage() + "(" + pensee.getAuteur() + ")");
		}
	}

	
	
	@FXML protected void enregistrer(ActionEvent evenement) {
    	
    	System.out.println("enregistrer( )");
    	
    	// Singleton obligatoire car le framework de JavaFX cache l'instance
    	VuePensee.getInstance().ecrireUnMotDePasse("coucou");
    	VuePensee.getInstance().ecrireUnMessage("allo");
    }
	
}
