import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Stage window;
    Scene scene1,scene2;
    @Override
    public void start(Stage primaryStage) throws Exception {
        window= primaryStage;

        // label is a little chuck of text
        Label label1= new Label("Here we go");
        Button button1= new Button("Log in / scene 1");
        button1.setOnAction(event ->  window.setScene(scene2));
        // Vbox will stack all the objects on top of each other
        // Layout 1
        VBox layout1= new VBox(50);
        layout1.getChildren().addAll(label1,button1);
        // Button 2
        scene1= new Scene(layout1,200,200);
        Button button2= new Button("Please Click here");
        button2.setOnAction(event ->  window.setScene(scene1));
        // layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2= new Scene(layout2,400,350);

        window.setScene(scene1);
        window.setTitle("Monpoly team12");
        window.show();
    }
}
