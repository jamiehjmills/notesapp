import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Notes implements Observer{

    @Override
    public void create(double width, double height, double x, double y, AnchorPane root) {

        Rectangle r = new Rectangle();
        r.setX(x);
        r.setY(y);
        r.setWidth(width);
        r.setHeight(height);
        r.setFill(Color.LIGHTGRAY);
        root.getChildren().add(r);

    }

//    @Override
//    public void update(String message) {
//
//    }

}