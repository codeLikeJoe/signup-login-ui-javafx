module com.example.project_calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_calculator to javafx.fxml;
    exports com.example.project_calculator;
}