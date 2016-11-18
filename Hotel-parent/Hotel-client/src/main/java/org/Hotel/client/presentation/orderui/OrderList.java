package org.Hotel.client.presentation.orderui;


import javafx.application.Application;  
import javafx.beans.property.SimpleStringProperty;  
import javafx.collections.FXCollections;  
import javafx.collections.ObservableList;  
import javafx.event.ActionEvent;  
import javafx.geometry.Insets;  
import javafx.scene.Group;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TableColumn;  
import javafx.scene.control.TableView;  
import javafx.scene.control.TextField;  
import javafx.scene.control.cell.PropertyValueFactory;  
import javafx.scene.layout.HBox;  
import javafx.scene.layout.VBox;  
import javafx.scene.text.Font;  
import javafx.stage.Stage;  
   
public class OrderList extends Application {  
   
    private final TableView<Person> table = new TableView<>();  
    
    private final ObservableList<Person> data =  
            FXCollections.observableArrayList(  
            );
    final HBox hb = new HBox();  
   
    @Override  
    public void start(Stage stage) {  
        Scene scene = new Scene(new Group());  
        stage.setTitle("Table View Sample");  
        stage.setWidth(600);  
        stage.setHeight(800);  
   
        final Label label = new Label("OrderList");  
        label.setFont(new Font("Arial", 40));  
   
        table.setEditable(true);  
   
        TableColumn OrderId = new TableColumn("订单号");  
        OrderId.setMinWidth(150);  
        OrderId.setCellValueFactory(  
                new PropertyValueFactory<>("OrderId"));  
   
        TableColumn Orderinfo = new TableColumn("订单信息");  
       Orderinfo.setMinWidth(200);  
       Orderinfo.setCellValueFactory(  
                new PropertyValueFactory<>("Orderinfo"));  
   
        TableColumn OrderStation = new TableColumn("订单状态");  
          OrderStation.setMinWidth(150);  
          OrderStation.setCellValueFactory(  
                new PropertyValueFactory<>("OrderStation"));  
        
        table.setItems(data);  
        table.getColumns().addAll(OrderId, OrderStation,Orderinfo);  
         
 /*       final TextField addOrderId = new TextField();  
        addOrderId.setPromptText("订单号");  
        addOrderId.setMaxWidth(OrderId.getPrefWidth());  
        final TextField addOrderStation = new TextField();  
        addOrderStation.setMaxWidth(OrderId.getPrefWidth());  
        addOrderStation.setPromptText("订单状态");  */
        final Button addOrderButton = new Button("查看");  
        addOrderButton.setMaxWidth(OrderStation.getPrefWidth());  
        Label nothing = new Label("                                                        ");
        final Button addButton = new Button("返回");
        addButton.setMinWidth(100);
    
   
        hb.getChildren().addAll(nothing,addButton);  
        hb.setSpacing(150);  
   
        final VBox vbox = new VBox();  
        vbox.setSpacing(30);  
        vbox.setPadding(new Insets(10, 0, 0, 10));  
        vbox.getChildren().addAll(label, table, hb);  
   
        ((Group) scene.getRoot()).getChildren().addAll(vbox);  
   
        stage.setScene(scene);  
        stage.show();  
    }  
    
    public static class Person {  
   
        private final SimpleStringProperty OrderId;  
        private final SimpleStringProperty OrderStation;  
        private final SimpleStringProperty Orderinfo;  
   
        private Person(String OrderId, String OrderStation, String Orderinfo) {  
            this.OrderId = new SimpleStringProperty(OrderId);  
            this.OrderStation = new SimpleStringProperty(OrderStation);  
            this.Orderinfo = new SimpleStringProperty(Orderinfo);  
        }  
   
        public String getOrderId() {  
            return OrderId.get();  
        }  
   
        public void setOrderId(String OrderId) {  
           this.OrderId.set(OrderId);  
        }  
   
        public String getOrderStation() {  
            return  OrderStation.get();  
        }  
   
        public void setOrderStation(String OrderId) {  
               OrderStation.set(OrderId);  
        }  
   
        public String getOrderinfo() {  
            return Orderinfo.get();  
        }  
   
        public void setOrderinfo(String OrderId) {  
               Orderinfo.set(OrderId);  
        }  
    } 
} 
