package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage widow;
    Scene scene;
    Button button;
    ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        widow = primaryStage;
        widow.setTitle("Velg fra og til valuta");
        button= new Button("Fra valuta");

        listView=new ListView<>();
        listView.getItems().addAll("Euro","US Dollar");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        VBox layot = new VBox(10);
        layot.setPadding(new Insets(20,20,20,20));
        layot.getChildren().addAll(listView,button);


        scene= new Scene(layot,300,250);
        widow.setScene(scene);
        widow.show();
    }

}
