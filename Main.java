import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.application.Application;


public class Main extends Application{
    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("test");

        WebView webView = new WebView();
        webView.getEngine().load("https://www.youtube.com/embed/P6bVl47kdNk");
        VBox vbox = new VBox(webView, new Button("something"));
        Scene scene = new Scene(vbox, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
