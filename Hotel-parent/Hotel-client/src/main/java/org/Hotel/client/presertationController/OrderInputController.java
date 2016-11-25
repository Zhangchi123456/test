package org.Hotel.client.presertationController;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;

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
    private TextField TiemEnd;
    @FXML
    private ChoiceBox RoomType;
    @FXML
    private ChoiceBox Child;
    @FXML
    private Button Sure;
    @FXML
    private Button Return;
	@Override
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	

}
