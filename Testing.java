import javafx.application.Application;
import javafx.scene.web.WebView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Testing extends Application{
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
