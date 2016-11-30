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
import javafx.scene.control.TextField;

public class OrderInputController implements Initializable {
	
    @FXML
    private TextField UserName;
    @FXML
    private TextField UserNum;
    @FXML
    private TextField Telephone;
    
    @FXML
    private TextField TimeBegin;
    @FXML
    private TextField TimeEnd;
    @FXML
    private ChoiceBox RoomType;
    @FXML
    private ChoiceBox Child;
    @FXML
    private Button Sure;
    @FXML
    private Button ReturnButton;
	
	  @FXML
	  private void  ReturnButtonClicked(ActionEvent event){
		  UiswitchHelper.getApplication().goto_HotelListui();
		
	  }
	  //鍏抽棴
	  @FXML
		public void close(ActionEvent event){
			
			
		}
	  //纭畾鐩戝惉
	  @FXML
       private void  sur(ActionEvent event){
		  String username = UserName.getText().trim();
		  String usernum = UserNum.getText().trim();
		  String telephone = Telephone.getText().trim();
		
		  String timebegin = TimeBegin.getText().trim();
		  String timeend = TimeEnd.getText().trim();
		  
		  
	  }
	  @FXML
		private void RoomTypeChoiceClicked(ActionEvent event){
			ObservableList T=FXCollections.observableArrayList("澶у簥鎴�","鏍囧噯闂�","瀹跺涵鎴�","濂楁埧");
			RoomType.setItems(T);
			
		}
	  @FXML
		private void HaveChildClicked(ActionEvent event){
			ObservableList T=FXCollections.observableArrayList("鏈�","鏃�");
			Child.setItems(T);
			
		}
	  
	 
     @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	

}
