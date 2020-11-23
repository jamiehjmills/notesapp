import javafx.scene.layout.AnchorPane;

public interface Observer {

    void create(double width, double height, double x, double y, AnchorPane root);
    //void update(String message);
}
