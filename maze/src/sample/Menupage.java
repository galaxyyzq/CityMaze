package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Menupage extends StackPane {


    public Button cont = new Button("continue");
    public Button reset = new Button("reset");
    public Button exit = new Button("exit");


    public void initial() {


        Text header = new Text("MENU");
        HBox textbox = new HBox();
        textbox.setPadding(new Insets(150, 12, 15, 12));
        textbox.getChildren().addAll(header);
        textbox.setAlignment(Pos.CENTER);

        VBox btnbox = new VBox(cont, reset, exit);
        btnbox.setAlignment(Pos.CENTER);
        btnbox.setPadding(new Insets(20, 0, 260, 0));

        BorderPane view = new BorderPane();
        view.setCenter(btnbox);
        view.setTop(textbox);

        Label background = new Label();

        this.getChildren().addAll(background, view);
    }
}
