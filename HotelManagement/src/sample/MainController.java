package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    public Label btn_home;
    public Label btn_rooms;
    public Label btn_book;
    public Label btn_exit;
    public AnchorPane panel_bg;


    public void HomeMouseEnter(MouseEvent mouseEvent) {
        btn_home.setStyle("-fx-border-color: white");
    }

    public void HomeMouseExit(MouseEvent mouseEvent) {
        btn_home.setStyle("-fx-border-color: transparent");
        btn_home.setStyle("-fx-background-color: #3a0096");
    }

    public void RoomsMouseEnter(MouseEvent mouseEvent) {
        btn_rooms.setStyle("-fx-border-color: white");
    }

    public void RoomsMouseExit(MouseEvent mouseEvent) {
        btn_rooms.setStyle("-fx-border-color: transparent");
        btn_rooms.setStyle("-fx-background-color: #28056b");
    }

    public void BookMouseEnter(MouseEvent mouseEvent) {
        btn_book.setStyle("-fx-border-color: white");
    }

    public void BookMouseExit(MouseEvent mouseEvent) {
        btn_book.setStyle("-fx-border-color: transparent");
        btn_book.setStyle("-fx-background-color: #28056b");
    }

    public void btnExit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void ExitMouseEnter(MouseEvent mouseEvent) {
        btn_exit.setStyle("-fx-border-color: white");
    }

    public void ExitMouseExit(MouseEvent mouseEvent) {
        btn_exit.setStyle("-fx-border-color: transparent");
        btn_exit.setStyle("-fx-background-color: #350187");
    }

    public void btnRoomsChangeScene(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Rooms.fxml"));

        Scene roomsScene = new Scene(root);

        Stage aboutWindow = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        aboutWindow.setScene(roomsScene);
        aboutWindow.show();
    }

    public void btnBookChangeScene(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Book.fxml"));

        Scene bookScene = new Scene(root);

        Stage bookWindow = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        bookWindow.setScene(bookScene);
        bookWindow.show();
    }
}
