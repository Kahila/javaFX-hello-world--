package javaFX;

import javafx.application.Application;
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application { // the main class of a javaFX application inherits from the javafx.application.Application

	@Override
	public void start(Stage primaryStage) { //the start method is the main entry point for all javaFX applications
		Button btn = new Button();
	
		btn.setText("say \"hello World\"");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.printf("Hello World\n");
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);		
		//the container of the javaFX application is defined by means of a stage and scene
		Scene scene = new Scene(root, 300, 250);//set pixel size
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//for javaFX applications the main function is not needed
	public static void main(String[] args) {
		launch(args);
	}
}
