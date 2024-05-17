
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage){
        launch();
    }

    public static void main(String[] args) {
        World w = new World();
        w.run();
    }

}