package ISBT;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {


	@FXML
	Label label1One;
	@FXML
	VBox vBox;
	@FXML
	Button buttonb1;
	@FXML
	Button buttonb2;
	@FXML
	Button buttonb3;
	@FXML
	Button buttonb4;


	@Override
	public void initialize(URL location, ResourceBundle resources) {

		label1One.setText(Controller.myChoice);

		buttonb1.setOnAction(event -> {booked();});
		buttonb2.setOnAction(event -> {booked();});
		buttonb3.setOnAction(event -> {booked();});
		buttonb4.setOnAction(event -> {booked();});


	}

	private void booked() {
		Alert alert=new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Ticket Booked");
		alert.setHeaderText("Ticket Successfully Booked");
		alert.setContentText("Ticket booked "+Controller.myChoice+"\n Happy Journey :-)");

		ButtonType reset=new ButtonType("New Booking");
		ButtonType exit=new ButtonType("exit");
		alert.getButtonTypes().setAll(reset,exit);

		Optional<ButtonType> clickedBtn=alert.showAndWait();
		if (clickedBtn.get()==reset && clickedBtn.isPresent()){
			Main mn = new Main();
			try {
				mn.start(Main.classStage);
				Second.classStage1.hide();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.exit(2);
		}
	}

}

