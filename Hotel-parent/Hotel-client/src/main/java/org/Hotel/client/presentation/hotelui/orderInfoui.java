package org.Hotel.client.presentation.hotelui;

import org.Hotel.client.presentation.hotelui.orderui;
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


public class orderInfoui extends Application{
	@Override
	public void start(final Stage primaryStage) {
	   	 primaryStage.setTitle("网上连锁酒店系统");
	   	 GridPane grid = new GridPane();
	   	 grid.setAlignment(Pos.CENTER);
	   	 grid.setHgap(19);
	   	 grid.setVgap(25);
	   	 grid.setPadding(new Insets(1, 1, 1, 1));
	   	 Text scenetitle = new Text("订单详细信息");
	   	 scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
	   	 grid.add(scenetitle, 0, 0, 2, 1);

	   	 Label IN = new Label("预计入住时间");
	   	 grid.add(IN, 1, 1);
	   	 IN.setFont(Font.font(null, 21));
	   	 TextField INtx = new TextField ();
	  	 grid.add(INtx, 2 , 1);

	   	 Label OUT = new Label("预计离开时间");
	  	 grid.add(OUT, 1, 2);
	  	 OUT.setFont(Font.font(null, 21));
	  	 TextField OUTtx = new TextField ();
	  	 grid.add(OUTtx, 2 , 2);
	  	 
	  	 Label state = new Label("订单状态");
	     grid.add(state, 1, 3);
	     state.setFont(Font.font(null, 21));
	     TextField statetx = new TextField ();
	  	 grid.add(statetx, 2 , 3);
	     
	     Label PERSON = new Label("订单持有人");
	     grid.add(PERSON, 1, 4);
	     PERSON.setFont(Font.font(null, 21));
	     TextField Ptx = new TextField ();
	  	 grid.add(Ptx, 2 , 4);
	 
	   	 Button btn1 = new Button("返回");
	   	 grid.add(btn1, 5, 5);
	     btn1.setPrefSize(200, 50);
	   	 Button btn2 = new Button("刷新");
	     grid.add(btn2, 4, 5);
	     btn2.setPrefSize(200, 50);
	     Button btn3 = new Button("点此查看");
	     grid.add(btn3, 2, 4);
	     btn3.setPrefSize(200, 50);
	     
	     btn1.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   orderui order2=new orderui();
					 try {
						order2.start(primaryStage);
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
