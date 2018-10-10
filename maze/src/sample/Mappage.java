package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class Mappage extends GridPane {

    public Button start = new Button("start your game");

    public void initial() {

        this.add(start,2,2);


    }
}