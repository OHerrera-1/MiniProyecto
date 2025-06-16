module com.example.miniproyecto_2025 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniproyecto_2025 to javafx.fxml;
    exports com.example.miniproyecto_2025;
}