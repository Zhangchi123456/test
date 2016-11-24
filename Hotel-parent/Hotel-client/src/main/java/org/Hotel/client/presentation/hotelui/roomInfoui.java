package org.Hotel.client.presentation.hotelui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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

public class roominfoui extends Application{
	TableView<String> table = new TableView<String>();
	@Override
	public void start(final Stage primaryStage) {
	   	 primaryStage.setTitle("网上连锁酒店系统");
	   	 GridPane grid = new GridPane();
	   	 grid.setAlignment(Pos.CENTER);
	   	 grid.setHgap(19);
	   	 grid.setVgap(25);
	   	 grid.setPadding(new Insets(1, 1, 1, 1));
	   	 Text scenetitle = new Text("客房列表");
	   	 scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
	   	 grid.add(scenetitle, 0, 0, 2, 1);
	   	 TableColumn number = new TableColumn("房间号");
         number.setMinWidth(200);
	   	 TableColumn info = new TableColumn("客房信息");
	   	 info.setMinWidth(200);

	  	 TableColumn state = new TableColumn("客房状态");
	  	 state.setMinWidth(200);
   
	  	 TableColumn time = new TableColumn("最近一次退房时间");
	  	 time.setMinWidth(200);

	 	 table.getColumns().addAll(number, info, state, time);
	     grid.add(table,1,1,5,7);
	     table.prefWidth(500);
	     table.prefHeight(500);
	     	     
	   	 Button btn1 = new Button("返回");
	     Button btn2 = new Button("确认");
	   	 grid.add(btn1, 5, 8);
	     grid.add(btn2, 4, 8);
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

