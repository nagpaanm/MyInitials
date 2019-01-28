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
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TertiaryStage extends Stage {

    private Text text = new Text(20, 20, "Anmol Nagpal");
    private Pane pane = new Pane(text);
    private Scene scene = new Scene(pane);

    public TertiaryStage() {
        setTitle("Tertiary");
        setHeight(300);
        setWidth(300);
        setX(800);
        setY(200);
        setEllipse();
        setText();
        setScene(scene);
    }

    private void setEllipse() {
        //Left Leg
        int yCorL = 50;
        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(25, yCorL, 10, 10);
            yCorL += 20;
            ellipse.setFill(Color.RED);
            ellipse.setStroke(Color.BLACK);
            ellipse.setStrokeWidth(5);
            pane.getChildren().add(ellipse);
        }

        //Right leg
        int yCorR = 50;
        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(250, yCorR, 10, 10);
            yCorR += 20;
            ellipse.setFill(Color.GREEN);
            ellipse.setStroke(Color.BLACK);
            ellipse.setStrokeWidth(5);
            pane.getChildren().add(ellipse);
        }

        //Diagonal mid-section
        int xCorM = 45;
        int yCorM = 55;
        for (int i = 0; i < 10; i++) {
            Ellipse ellipse = new Ellipse(xCorM, yCorM, 10, 10);
            xCorM += 20;
            yCorM += 20;
            ellipse.setFill(Color.PURPLE);
            ellipse.setStroke(Color.BLACK);
            ellipse.setStrokeWidth(5);
            pane.getChildren().add(ellipse);
        }
    }

    private void setText() {
        text.setFill(Color.BLUE);
        Font font = new Font("Courier", 15);
        text.setFont(font);
    }
}
