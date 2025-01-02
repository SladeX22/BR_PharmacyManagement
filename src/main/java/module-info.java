module com.example.br_pharmacymanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.br_pharmacymanagement to javafx.fxml;
    exports com.example.br_pharmacymanagement;
}