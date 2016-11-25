package org.Hotel.client.presentation.main;

import java.io.InputStream;
import java.util.ResourceBundle;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Mainexample extends Application{
    private Stage mainStage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root=(BorderPane)FXMLLoader.load(getClass().getResource("/userui/Usermainui.fxml"));
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
    public void init(Stage stage){
    	goto_Usermainui();
    }
    public void goto_Usermainui(){
    	try {
			replaceSceneContent("/userui/Usermainui.fxml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    private Initializable replaceSceneContent(String fxml) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		InputStream in = Mainexample.class.getResourceAsStream(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(Mainexample.class.getResource(fxml));
		
		AnchorPane page;
		try {
			page = (AnchorPane) loader.load(in);
		}finally {
			in.close();
		} 
		mainStage.centerOnScreen();
		Scene scene = new Scene(page);
		mainStage.setScene(scene);
		mainStage.sizeToScene();


		return (Initializable) loader.getController();
	}
}
