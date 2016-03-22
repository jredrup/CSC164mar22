package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


//handlers implemented as external classes

public class Main extends Application {
    Button btnUp;
    Button btnDown;
    public void start(Stage primaryStage) throws Exception {
        VBox pane = new VBox(10);

        pane.setPadding(new Insets(20, 50, 20, 50));
        btnUp = new Button("UP");
        btnUp.setPrefWidth(100);
        //UpButtonHandlerClass ubh = new UpButtonHandlerClass();
        btnUp.setOnAction(new Handler());
        /*btnUp.setOnAction(e -> { //links the button with the handler
                    //System.out.println("Up Button Pressed");
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Button Press Detected");
                    a.setHeaderText(null);
                    a.setContentText("Going Up");
                    a.showAndWait();
                });

*/
        btnDown = new Button ("DOWN");
        btnDown.setPrefWidth(100);
        btnDown.setOnAction(new Handler());
        //DownButtonHandlerClass dbh = new DownButtonHandlerClass();
        /*btnDown.setOnAction(event -> {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("Going Down");
                    a.showAndWait();


                });
*/
        pane.getChildren().addAll(btnUp, btnDown);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("UP/DOWN");
        primaryStage.show();
    }
    class Handler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setTitle("Button Press Detected");
            a.setHeaderText(null);
            a.setContentText ((event.getSource() == btnUp) ? "Going Up" : "Going Down");

            a.showAndWait();
        }
    }
}

//class UpButtonHandlerClass implements EventHandler<ActionEvent> {
/*
    @Override
    public void handle(ActionEvent event) {
        //System.out.println("Up Button Pressed");
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Button Press Detected");
        a.setHeaderText(null);
        a.setContentText("Going Up");
        a.showAndWait();

    }
}
*/

//class DownButtonHandlerClass implements EventHandler<ActionEvent> {


/*
    @Override
    public void handle(ActionEvent event) {
        //System.out.println("Down Button Pressed");
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Going Down");
        a.showAndWait();

    }
}
*/

