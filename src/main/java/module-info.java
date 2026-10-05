module com.example.gestorproductosfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestorproductosfx to javafx.fxml;
    exports com.example.gestorproductosfx;
}