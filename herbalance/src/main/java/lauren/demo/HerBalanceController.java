package lauren.herbalance;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HerBalanceController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}