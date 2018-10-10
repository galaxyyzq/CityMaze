package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public abstract class Launchpage implements {
	
	public Button Startgame;
	public Button Resumegame;

	public Launchpage() {
	//public final startgame gameController;
	
	//How to setthe page title?//	
	
	VBox launchbox = new VBox(40);
	Button Startgame = new Button("Start");
	Button Resumegame = new Button("Resume");
	launchbox.setPadding(new Insets(15, 12, 15, 12));
	launchbox.setSpacing(10);
	launchbox.setAlignment(Pos.CENTER);
	launchbox.setStyle("-fx-background-color:#336699");
	launchbox.getChildren().addAll(Startgame,Resumegame);
	
	Scene launch = new Scene(launchbox);
}

