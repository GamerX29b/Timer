import java.util.Date;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Timer extends Application {


        @Override
        public void start(Stage stage) throws Exception {
            String fxmlFile = "/fxml/hell.fxml";
            FXMLLoader loader = new FXMLLoader();
            Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
            stage.setTitle("Timer");
            stage.setScene(new Scene(root));
            stage.show();
    }

    public static void main(String[] args){

        launch(args);

        TimeThis th = new TimeThis();
        Date dammit = th.getTime();
    }
}
