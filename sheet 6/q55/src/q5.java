import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class q5 extends Application {
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Font font = Font.font("Arial", 14);

        Rectangle projectsBar = new Rectangle(120, 300, 50, 40);
        projectsBar.setFill(Color.RED);
        Rectangle quizzesBar = new Rectangle(50, 260, 50, 80);
        quizzesBar.setFill(Color.BLUE);
        Rectangle midtermBar = new Rectangle(190, 200, 50, 140);
        midtermBar.setFill(Color.GREEN);
        Rectangle finalBar = new Rectangle(260, 140, 50, 200);
        finalBar.setFill(Color.ORANGE);


        pane.getChildren().addAll(quizzesBar,projectsBar, midtermBar, finalBar);



        Text label1 = new Text(120, 300,"project-20%");
        label1.setFont(font);
        pane.getChildren().add(label1);

        Text label2 = new Text(50, 260,"quiz-10%");
        label2.setFont(font);
        pane.getChildren().add(label2);

        Text label3 = new Text(190, 200,"midterm-30%");
        label3.setFont(font);
        pane.getChildren().add(label3);

        Text label4 = new Text(260, 140,"final-40%");
        label4.setFont(font);
        pane.getChildren().add(label4);

        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Grade Chart");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
