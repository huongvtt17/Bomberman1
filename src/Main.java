import javafx.application.Application;
import javafx.stage.Stage;
import sample.Images;
import sample.Musics;
import screen.GameScr;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Bomber Man");
        stage.setScene(new GameScr().getScene(stage));
        stage.show();
    }

    public static void main(String[] args) {
        load();
        launch(args);
    }

    public static void load() {
        Images.initImages();
        Musics.initMusics();
    }
}
