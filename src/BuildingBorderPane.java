
import  javafx.application.Application;
import  javafx.geometry.Insets;
import  javafx.scene.Scene;
import  javafx.scene.control.Label;
import  javafx.scene.layout.BorderPane;
import  javafx.scene.layout.StackPane;
import  javafx.scene.image.Image;
import  javafx.scene.image.ImageView;
import  javafx.stage.Stage;



public class BuildingBorderPane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        pane.setTop(new CustomPane("Jamestown: Applied Technologies"));
        ImageView imgpic = new ImageView(new Image("at_ext_back.png"));
        pane.setCenter(imgpic);
        double latitude = 34.2123445;
        double longitude = -79.000023;
        pane.setBottom(new CustomPane("Latitude: " + latitude + " Longitude: " + longitude));

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Show Building");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
class CustomPane extends StackPane {
        public CustomPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color: black");
        setPadding(new Insets(11.5,12.5, 13.5, 14.5));

    }
}