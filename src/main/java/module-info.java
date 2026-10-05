module com.example.gestorproductosfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;


    opens com.example.gestorproductosfx to javafx.fxml;
    exports com.example.gestorproductosfx;
}