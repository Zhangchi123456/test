package org.Hotel.client.presentation.reservationui;

import java.awt.Color;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.*; 
import javafx.scene.shape.*;
import javafx.scene.text.Font;

public class Registerui extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane=new BorderPane();
		pane.setPrefSize(800,600);
		
		HBox topline=new HBox();
		pane.setTop(topline);
		topline.setAlignment(Pos.TOP_CENTER);
		topline.setPrefSize(800, 120);
		topline.setPadding(new Insets(20, 30, 30, 10));
		HBox bottomline=new HBox();
		bottomline.setPrefSize(800, 100);
		bottomline.setPadding(new Insets(20, 30, 30, 10));
		pane.setBottom(bottomline);
		
		VBox centerpane=new VBox();
		centerpane.setAlignment(Pos.TOP_CENTER);
		centerpane.setPrefSize(800, 450);
		centerpane.setPadding(new Insets(0, 0, 0, 120));
		pane.setCenter(centerpane);
		
		Label label1=new Label("会员注册");
		label1.setFont(Font.font(40));
		topline.getChildren().add(label1);
		
		
		
		
		Label Label2=new Label("姓名/企业名：");
		Label Label3=new Label("密码：");
		Label Label4=new Label("确认密码：");
		Label Label5=new Label("手机／联系方式：");
		Label Label6=new Label("生日：");
		
		Button submit=new Button("提交");
		Button returnbutton=new Button("返回");
		submit.setPrefSize(80, 40);
		returnbutton.setPrefSize(80, 40);
		submit.setFont(Font.font(20));
		returnbutton.setFont(Font.font(20));
		
		TextField text1=new TextField();
		TextField text2=new TextField();
		PasswordField passwordtext=new PasswordField();
		PasswordField passwordtext2=new PasswordField();
		
		DatePicker dp=new DatePicker();
		
		
		RadioButton companymember=new RadioButton("企业会员");
		RadioButton personmember=new RadioButton("个人会员");
		companymember.setPrefWidth(130);
		
		
		HBox membertypeline=new HBox();
		HBox membernameline=new HBox();
		HBox registerpasswordline=new HBox();
		HBox confirmpasswordline=new HBox();
		HBox phonenumberline=new HBox();
		HBox birthdayline=new HBox();
		
	   membertypeline.getChildren().addAll(companymember,personmember);
	   membernameline.getChildren().addAll(Label2,text1);
	   registerpasswordline.getChildren().addAll(Label3,passwordtext);
	   confirmpasswordline.getChildren().addAll(Label4,passwordtext2);
	   phonenumberline.getChildren().addAll(Label5,text2);
	   birthdayline.getChildren().addAll(Label6,dp);
	   membertypeline.setSpacing(50);
	   membernameline.setSpacing(200);
	   registerpasswordline.setSpacing(245);
	   confirmpasswordline.setSpacing(220);
	   phonenumberline.setSpacing(180);
	   birthdayline.setSpacing(245);
	   
	   
	   
	   bottomline.getChildren().addAll(submit,returnbutton);
	   bottomline.setSpacing(400);
	   bottomline.setAlignment(Pos.TOP_CENTER);
	  
		
		centerpane.getChildren().addAll(membertypeline,membernameline,registerpasswordline,
				confirmpasswordline,phonenumberline,birthdayline);
		centerpane.setSpacing(25);
		
		
		
		Scene scnen = new Scene(pane);  
		
        primaryStage.setTitle("12");  
        primaryStage.setScene(scnen); 
		primaryStage.show();
		
	}
	public static void main(String[] args){  
        Application.launch(args);  
    }  

}
