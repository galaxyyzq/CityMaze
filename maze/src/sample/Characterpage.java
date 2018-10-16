package sample;


import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.*;

public class Characterpage extends GridPane {

	public Button ok = new Button("OK");
	public Button BackBtn = new Button("<");

	public void initial() {
	
		VBox header = new VBox();
		Label choose = new Label("Customize your character by drag and drop");

		header.setPadding(new Insets(10, 10, 10,10));



		Image male =  new Image("./sample/boy.png");
		ImageView maleView = new ImageView(male);
		maleView.setFitHeight(50);
		maleView.setFitWidth(50);
		Button MaleBtn = new Button();
		MaleBtn.setGraphic(maleView);
		MaleBtn.setId("M");

		Image female =  new Image("./sample/girl.png");
		ImageView femaleView = new ImageView(female);
		femaleView.setFitHeight(50);
		femaleView.setFitWidth(50);
		Button FemaleBtn = new Button();
		FemaleBtn.setGraphic(femaleView);
		FemaleBtn.setId("F");


		MaleBtn.setPrefSize(80,80);
		FemaleBtn.setPrefSize(80,80);
		ok.setPrefSize(80,80);
		header.getChildren().addAll(BackBtn,MaleBtn,FemaleBtn);


		VBox character  = new VBox();
		Image imageboy =  new Image("./sample/boy.png");
		ImageView imgView = new ImageView(imageboy);
		character.getChildren().addAll(imgView);
		character.setPadding(new Insets(30, 0, 30, 0));

		this.add(header,0,0);
		this.add(choose, 1,0);
		this.add(character,1,1);
		this.add(ok,2,2);

		FemaleBtn.setOnDragDetected(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Dragboard db = FemaleBtn.startDragAndDrop(TransferMode.MOVE);
				ClipboardContent content = new ClipboardContent();
				content.putString(FemaleBtn.getId());
				db.setContent(content);
				event.consume();
			}
		});



		MaleBtn.setOnDragDetected(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Dragboard db = MaleBtn.startDragAndDrop(TransferMode.MOVE);
				ClipboardContent content = new ClipboardContent();
				content.putString(MaleBtn.getId());
				db.setContent(content);
				event.consume();
			}
		});

		imgView.setOnDragOver(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				event.acceptTransferModes(TransferMode.MOVE);
				event.consume();
			}
		});

		imgView.setOnDragDropped(new EventHandler<DragEvent>() {
			@Override
			public void handle(DragEvent event) {
				if (event.getDragboard().getContent(DataFormat.PLAIN_TEXT).equals("M")){
					imgView.setImage(new Image("./sample/boy.png"));
				}

				if (event.getDragboard().getContent(DataFormat.PLAIN_TEXT).equals("F")){
					imgView.setImage(new Image("./sample/girl.png"));
				}

				event.consume();
				event.setDropCompleted(true);
			}
		});


	}
}
