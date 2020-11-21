import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class AppController {

    @FXML
    AnchorPane pane;

    @FXML
    public void creatingNotes(ActionEvent event){

        System.out.println("testing = ok");
        notes(200,200);

    }

    public void notes(float width, float height){

        Rectangle r = new Rectangle();
        r.setX(50);
        r.setY(50);
        r.setWidth(200);
        r.setHeight(100);

    }

}
