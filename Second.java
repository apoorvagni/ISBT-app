package ISBT;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Second extends Application {

	static Stage classStage1 = new Stage();
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("layout.fxml"));

		VBox rootNode =fxmlLoader.load();
		Scene scene=new Scene(rootNode);

		classStage1=primaryStage;
		primaryStage.setScene(scene);
		primaryStage.setTitle("ISBT APP");
		primaryStage.setResizable(false);
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}

