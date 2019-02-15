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
		System.out.println("new VueInspiration()");
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
	
	public void ecrireUnMessage(String message)
	{
		TextField champsMessage = (TextField) scene.lookup("#champsMessage");
		champsMessage.setText(message);		
	}
	
	public void ecrireUnMotDePasse(String motDePasse)
	{
		PasswordField champsMotdepasse = (PasswordField) scene.lookup("#champsMotdepasse");
		champsMotdepasse.setText(motDePasse);		
	}
	
}
