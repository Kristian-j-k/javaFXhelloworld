package dk.kk.javafxhelloworld;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello Java ");
    }
    @FXML
    protected void onHejButtonClick() {
        welcomeText.setText("Hello Datamatiker");
    }
}