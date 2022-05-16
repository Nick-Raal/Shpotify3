import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.application.Application;

import java.net.URL;


public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Shpotify 3");

        WebView webView = new WebView();
        webView.getEngine().load("https://www.youtube.com/embed/4kAevo9J_jo");
        Text t = new Text(8, 48, "Shpotify 3 - Bigger, Better, Stronger, Faster");
        t.setStyle("-fx-font: 48 arial;");
        t.setFill(Color.grayRgb(135));
        BorderPane root = new BorderPane();
        root.setTop(t);
        root.setCenter(webView);
        Scene scene = new Scene(root, 960, 600);
        scene.setFill(Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    public static void switch(URL url){
//        //there'll probably be a call to shiron's verification code here
//    }
}
