
import java.io.IOException;
import java.io.InputStream;


import java.util.ResourceBundle;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application{
	private Stage mainStage;
	InputStream in;
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		init(primaryStage);
		primaryStage.show();
		
	}
	
	//stage的初始化
    public void init(Stage stage){
    	this.mainStage=stage;
       GridPane grid=new GridPane();
		
		grid.setPrefSize(600, 400);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setAlignment(Pos.CENTER);
		grid.setPadding(new Insets(20,20,20,20));
		
		Text account=new Text("账号");
		Text password=new Text("密码");
		
		TextField acountField=new TextField();
		PasswordField psField=new PasswordField();
		
		Button login=new Button();
		Button signin=new Button();
		login.setText("注册");
		signin.setText("登入");
		HBox hbOfLogSign=new HBox();
		hbOfLogSign.setSpacing(10);
		hbOfLogSign.setAlignment(Pos.BOTTOM_RIGHT);
		hbOfLogSign.getChildren().addAll(signin,login);
		
		grid.add(account, 0, 0);
		grid.add(password, 0, 2);
		grid.add(acountField,1,0);
		grid.add(psField, 1, 2);
		grid.add(hbOfLogSign,1, 3);
		
		login.setOnAction(e->{
			
			
			
		});
		
			
		
		
		
		
		Scene scene=new Scene(grid);
		
		mainStage.setScene(scene);
		
		mainStage.setTitle("用户登录");
		signin.setOnAction(new EventHandler<ActionEvent>(){
			   public void handle(ActionEvent event){
				 try {
					 mainStage.close();
					 Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Usermainui.fxml"));
					Scene scene=new Scene(root);
					mainStage.setScene(scene);
					mainStage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   }
		   });
    	
    }
    
    
    //跳转到用户主界面
    public void goto_Usermainui(){
    	try {
			replaceSceneContent("/userui/Usermainui.fxml");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    //跳转到登录界面
    public void goto_Loginui(){
    	
    }
    
    
    //切换窗口的一个实现方法，用fxmlloader加载fxml文件路径再进行跳转
    private Initializable replaceSceneContent(String fxml) throws Exception {
		FXMLLoader loader = new FXMLLoader();
		 in = Main.class.getResourceAsStream(fxml);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setLocation(Main.class.getResource(fxml));
		
		BorderPane page;
		try {
			page = (BorderPane) loader.load(in);
		}finally {
			//in.close();
		} 
		mainStage.centerOnScreen();
		Scene scene = new Scene(page);
		mainStage.setScene(scene);
		mainStage.sizeToScene();


		return (Initializable) loader.getController();
	}
}
