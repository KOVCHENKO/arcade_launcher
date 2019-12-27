package ru.com.arcadelauncher;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.com.arcadelauncher.controllers.MainController;
import util.SpringLoader;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Stage stageMain = new Stage();
        MainController controller = (MainController) SpringLoader.loadControllerFxml("/fxml/main.fxml");
        Scene scene = new Scene((Parent) controller.getView());
        stageMain.setScene(scene);
        stageMain.setMaximized(true);

        stageMain.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
