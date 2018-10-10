package sample;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

public class Characterpage {
	
	public void Character() {
	
		HBox gender = new HBox(10);
		//Label choosegender = new Label("Choose gender");
		gender.setPadding(new Insets(0, 10, 10, 10));
		Button MaleBtn = new Button("M");
		Button FemaleBtn = new Button("F");
		Button BackBtn = new Button("<<");
		gender.getChildren().addAll(BackBtn,MaleBtn,FemaleBtn);
		
		VBox character  = new VBox();
		String path = "resources/"
		Image imgage =  new Image("https://i0.wp.com/static.vectorcharacters.net/uploads/2013/02/Schoolboy_Vector_Character1.jpg");
		ImageView imgView = new ImageView(imgage);
		character.getChildren().addAll(imgView);
		character.setPadding(new Insets(30, 30, 30, 30));

		BorderPane characterpane = new BorderPane();
		
		characterpane.setTop(gender);
		characterpane.setCenter(character);
		Scene launch = new Scene(characterpane,600,600);

}
}