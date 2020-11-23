import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
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

        MenuBar menu = new MenuBar();
        menu.setPrefSize(width,20);
        menu.setLayoutX(x);
        menu.setLayoutY(y);

        Menu mainMenu = new Menu("...");

        MenuItem menuItem1 = new MenuItem("Maximise");
        MenuItem menuItem2 = new MenuItem("Close");

        //add a main menu onto a menubar
        menu.getMenus().add(mainMenu);

        //add two menu item (drop-down list) into the menu
        mainMenu.getItems().add(menuItem1);
        mainMenu.getItems().add(menuItem2);

        root.getChildren().addAll(r,menu);
    }

//    @Override
//    public void update(String message) {
//
//    }

}