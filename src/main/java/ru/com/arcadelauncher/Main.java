package ru.com.arcadelauncher;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ru.com.arcadelauncher.controllers.MainController;
import util.SpringLoader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stageMain = new Stage();
        MainController controller = (MainController) SpringLoader.loadControllerFxml("/fxml/main.fxml");
        Scene scene = new Scene((Parent) controller.getView());
        scene.getStylesheets().addAll(this.getClass().getResource("/css/style.css").toExternalForm());
        stageMain.initStyle(StageStyle.UNDECORATED);
        stageMain.setScene(scene);
//        stageMain.setMaximized(true);

        stageMain.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
