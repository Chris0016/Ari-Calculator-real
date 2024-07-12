module com.hellofx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.hellofx to javafx.fxml;
    exports com.hellofx;
}
