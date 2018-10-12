package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


    public class Launchpage extends FlowPane {

            public Button Startgame = new Button("Start");
            public Button Records = new Button("Records");
            public Button exit = new Button("Exit");

        public void initial() {

            VBox launchbox = new VBox(40);

            launchbox.setPadding(new Insets(15, 12, 15, 12));
            launchbox.setSpacing(10);
            launchbox.getChildren().addAll(Startgame,Records,exit);

            this.getChildren().addAll(launchbox);
            this.setStyle("-fx-background-color:#336699");
            this.setAlignment(Pos.CENTER);
}

}
