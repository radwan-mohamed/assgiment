import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class q2 extends Application {
    private static int BOARD_SIZE = 4;
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        Random random = new Random();

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                ImageView imageView = new ImageView();
                imageView.setFitWidth(200);
                imageView.setFitHeight(200);
                int randomNumber = random.nextInt(3);
                if (randomNumber == 0) {
                    imageView.setImage(new Image("image/x.gif"));
                } else if (randomNumber == 1) {
                    imageView.setImage(new Image("image/o.gif"));
                }
                gridPane.add(imageView, i, j);
            }
        }
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
