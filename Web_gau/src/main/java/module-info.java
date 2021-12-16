module com.example.web_gau {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.web_gau to javafx.fxml;
    exports com.example.web_gau;
}