
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuildingNames extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(getVBox());

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Building Names");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
    private VBox getVBox() {
        VBox vBox = new VBox((10));
        vBox.setPadding(new Insets(10, 5,5, 5  ));
        vBox.setStyle("-fx-background-color: #E7D7C6");
        vBox.getChildren().add(new Label("Buildings"));

        Label[] buildings = {new Label("Applied Technology"), new Label ("Davis Hall"), new Label ("James Williams Hall"), new Label ("Hassell Health"),
                new Label ("Science Hall"), new Label ("Business Hall"), new Label ("Auto Body"), new Label ("Cline Observatory")};

        for (Label building : buildings) {
            VBox.setMargin(building, new Insets(0, 0, 0, 10));
            vBox.getChildren().add(building);
        }
        return vBox;
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

