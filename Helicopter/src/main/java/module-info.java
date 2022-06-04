module com.example.helicopter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helicopter to javafx.fxml;
    exports com.example.helicopter;
}