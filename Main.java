package ISBT;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    static Stage classStage = new Stage();
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("FXML.fxml"));

        GridPane rootNode =fxmlLoader.load();
        Scene scene=new Scene(rootNode);

        classStage=primaryStage;
        primaryStage.setScene(scene);
        primaryStage.setTitle("ISBT APP");
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

