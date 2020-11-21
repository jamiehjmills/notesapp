import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    private final int appWidth = 600;
    private final int appHeight = 600;

    @Override
    public void start(Stage stage) throws Exception {

        // Create and show the title screen
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("application.fxml"));
        fxmlLoader.setLocation(getClass().getResource("application.fxml"));
        Parent titleScreen = fxmlLoader.load();

        // Display the title screen
        Scene scene = new Scene(titleScreen, appWidth, appHeight);
        stage.setTitle("Notes");
        stage.setScene(scene);
        stage.show();


    }
}



