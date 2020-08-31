package main.mainmenu.scene1.scene2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import main.Main;
import main.mainmenu.MainMenuController;

public class SecondLevelSceneController implements EventHandler<ActionEvent> {

    private SecondLevelSceneView theView;
    private SecondLevelSceneModel theModel;

    public SecondLevelSceneController() {

        this.theView = new SecondLevelSceneView();
        this.theModel = new SecondLevelSceneModel();

        this.theView.addListeners(this);
    }

    @Override
    public void handle(ActionEvent event) {
        Main.setScene(new MainMenuController().getScene());
    }

    public Scene getScene() {
        return theView.getScene();
    }
}
