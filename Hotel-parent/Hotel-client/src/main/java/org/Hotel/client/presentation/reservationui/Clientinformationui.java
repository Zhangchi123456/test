package org.Hotel.client.presentation.reservationui;

import java.time.LocalDate;


import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*; 
import javafx.scene.shape.*;
import javafx.scene.text.Font;


public class Clientinformationui extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
		BorderPane pane=new BorderPane();
		
		pane.setPrefSize(800, 600);
		HBox topline=new HBox();
		HBox bottomline=new HBox();
		pane.setBottom(bottomline);
		pane.setTop(topline);
		
		
		VBox centerpane=new VBox();
		centerpane.setAlignment(Pos.TOP_CENTER);
	
		centerpane.setPrefSize(800, 450);
		centerpane.setPadding(new Insets(0,0,0,120));
		pane.setCenter(centerpane);
	    
		
		Label top=new Label("个人信息界面");
		top.setFont(Font.font(40));
	
		topline.getChildren().add(top);
		topline.setAlignment(Pos.TOP_CENTER);
		topline.setPrefSize(800, 120);
		topline.setPadding(new Insets(20, 30, 30, 10));
		
		Label label0=new Label("会员性质:");
		Label label00=new Label("会员等级");
		
		Label label1=new Label("姓名/企业名称：");
		label1.setPrefHeight(35);
		TextField nametx=new TextField("XXX");
		
		Label label2=new Label("手机／企业联系方式：");
		label2.setPrefHeight(40);
		TextField lianxitx=new TextField("159xxxxxxxx");
		
		Label label3=new Label("生日：");
		label3.setPrefHeight(35);
		DatePicker dp=new DatePicker(LocalDate.of(1997, 9, 12));
		Label label4=new Label("信用值：");
		Label creditvalue=new Label("1000");
		
		Button xyrecord=new Button("信用记录查看");
		
		
		Label labelr0=new Label("个人会员");
		Label labelr00=new Label("金会员");
		Label labelnon=new Label();
		
		
	    HBox membertypeline=new HBox();
		HBox memberlevel=new HBox();
		HBox membername=new HBox();
		HBox phonenumberline=new HBox();
		HBox birthdayline=new HBox();
		HBox membercredit=new HBox();
		
		membertypeline.getChildren().addAll(label0,labelr0);
		memberlevel.getChildren().addAll(label00,labelr00);
		membername.getChildren().addAll(label1,nametx);
		phonenumberline.getChildren().addAll(label2,lianxitx);
		birthdayline.getChildren().addAll(label3,dp);
		membercredit.getChildren().addAll(label4,creditvalue);
		
	    membertypeline.setSpacing(200);
	    memberlevel.setSpacing(205);
        membername.setSpacing(160);
        phonenumberline.setSpacing(125);
        birthdayline.setSpacing(215);
        membercredit.setSpacing(205);
		
		
	    
	    centerpane.getChildren().addAll(membertypeline,memberlevel,membername,
	    		phonenumberline,birthdayline,membercredit);
	    centerpane.setSpacing(25);
	    
		Button editb=new Button("保存");
		
	
		editb.setPrefSize(80,40);
		editb.setFont(Font.font(20));
		Button returnb=new Button("返回");
		returnb.setFont(Font.font(20));
		returnb.setPrefSize(80, 40);
		
		//监听事件
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
		
		
		bottomline.getChildren().addAll(editb,returnb);
		bottomline.setPrefSize(800, 100);
		bottomline.setPadding(new Insets(20, 30, 30, 10));
	    bottomline.setSpacing(500);
		bottomline.setAlignment(Pos.BOTTOM_CENTER);
	   
		
	    
	   
		
	    
		
		
		
		
	    Scene scnen = new Scene(pane);  
        primaryStage.setScene(scnen);  
	    primaryStage.show();  
		
	}
	public static void main(String[] args){  
        Application.launch(args);  
    }  
}

