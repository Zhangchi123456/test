package org.Hotel.client.presentation.hotelui;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.Hotel.client.presentation.hotelui.mainui;
 
public class hotelInfoui extends Application {
    
    @Override
    public void start(final Stage primaryStage) {
    	 primaryStage.setTitle("网上连锁酒店系统");
    	 GridPane grid = new GridPane();
    	 grid.setAlignment(Pos.CENTER);
    	 grid.setHgap(19);
    	 grid.setVgap(25);
    	 grid.setPadding(new Insets(25, 25, 25, 25));
    	 Text scenetitle = new Text("酒店基本信息");
    	 scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
    	 grid.add(scenetitle, 0, 0, 2, 1);

    	 Label hotelName = new Label("酒店名称:");
    	 grid.add(hotelName, 0, 1);

    	 TextField hoteltx= new TextField();
    	 grid.add(hoteltx, 1, 1);

    	 Label address = new Label("地址：");
    	 grid.add(address, 0, 2);

    	 Label Pro = new Label("省/直辖市/自治区");
    	 grid.add(Pro, 1, 2);
    	 
    	 TextField Protx = new TextField();
    	 grid.add(Protx, 2, 2);
    	 
    	 Label city = new Label("市");
    	 grid.add(city, 1, 3);
    	 
    	 TextField citytx = new TextField();
    	 grid.add(citytx, 2, 3);
    	 
    	 Label block = new Label("商圈");
    	 grid.add(block, 1, 4);
    	 
    	 TextField blocktx = new TextField();
    	 grid.add(blocktx, 2, 4);
    	 
    	 TextField detail = new TextField();
    	 grid.add(detail, 1, 5, 2, 1);
    	 
    	 Label star = new Label("星级");
    	 grid.add(star, 0, 6);
    	 
    	 ChoiceBox starList = new ChoiceBox(FXCollections.observableArrayList("无","一星级","二星级","三星级","四星级","五星级"));
    	 grid.add(starList, 1, 6);
    	 
    	 Label intro = new Label("设施及服务简介：");
    	 grid.add(intro, 0, 7);
    	 
    	 TextField introtx = new TextField();
    	 grid.add(introtx, 1, 7, 2, 1);
    	 
     	 Button btn1 = new Button("返回");
	     Button btn2 = new Button("确认");
	   	 grid.add(btn1, 2, 8);
	     grid.add(btn2, 1, 8);
	     btn1.setPrefSize(200, 50);
	     btn2.setPrefSize(200, 50);
	     
	     btn1.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				   mainui order3=new mainui();
					 try {
						order3.start(primaryStage);
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