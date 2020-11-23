import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class AppController {

    @FXML
    private AnchorPane root;
    private int yPosition, xPosition  = 0; // x and y positions for the notes
    private boolean postingNotes = true;
    private int box = 0; // this is only for testing
    private List<Notes> notesList = new ArrayList<>();
    private Notes notes;
    private int listPostion = 0;

    public void initialize(){

       for(int i =0; i<9;i++){
           notesList.add(i, new Notes());
       }

       System.out.println(notesList); //1. to add observers. It works fine!
        //todo: creating remove observers by creating a new button.

    }

    @FXML
    public void creatingNotes(ActionEvent event){

        double[] y = {93,262,432};
        double[] x = {34, 224, 412};

        if (postingNotes) {
            notesList.get(listPostion).create(140,140,x[xPosition],y[yPosition], root);
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
            listPostion = 0;
            postingNotes = false;
        }

        listPostion++;
    }


}


