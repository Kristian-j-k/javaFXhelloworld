module dk.kk.javafxhelloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.kk.javafxhelloworld to javafx.fxml;
    exports dk.kk.javafxhelloworld;
}