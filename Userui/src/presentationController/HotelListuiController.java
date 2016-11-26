package presentationController;

import java.net.URL;
import java.util.ResourceBundle;

import Helper.UiswitchHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

public class HotelListuiController implements Initializable{
	@FXML
	private ChoiceBox SortChoicebox;
	
	@FXML
	private CheckBox ReservationCheckbox;
	
	@FXML
	private Button ReturnButton;
	
    
    
    @FXML
    private void ReturnButtonClicked(ActionEvent event){
        UiswitchHelper.getApplication().goto_Usermainui();
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
