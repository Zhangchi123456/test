package presentationController;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import Helper.UiswitchHelper;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class OrderEvaluateController  implements Initializable{
	    @FXML
	    private Label OrderId;
	    @FXML
	    private Label Hotel;
	    @FXML
	    private TextField Score;
	    
	    @FXML
	    private TextField EvaluateInfo;
	    @FXML
	    private Button Sure;
	    @FXML
	    private Button Return;
	  //返回监听
	  @FXML
	  private void  ReturnClicked(ActionEvent event){
		  UiswitchHelper.getApplication().goto_Usermainui();
		 
	  }
	  //关闭
	  @FXML
		public void SureClicked(ActionEvent event){
			
		  UiswitchHelper.getApplication().goto_Usermainui();
		}
	  //确定监听
	  @FXML
       private void  sur(ActionEvent event){
		  String score = Score.getText().trim();
		  String evaluateinfo = EvaluateInfo.getText().trim();
		  
		  
	  }
	    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
