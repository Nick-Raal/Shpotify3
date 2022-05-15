import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.application.Application;

import java.net.URL;


public class Main extends Application{
    public static void main(String args[]){
        launch(args);
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Shpotify 3");

        //WebView webView = new WebView();
        //webView.getEngine().load("https://www.youtube.com/embed/P6bVl47kdNk");
        Text t = new Text(480, 300, "Shpotify 3");
        t.setFill(Color.GREEN);
        Group root = new Group(t);
        Scene scene = new Scene(root, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    public static void switch(URL url){
//        //there'll probably be a call to shiron's verification code here
//    }
}
