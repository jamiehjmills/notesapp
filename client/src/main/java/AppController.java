import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class AppController {

    @FXML
    private AnchorPane root;
    private int yPosition, xPosition  = 0; // x and y positions for the notes
    private boolean postingNotes = true;

    @FXML
    public void creatingNotes(ActionEvent event){

        System.out.println("testing = ok");

        double[] y = {93,262,432};
        double[] x = {34, 224, 412};

        if (postingNotes) {
            notes(140,140,x[xPosition],y[yPosition]);
            xPosition++;
        };

        if (xPosition >= 3){
            yPosition++;
            xPosition = 0;
        }

        if (yPosition >= 2 && xPosition >= 3 ){
            postingNotes= false;
            yPosition = 0;
            xPosition = 0;

        }


    }

    public void notes(double width, double height, double x, double y){

        Rectangle r = new Rectangle();
        r.setX(x);
        r.setY(y);
        r.setWidth(width);
        r.setHeight(height);
        r.setFill(Color.LIGHTGRAY);
        root.getChildren().add(r);

    }

}
