package ISBT;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	@FXML
	ChoiceBox choiceBox;
	@FXML
	DatePicker datePicker;
	@FXML
	Button buttonOne;
	@FXML
	Label labelOne;
	@FXML
	Label labelTwo;
	@FXML
	Pane paneOne;
	@FXML
	Pane paneTwo;
	@FXML
	ChoiceBox choiceBoxTwo;

	public static String myChoice;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		addChoices();
		try {addBackground();} catch (FileNotFoundException e) {e.printStackTrace();}

		buttonOne.setOnAction(event -> {
			Second sc = new Second();
			try {
				getChoice();
				sc.start(Second.classStage1);
			} catch (Exception e) {
				e.printStackTrace();
			}

		});
	}

	private void getChoice() {

			choiceBox.getSelectionModel().getSelectedIndex();
			choiceBoxTwo.getSelectionModel().getSelectedIndex();
			myChoice="From "+ choiceBox.getValue() +" To "+
				choiceBoxTwo.getValue();
	}

	//url('file:C:/Users/x/Desktop/JAVA/ISBT/images.jpg')
	private void addBackground() throws FileNotFoundException {
		FileInputStream input = null;
		input = new FileInputStream("C:\\Users\\x\\Desktop\\JAVA\\ISBT\\logo.jpg");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		imageView.setX(400);
		imageView.setFitHeight(120);

		TranslateTransition tt=new TranslateTransition(Duration.seconds(6),imageView);
		tt.setByX(-700);
		tt.setCycleCount(200);
		tt.playFromStart();
		//tt.setAutoReverse(true);
		tt.play();
		paneTwo.getChildren().add(imageView);
	}

	private void addChoices() {
		choiceBox.setItems(FXCollections.observableArrayList(
				"Mumbai","Delhi","Gurgaon","Pune","Goa","Bhopal","Jammu","Kanpur")
		);
		//choiceBox.getSelectionModel().select(0);

		choiceBoxTwo.setItems(FXCollections.observableArrayList(
				"Mumbai","Delhi","Gurgaon","Pune","Goa","Bhopal","Jammu","Kanpur")
		);
		//choiceBoxTwo.getSelectionModel().select(0);
	}

	/*private void hideStage() throws IOException {
		Window stage = node.getScene().getWindow();
		stage.hide();
	}*/
}

