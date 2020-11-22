package application;
	
import javafx.application.Application;
import javax.swing.JOptionPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);

		
        String name = JOptionPane.showInputDialog("Enter first Name");
        String carbon = "Hello" + name + "\n";
        carbon = carbon + "The total monthly power usage for a building is: 3000" + "\n";
        carbon = carbon + "The total yearly power usage for a building is: 36000" + "\n";
        carbon = carbon + "\n";
        carbon = carbon + "The average distance traveled: 1000" + "\n";
        carbon = carbon + "The average miles per gallon: 27" + "\n";
        carbon = carbon + "The total carbon emmisions in miles per year: 270000" + "\n";
        carbon = carbon + "\n";
        carbon = carbon + "The average distance traveled for a bicycle is: 3000 miles" + "\n";
        carbon = carbon + "The average carbon emmision is : 120000 pounds per year" + "\n";
        carbon = carbon + "\n";
                  
             
        JOptionPane.showMessageDialog(null, carbon, "Display Message",
            		 JOptionPane.INFORMATION_MESSAGE);
	
	}
}
