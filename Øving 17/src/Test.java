import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/*
I extend Application because it contains all the functoins i need
and implement EventHandler ( implements EventHandler<ActionEvent>) because whenever you want to handle user
events you must implement it
 */
public class Test extends Application  {

    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click me");

        button2= new Button();
        button2.setText("Barcelona");
        /* setOnAction
        it is like i say whenever you are trying to handle the button
        click just look in this for the handle and you'll find it

         */
        // this class will handle the button event
        button.setOnAction(event -> System.out.println("I am an anonymous inner class "));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /*@Override
    // handle is a method that be called whenever the user click the button
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("I love it when you touch me there");
        }
        if(event.getSource()==button2){
            System.out.println("I,am barcelona fans");

        }
    }
    */
}