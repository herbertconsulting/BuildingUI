import javafx.application.Application;

/**
 * Herb Everett
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
        hBox.setStyle("-fx-background-color: gray");
//        hBox.getChildren().add(new String("Buildings"));


        Label[] buildings = {new Label("AT"), new Label ("DH"), new Label ("JWH"), new Label ("HH"),
                new Label ("SH"), new Label ("BH"), new Label ("AB"), new Label ("CO")};

        for (Label building: buildings) {
            HBox.setMargin(building, new Insets(0, 0, 0, 0));
            hBox.getChildren().addAll(building);
        }
        return hBox;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
