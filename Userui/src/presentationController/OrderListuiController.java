package presentationController;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import Helper.UiswitchHelper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderListuiController implements Initializable {
    @FXML
    private TableView OrderList;
    @FXML
    private Button ConfirmButton,ReturnButton;
   
    @FXML
    private ChoiceBox OrderStation;
    
    
    @FXML
	  private void  ReturnButtonClicked(ActionEvent event){
		  UiswitchHelper.getApplication().goto_Usermainui();
		  
	  }
	  //关闭
	  @FXML
		private void ConfirmButtonClicked(ActionEvent event){
			
			
		}
   
	@Override
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}