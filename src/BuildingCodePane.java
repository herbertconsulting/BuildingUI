
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class BuildingCodePane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(getHBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Building Code");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private HBox getHBox() {
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setStyle("-fx-background-color: #9AEDEB");


        Button[] buildings = {new Button("AT"), new Button ("DH"), new Button ("JWH"), new Button ("HH"),
                new Button ("SH"), new Button ("BH"), new Button ("AB"), new Button ("CO")};

        for (Button building: buildings) {
            HBox.setMargin(building, new Insets(0, 0, 0, 0));
            hBox.getChildren().addAll(building);
        }
        return hBox;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
