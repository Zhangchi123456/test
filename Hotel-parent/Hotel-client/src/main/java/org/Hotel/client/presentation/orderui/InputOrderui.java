package org.Hotel.client.presentation.orderui;
import org.Hotel.client.presentation.reservationui.Clientcreditrecordui;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class InputOrderui extends Application {

	public void start(Stage primaryStage) throws Exception {
		BorderPane pane=new BorderPane();
		
		pane.setPrefSize(800, 600);
		HBox topline=new HBox();
		FlowPane centerpane=new FlowPane();
		pane.setCenter(centerpane);
       
		topline.setAlignment(Pos.BOTTOM_LEFT);
		topline.setPadding(new Insets(20, 30, 30, 10));
		
		pane.setTop(topline);
		
		  Label userName = new Label("用户名 :");  
		  Label userNum = new Label("人数    :");  
		  Label time = new Label("日期    :");  
		  Label room = new Label("房间类型:"); 
		  Label userIphone = new Label("电话    :");  
		  Label not = new Label("                                                               ");
		  Button ret = new Button("返回");
		  Button sur = new Button("确定");
		  ret.setPrefSize(80, 40);
		  sur.setPrefSize(80, 40);
	   Font a = new Font(null,20);
	   userName.setFont(a);
	    userNum.setFont(a);
	    time.setFont(a);
	    room.setFont(a);
	    userIphone.setFont(a); 
	    ret.setFont(a);
	    sur.setFont(a);
	    
	    Label label1=new Label("                            酒店管理系统订单预定");
	    topline.setAlignment(Pos.CENTER_LEFT);
	    label1.setFont(Font.font(null,30));
	    
	 
	    TextField userTextField = new TextField(); 
	    TextField userTNum = new TextField();  
	    TextField timeb = new TextField();  
	    Label im = new Label(" —— ");  
	     TextField timee = new TextField();  
	   
	    ChoiceBox cb = new ChoiceBox(FXCollections.observableArrayList( "大床房", "双人房", "三人房")); 
	    TextField Iphone = new TextField();  
	   
	    
	    HBox h1=new HBox();
	    HBox h2=new HBox();
	    HBox h3=new HBox();
	    HBox h4=new HBox();
	    HBox h5=new HBox();
	    HBox h6=new HBox();
	    h1.getChildren().addAll(userName,userTextField);
	    h2.getChildren().addAll(userNum,userTNum);
	    h5.getChildren().addAll(time,timeb,im,timee);
	    h4.getChildren().addAll(room,cb);
	    h3.getChildren().addAll(userIphone,Iphone);
	    h6.getChildren().addAll(not,ret,sur);
	    h1 . setSpacing ( 10 ) ;
	    h2 . setSpacing ( 10 ) ;
	    h3 . setSpacing (10) ;
	    h4 . setSpacing ( 10 ) ;	    
	    h5 . setSpacing ( 10 ) ;
	    h6 . setSpacing ( 30 ) ;
	    
	    
	    
	    VBox vbox = new VBox();
	    vbox.getChildren().addAll(h1,h2,h3,h4,h5,h6);
	    vbox.setSpacing(30);
	    centerpane.getChildren().addAll(vbox);
	    centerpane.setVgap(40);
	    centerpane.setHgap(5);
	    centerpane.setPadding(new Insets(50, 50, 50, 50));
	    centerpane.setPrefSize(600, 400);	  
	    topline.getChildren().add(label1);
	    
	    Scene scnen = new Scene(pane);  
        primaryStage.setScene(scnen);  
	    primaryStage.show();  
		//监听事件
	    ret.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				    
					 try {
						 AlertBox AlertBox = new AlertBox();
					        AlertBox.display("系统提示", "确认取消订单？");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	    sur.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){				       
					 try {
						 if((!userTextField.getText().isEmpty())&&(!userTNum.getText().isEmpty())
								&&(!timeb.getText().isEmpty())&&(!timee.getText().isEmpty())&&(!Iphone.getText().isEmpty())){	 
							 System.out.println("2");}
							 else{ 
								 AlertBox AlertBox = new AlertBox();
						        AlertBox.display("系统提示", "订单信息不完整");}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	}
	public static void main(String[] args){  
        Application.launch(args);  
    }  
}

