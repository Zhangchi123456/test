package org.Hotel.client.presentation.orderui;
import javafx.application.Application;
import javafx.collections.FXCollections;
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
public class OrderEvaluateUI extends Application {

	public void start(Stage primaryStage) throws Exception {
		BorderPane pane=new BorderPane();
		
		pane.setPrefSize(800, 600);
		HBox topline=new HBox();
		FlowPane centerpane=new FlowPane();
		pane.setCenter(centerpane);
       
		topline.setAlignment(Pos.BOTTOM_LEFT);
		topline.setPadding(new Insets(20, 30, 30, 10));
		
		pane.setTop(topline);
		
		  Label OrderId = new Label("订单号 :");  
		  Label Hotel = new Label("酒店    :");  
		  Label Score = new Label("评分    :");  
		  Label Info = new Label("评价信息:"); 
		  Label not = new Label("                                                               ");
		  Button ret = new Button("返回");
		  Button sur = new Button("确定");
		  ret.setPrefSize(80, 40);
		  sur.setPrefSize(80, 40);
	   Font a = new Font(null,20);
	   OrderId.setFont(a);
	   Hotel.setFont(a);
	  Score.setFont(a);
	    Info.setFont(a); 
	    ret.setFont(a);
	    sur.setFont(a);
	    
	    Label label1=new Label("                            订单评价");
	    topline.setAlignment(Pos.CENTER_LEFT);
	    label1.setFont(Font.font(null,30));
	    
	 
	    Label Orderid = new Label("123456"); 
	    Orderid.setFont(a);
	    
	    Label hotel = new Label("7天酒店");
	    hotel.setFont(a);
	    TextField score = new TextField();
	    TextField info = new TextField();  
	 
	   
	    
	    HBox h1=new HBox();
	    HBox h2=new HBox();
	    HBox h3=new HBox();
	    HBox h4=new HBox();
	    HBox h5=new HBox();
	    
	    h1.getChildren().addAll(OrderId,Orderid);
	    h2.getChildren().addAll(Hotel,hotel);
	    h4.getChildren().addAll(Info,info);
	    h3.getChildren().addAll(Score,score);
	    h5.getChildren().addAll(not,ret,sur);
	    h1 . setSpacing ( 10 ) ;
	    h2 . setSpacing ( 10 ) ;
	    h3 . setSpacing (10) ;
	    h4 . setSpacing ( 10 ) ;	    
	    h5 . setSpacing ( 30 ) ;
	    
	    
	    
	    VBox vbox = new VBox();
	    vbox.getChildren().addAll(h1,h2,h3,h4,h5);
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
		
	}
	public static void main(String[] args){  
        Application.launch(args);  
    }  
}
