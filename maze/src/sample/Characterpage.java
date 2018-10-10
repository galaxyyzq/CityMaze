package sample;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class Characterpage extends GridPane {

	public Button ok = new Button("OK");


	public void initial() {
	
		HBox header = new HBox(10);
		//Label choosegender = new Label("Choose gender");
		header.setPadding(new Insets(10, 10, 10, 10));
		Button MaleBtn = new Button("M");
		Button FemaleBtn = new Button("F");
		Button BackBtn = new Button("<<");
		header.getChildren().addAll(BackBtn,MaleBtn,FemaleBtn);
		
		VBox character  = new VBox();
		Image image =  new Image("./sample/boy.png");
		ImageView imgView = new ImageView(image);
		character.getChildren().addAll(imgView);
		character.setPadding(new Insets(30, 30, 30, 30));

		
		this.add(header,0,0);
		this.add(character,1,1);
		this.add(ok,2,2);

}
}