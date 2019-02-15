package Vue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VuePensee extends Application {
	public VuePensee()
	{
		System.out.println("new VuePensée()");
		VuePensee.instance = this;	
	}
	protected static VuePensee instance = null;
	public static VuePensee getInstance() {return VuePensee.instance;};
	
	protected Scene scene = null;
	@Override
	public void start(Stage stade) throws Exception {
		Parent racine = FXMLLoader.load(getClass().getResource("inspiration-visuelle.fxml"));
		//Pane racine = new StackPane();
		scene = new Scene(racine, 800, 600);
		stade.setScene(scene);
		stade.show();
	}	
	
	public void ecrireUnePensee(String message)
	{
		TextField champsMessage = (TextField) scene.lookup("#penseeMsg");
		champsMessage.setText(message);		
	}
	
	public void ecrireUnAuteur(String auteur)
	{
		TextField champsMessage = (TextField) scene.lookup("#auteurMsg");
		champsMessage.setText(auteur);		
	}
	
	public void ecrireUneDate(String date)
	{
		TextField champsMessage = (TextField) scene.lookup("#dateMsg");
		champsMessage.setText(date);		
	}
	
}
