import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK1"));
        Scene scene = new Scene(pane, 200,100);
        primaryStage.setTitle("Button in Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
