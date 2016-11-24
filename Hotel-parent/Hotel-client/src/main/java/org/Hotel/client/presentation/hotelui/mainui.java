package org.Hotel.client.presentation.hotelui;

import org.Hotel.client.presentation.hotelui.hotelInfoui;
import org.Hotel.client.presentation.hotelui.orderui;
import org.Hotel.client.presentation.hotelui.roominfoui;
import org.Hotel.client.presentation.hotelui.updateui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class mainui extends Application {
	@Override
	public void start(final Stage primaryStage) {
	   	 primaryStage.setTitle("网上连锁酒店系统");
	   	 GridPane grid = new GridPane();
	   	 grid.setAlignment(Pos.CENTER);
	   	 grid.setHgap(19);
	   	 grid.setVgap(25);
	   	 grid.setPadding(new Insets(1, 1, 1, 1));
	   	 Label scenetitle = new Label("快速管理酒店");
	   	 scenetitle.setFont(Font.font(null, 40));
	   	 scenetitle.setAlignment(Pos.TOP_CENTER);
	   	 grid.add(scenetitle, 2, 0, 2, 1);
         
	   	 Label welcome = new Label("欢迎来到酒店管理系统");
	   	 grid.add(welcome, 2, 1, 2, 2);
	   	 welcome.setFont(Font.font(null, 25));
	   	 
	   	 Button roominfo = new Button("客房列表");
	   	 grid.add(roominfo, 0, 1);
	     roominfo.setPrefSize(200, 50);
	   	 
	   	 Button order = new Button("订单列表");
	   	 grid.add(order, 0, 2);
	   	 order.setPrefSize(200, 50);
	   	
	   	 Button update = new Button("入住信息更新");
	   	 grid.add(update, 0, 3);
	   	 update.setPrefSize(200, 50);
	   	 
	   	 Button hotelinfo = new Button("酒店基本信息维护");
	   	 grid.add(hotelinfo, 0, 4);
	   	 hotelinfo.setPrefSize(200, 50);
	   	 //监听事件
	   	 roominfo.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   roominfoui infoui=new roominfoui();
					 try {
						infoui.start(primaryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	   	 
	   	 order.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   orderui orderui1=new orderui();
					 try {
						orderui1.start(primaryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	   	 
	   	 update.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   updateui updateui1=new updateui();
					 try {
						updateui1.start(primaryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	   	 
	   	 hotelinfo.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				  hotelInfoui hotelinfo1=new hotelInfoui();
					 try {
						hotelinfo1.start(primaryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	   	 
	   	 Scene scene = new Scene(grid, 800, 600);
	   	 primaryStage.setScene(scene);
	     primaryStage.show();
    }
	public static void main(String[] args) {
        launch(args);
    }
}