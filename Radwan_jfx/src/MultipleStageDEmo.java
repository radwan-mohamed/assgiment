import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDEmo extends Application {

    public void start(Stage primaryStage) {
        Button btn = new Button("OK");
        Scene scene = new Scene(btn, 500, 250);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
        Stage stage = new Stage();
        stage.setTitle("Second stage");
        Scene s1 = new Scene(new Button("New Stage"), 300, 200);
        stage.setScene(s1);
        stage.setResizable(false);
        stage.show();
    }
}
