package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Launchpage extends FlowPane {

            public Button Startgame = new Button("Start");
            public Button Records = new Button("Records");
            public Button exit = new Button("Exit");

        public void initial() {

            VBox launchbox = new VBox(40);

            //title
            Image titlepic =  new Image("./sample/title.png");
            ImageView titleView = new ImageView(titlepic);
            VBox title = new VBox();
            title.getChildren().add(titleView);


            //buttons
            Startgame.setPrefSize(100,50);
            Records.setPrefSize(100,50);
            exit.setPrefSize(100,50);

            launchbox.setPadding(new Insets(15, 12, 15, 12));
            launchbox.setSpacing(10);
            launchbox.getChildren().addAll(title, Startgame,Records,exit);

            this.getChildren().addAll(launchbox);
            this.setStyle("-fx-background-color:#ff423b");
            this.setAlignment(Pos.CENTER);
}

}
