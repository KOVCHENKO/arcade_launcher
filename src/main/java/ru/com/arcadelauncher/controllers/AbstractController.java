package ru.com.arcadelauncher.controllers;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.SpringLoader;

public class AbstractController implements Controller {
    private Node view;
    private Stage stage;

    Controller runController(String formName) {
        Controller controller = SpringLoader.loadControllerFxml("/fxml/" + formName + ".fxml");
        Stage stage = new Stage();
        Scene scene = new Scene((Parent) controller.getView());
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setMaximized(true);
        stage.show();
        return controller;
    }

    @Override
    public Node getView() {
        return view;
    }

    @Override
    public void setView(Node view) {
        this.view = view;
    }

    @Override
    public Stage getStage() {
        return stage;
    }

    @Override
    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
