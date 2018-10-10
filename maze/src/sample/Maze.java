import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sample.Characterpage;
import sample.Gamepage;
import sample.Launchpage;
import sample.Menupage;
import sun.jvm.hotspot.debugger.Page;

public class Maze extends Application {

    public static void main(String[] args) { Application.launch(args); }


    public void start(Stage primaryStage) {

        primaryStage.setTitle("CityMaze");

        Gamepage gp = new Gamepage();
        Menupage mp = new Menupage();
        Characterpage cp = new Characterpage();
        Launchpage lp = new Launchpage();
        Scene GameScene = new Scene(gp,600,600);
        gp.initial();
        Scene MenuScene = new Scene(mp,600,600);
        mp.initial();
        Scene Characterscene = new Scene(cp,600,600);
        cp.initial();
        Scene Launchscene = new Scene(lp,600,600);
        lp.initial();



        gp.menu.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            primaryStage.setScene(MenuScene);

        });

        primaryStage.setScene(GameScene);
        primaryStage.show();

    }

}