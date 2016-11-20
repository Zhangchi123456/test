package org.Hotel.client.presentation.reservationui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Clientcreditrecordui extends Application {
	public void start(final Stage primaryStage) throws Exception {
		BorderPane pane=new BorderPane();
		pane.setPrefHeight(600);
		pane.setPrefWidth(800);
		HBox topline=new HBox();
		pane.setTop(topline);
        HBox bottomline=new HBox();
        bottomline.setPrefSize(800, 100);
        bottomline.setPadding(new Insets(20, 30, 30, 10));
	    bottomline.setSpacing(500);
		bottomline.setAlignment(Pos.BASELINE_RIGHT);
		
		
        Label label1=new Label("信用记录");
        label1.setFont(Font.font(40));
        topline.setAlignment(Pos.TOP_CENTER);
        topline.setPrefSize(800, 120);
        topline.setPadding(new Insets(20, 30, 30, 10));
        topline.getChildren().add(label1);
        
        TableView table=new TableView();
        TableColumn timeco=new TableColumn("时间");
       timeco.setPrefWidth(160);
        TableColumn ordernumberco=new TableColumn("订单号");
        ordernumberco.setPrefWidth(160);
        TableColumn actco=new TableColumn("动作");
        actco.setPrefWidth(160);
        TableColumn changevalueco=new TableColumn("信用值变化");
        changevalueco.setPrefWidth(160);
        TableColumn finalvalueco=new TableColumn("信用累计值");
       finalvalueco.setPrefWidth(160);
        table.getColumns().addAll(timeco,ordernumberco,actco,changevalueco,finalvalueco);
        table.setPadding(new Insets(0, 0, 0, 0));
        
		pane.setCenter(table);
		
		Button returnb=new Button("返回");
		returnb.setPrefSize(80, 40);
		returnb.setFont(Font.font(20));
		returnb.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   Clientmainui mainui=new Clientmainui();
					 try {
						mainui.start(primaryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
		
		bottomline.getChildren().add(returnb);
		pane.setBottom(bottomline);
	
		
		Scene scnen = new Scene(pane); 
        primaryStage.setScene(scnen); 
		primaryStage.show();
		
	}
	public static void main(String[] args){  
        Application.launch(args);  
    }  

}