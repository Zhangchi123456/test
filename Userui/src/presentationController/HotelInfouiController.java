package presentationController;

import java.net.URL;
import java.util.ResourceBundle;

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
	private Button ok,back;
	
	@FXML
	private ChoiceBox Startx;
	
	@FXML
	private TextField hotelNametx,Provincetx,detailAddresstx,introductiontx,Blocktx,Citytx;
	
	@FXML
	private Label hotelInfo,hotelName,Address,Province,City,Block,Star,introduction;
     
	@FXML
	private void StarChoiceBoxClicked(ActionEvent event){
		ObservableList T=FXCollections.observableArrayList("鏃�","涓�鏄熺骇","浜屾槦绾�","涓夋槦绾�","鍥涙槦绾�","浜旀槦绾�");
		Startx.setItems(T);
		
	}
	@FXML
	private void backButtonClicked(ActionEvent event){
//		Parent root = FXMLLoader.load(getClass().getResource("mainui.fxml"));
		
	}
	@FXML
	private void okButtonClicked(ActionEvent event){
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
