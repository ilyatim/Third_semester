package prackt_7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main {

   /* @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("myStyle.css").toExternalForm();

        scene.getStylesheets().add(css);
        primaryStage.setScene(scene);
        primaryStage.show();
    }*/

    public static void main(String[] args)
    {
        Game game = new Game();
        //launch(args);
    }
}
