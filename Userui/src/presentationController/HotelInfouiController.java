package presentationController;

import java.net.URL;
import java.util.ResourceBundle;

import Helper.UiswitchHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HotelInfouiController implements Initializable{
	@FXML
	private Button ReturnButton;
	
	@FXML
	private void ReturnButtonClicked(ActionEvent event){
		UiswitchHelper.getApplication().goto_HotelMainui();
	}
	@FXML
	private void ReturnClicked(ActionEvent event){
//		Parent root = FXMLLoader.load(getClass().getResource("mainui.fxml"));
		
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
