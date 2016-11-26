package application;
	
import java.io.InputStream;


import Helper.UiswitchHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	 private Stage mainStage;
		
		@Override
		public void start(Stage primaryStage) throws Exception {
			init(primaryStage);
			primaryStage.show();
			
		}
		
		//stage的初始化
	    public void init(Stage stage){
	    	this.mainStage=stage;
	    	UiswitchHelper.setApplication(this);
	    	goto_Usermainui();
	    }
	    
	    
	    //切换窗口的一个实现方法，用fxmlloader加载fxml文件路径再进行跳转
	    private Initializable replaceSceneContent(String fxml) throws Exception {
			FXMLLoader loader = new FXMLLoader();
			InputStream in = Main.class.getResourceAsStream(fxml);
			loader.setBuilderFactory(new JavaFXBuilderFactory());
			loader.setLocation(Main.class.getResource(fxml));
			
			BorderPane page;
			try {
				page = (BorderPane) loader.load(in);
			}finally {
				in.close();
			} 
			mainStage.centerOnScreen();
			Scene scene = new Scene(page);
			mainStage.setScene(scene);
			mainStage.sizeToScene();


			return (Initializable) loader.getController();
		}
	    
	    //跳转到登录界面
	    public void goto_Loginui(){
	    	try {
				replaceSceneContent("/userui/Loginui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //跳转到注册界面
	    public void goto_Registerui(){
	    	try {
				replaceSceneContent("/userui/Registerui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //以下是客户流程的跳转界面方法
	    
	    //跳转到用户主界面
	    public void goto_Usermainui(){
	    	try {
				replaceSceneContent("/userui/Usermainui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	   
	   //跳转到用户个人信息界面 
	    public void goto_Userinformationui(){
	    	try {
				replaceSceneContent("/userui/Userinformationui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    //跳转到用户信用记录界面
	    public void goto_Usercreditrecordui(){
	    	try {
				replaceSceneContent("/userui/Usercreditrecordui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    //用户点搜索以后跳转到酒店列表界面
	    public void goto_HotelListui(){
	    	try {
				replaceSceneContent("/hotelui/HotelListui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    //用户点击“我的订单”按钮跳转到订单列表界面
	    public void goto_OrderListUi(){
	    	try {
				replaceSceneContent("/orderui/OrderListUi.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    //用户在酒店列表中选中酒店后跳到该酒店的信息页面  序号1.0
	    public void goto_hotelInfoBrowseui(){
	    	try {
				replaceSceneContent("/hotelui/hotelInfoBrowseui.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //用户在酒店具体信息页面中选中生成订单按钮跳转到生成订单界面 1.0.1
	    public void goto_OrderInputUi(){
	    	try {
				replaceSceneContent("/orderui/OrderInputUi.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    //用户想对已执行订单进行评价时跳转到评价界面
	    public void goto_OrderEvaluateui(){
	    	try {
				replaceSceneContent("/orderui/OrderEvaluate.fxml");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    
	    
	 
}
