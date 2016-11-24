package org.Hotel.client.presentation.hotelui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.Hotel.client.presentation.hotelui.mainui;
import javafx.geometry.VPos;

public class updateui extends Application{
	@Override
	public void start(final Stage primaryStage) {
	   	 primaryStage.setTitle("网上连锁酒店系统");
	   	 GridPane grid = new GridPane();
	   	 grid.setAlignment(Pos.CENTER);
	   	 grid.setHgap(19);
	   	 grid.setVgap(25);
	   	 grid.setPadding(new Insets(25, 25, 25, 25));
	   	 Text scenetitle = new Text("入住信息更新");
	   	 scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
	   	 grid.add(scenetitle, 0, 0, 2, 1);
	 
	   	 Label number = new Label("客房号：");
	   	 grid.add(number, 0, 1);
	   	 number.setFont(Font.font(null, 21));

	   	 Label timeIN = new Label("入住时间：");
	  	 grid.add(timeIN, 0, 2);
	  	 timeIN.setFont(Font.font(null, 21));
	  	 
	  	 Label timeOUT = new Label("预计离开时间：");
	     grid.add(timeOUT, 0, 3);
	     timeOUT.setFont(Font.font(null, 21));
	     
	     Label OrderNumber = new Label("订单号");
	     grid.add(OrderNumber, 0, 4);
	     OrderNumber.setFont(Font.font(null, 21));
	     
	     TextField numberF = new TextField();
    	 grid.add(numberF, 1, 1);
    	 
    	 TextField INF = new TextField();
    	 grid.add(INF, 1, 2);
    	 
    	 TextField OUTF = new TextField();
    	 grid.add(OUTF, 1, 3);
    	 
    	 TextField OrderNumberF =new TextField();
    	 grid.add(OrderNumberF, 1, 4);
	 
	   	 Button btn1 = new Button("返回");
	     Button btn2 = new Button("确认");
	   	 grid.add(btn1, 2, 6);
	     grid.add(btn2, 1, 6);
	     btn1.setPrefSize(200, 50);
	     btn2.setPrefSize(200, 50);
	     
	     btn1.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   mainui order4=new mainui();
					 try {
						order4.start(primaryStage);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   });
	     
	   	 final Text actiontarget = new Text();
	        grid.add(actiontarget, 1, 6);
	   	 Scene scene = new Scene(grid, 800, 600);
	   	 primaryStage.setScene(scene);
	        primaryStage.show();
	   }
	public static void main(String[] args) {
        launch(args);
    }
}

