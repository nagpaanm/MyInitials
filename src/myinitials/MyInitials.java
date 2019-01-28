/*

Anmol Nagpal
991154162
Assignment 1
January 27th, 2019

 */
package myinitials;

import content.SecondaryStage;
import content.TertiaryStage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyInitials extends Application {

    private Text text = new Text(20, 20, "Anmol Nagpal");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Primary");
        primaryStage.setHeight(300);
        primaryStage.setWidth(300);
        primaryStage.setX(200);
        primaryStage.setY(200);
        ImageView kim = new ImageView("images/kim.jpg");
        kim.setFitWidth(300);
        kim.setFitHeight(300);
        Pane pane = new Pane(kim, text);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        SecondaryStage s1 = new SecondaryStage();
        TertiaryStage s2 = new TertiaryStage();
        primaryStage.show();
        s1.show();
        s2.show();
        setText();
    }

    private void setText() {
        text.setFill(Color.GREEN);
        Font font = new Font("Courier", 15);
        text.setFont(font);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
