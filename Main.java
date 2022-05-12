import javafx.scene.Scene;
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

        webView.getEngine().load("https://www.youtube.com/embed/1cGmWPI5TaI");
        VBox vbox = new VBox(webView);
        Scene scene = new Scene(vbox, 960, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
