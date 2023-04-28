import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class q4 extends Application {
    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Font font = Font.font("Arial", 24);

        double centerX = 200;
        double centerY = 200;
        double radius = 150;
        double angle = 0;
        double rotate = -90;

        String text = "Welcome to Java";

        for (int i = text.length()-1; i >=0 ; i--) {
            Text letter = new Text(String.valueOf(text.charAt(i)));

            letter.setFont(font);
            letter.setX(centerX + radius * Math.cos(Math.toRadians(angle)));
            letter.setY(centerY + radius * Math.sin(Math.toRadians(angle)));
            letter.setRotate(rotate + angle);

            pane.getChildren().add(letter);

            angle += 360.0 / text.length();
        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
