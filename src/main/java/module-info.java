module com.example.zehrademoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zehrademoapp to javafx.fxml;
    exports com.example.zehrademoapp;
}