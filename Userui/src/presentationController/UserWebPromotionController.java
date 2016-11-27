package presentationController;
import java.net.URL;
import java.util.ResourceBundle;

import Helper.UiswitchHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UserWebPromotionController implements Initializable{
	@FXML
	private void CreditChargeClicked(ActionEvent event){
		UiswitchHelper.getApplication().goto_CreditChargeui();
	}
	@FXML
	private void AbnormalOrderDealClicked(ActionEvent event){
		UiswitchHelper.getApplication().goto_abnormalorderui();
	}
	@FXML
	private void WebPromotionClicked(ActionEvent event){
		UiswitchHelper.getApplication().goto_webdiscoutdatenui();
	}
	@FXML
	private void ReturnClicked(ActionEvent event){
		UiswitchHelper.getApplication().goto_Loginui();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
