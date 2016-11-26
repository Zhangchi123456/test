package presentationController;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class OrderListController implements Initializable {
    @FXML
    private TableView OrderList;
    @FXML
    private Button Sure;
    @FXML
    private Button Return;
    @FXML
    private ChoiceBox OrderStation;
    
    @FXML
	private void OrderTypeChoiceClicked(ActionEvent event){
		ObservableList T=FXCollections.observableArrayList("宸叉墽琛�","鏈墽琛�","璁㈠崟寮傚父","鎵�鏈夎鍗�");
		OrderStation.setItems(T);
		
	}
    @FXML
	  private void  ret(ActionEvent event){
		  
		  close(null);
	  }
	  //鍏抽棴
	  @FXML
		public void close(ActionEvent event){
			
			
		}
     private void  sur(ActionEvent event){
		  
		  close(null);
	  }
   
	@Override
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}