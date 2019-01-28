/*

Anmol Nagpal
991154162
Assignment 1
January 27th, 2019

 */
package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SecondaryStage extends Stage {

    private Text text = new Text(20, 20, "Anmol Nagpal");
    private Rectangle rectL = new Rectangle(25, 50, 25, 200);
    private Rectangle rectR = new Rectangle(225, 50, 25, 200);
    private Rectangle rectT = new Rectangle(25, 46, 225, 25);
    private Ellipse ellipse = new Ellipse(135, 150, 85, 10);
    private Pane pane = new Pane(rectL, rectR, rectT, ellipse, text);
    private Scene scene = new Scene(pane);

    public SecondaryStage() {
        setTitle("Secondary");
        setHeight(300);
        setWidth(300);
        setX(500);
        setY(200);
        setRectangle();
        setEllipse();
        setText();
        setScene(scene);
    }

    private void setRectangle() {
        rectL.setStroke(Color.BLUE);
        rectL.setStrokeWidth(10);
        rectR.setStroke(Color.BLUE);
        rectR.setStrokeWidth(10);
        rectT.setStroke(Color.BLUE);
        rectT.setStrokeWidth(5);
    }

    private void setEllipse() {
        ellipse.setStroke(Color.BLUE);
        ellipse.setStrokeWidth(10);
        ellipse.setFill(Color.BLACK);
    }

    private void setText() {
        text.setFill(Color.ORANGE);
        Font font = new Font("Courier", 15);
        text.setFont(font);
    }
}
