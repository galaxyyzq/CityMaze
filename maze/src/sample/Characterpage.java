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
	public Button MaleBtn = new Button("M");
	public Button FemaleBtn = new Button("F");
	public Button BackBtn = new Button("<<");

	public void initial() {
	
		VBox header = new VBox();
		//Label choosegender = new Label("Choose gender");
		header.setPadding(new Insets(10, 10, 10,10));
		MaleBtn.setPrefSize(150,150);
		FemaleBtn.setPrefSize(150,150);
		BackBtn.setPrefSize(150,150);

		header.getChildren().addAll(BackBtn,MaleBtn,FemaleBtn);
		VBox character  = new VBox();
		Image imageboy =  new Image("./sample/boy.png");
		//Image image
		ImageView imgView = new ImageView(imageboy);
		character.getChildren().addAll(imgView);
		character.setPadding(new Insets(30, 30, 30, 30));

		this.add(header,0,0);
		this.add(character,1,1);
		this.add(ok,2,2);

}
}
