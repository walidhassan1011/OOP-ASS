module com.example.ass5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ass5 to javafx.fxml;
    exports com.example.ass5;
}