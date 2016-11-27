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

public class CreditChargeController implements Initializable{
    
	@FXML
	private TextField UserName;  //充值用户
	@FXML
	private TextField Money;     //充值数额
	@FXML
	private void SureClicked(ActionEvent event){
		UiswitchHelper.getApplication().goto_Registerui();;
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}