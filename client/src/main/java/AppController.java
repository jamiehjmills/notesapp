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
    private int box = 0; // this is only for testing

    @FXML
    public void creatingNotes(ActionEvent event){

        double[] y = {93,262,432};
        double[] x = {34, 224, 412};

        if (postingNotes) {
            notes(140,140,x[xPosition],y[yPosition]);
            xPosition++;
            box++; // this is only for testing
            System.out.println("Number of note: "+ box); //total 9 notes are made after that it cannot create anymore
        }

        if (xPosition > 2 && yPosition < 2) {
            yPosition++;
            xPosition = 0;
        }else if (xPosition > 2 && yPosition >= 2){
            yPosition = 0;
            xPosition = 0;
            postingNotes = false;
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
