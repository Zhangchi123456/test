package org.Hotel.client.presentation.userui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.animation.Timeline;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;



public class Loginui extends Application{
	
	public void start(Stage myStage){
	
		Group root=new Group();
		
		Scene scene=new Scene(root,800,600,Color.CHOCOLATE);
		
		for(int i=0;i<5;i++){
			Rectangle r=new Rectangle();
			r.setY(i*30);
			
		}
	
		
		
	
		
		myStage.setScene(scene);
		
		myStage.setTitle("用户登录");
		
		myStage.show();
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	

}
