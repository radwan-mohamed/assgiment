import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

public class q3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20, 10, 20, 10));
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);

        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            Text text = new Text("Text " + (i+1));
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text.setRotate(90);
            text.setFill(Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256), Math.random()));
            hbox.getChildren().add(text);
        }
        Scene scene = new Scene(hbox, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
