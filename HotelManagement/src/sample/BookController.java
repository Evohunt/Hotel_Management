package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BookController {

    public Label btn_home;
    public Label btn_rooms;
    public Label btn_book;
    public Label btn_exit;
    public AnchorPane panel_bg;
    public DatePicker date_in;
    public DatePicker date_out;
    public TextField customer_name;
    public TextField customer_email;
    public TextField customer_phone;
    public TextField customer_adults_number;
    public TextField customer_children_number;
    public Button book_submit;

    public void HomeMouseEnter(MouseEvent mouseEvent) {
        btn_home.setStyle("-fx-border-color: white");
    }

    public void HomeMouseExit(MouseEvent mouseEvent) {
        btn_home.setStyle("-fx-border-color: transparent");
        btn_home.setStyle("-fx-background-color: #28056b");
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
        btn_book.setStyle("-fx-background-color: #3a0096");
    }

    public void btnExit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void ExitMouseEnter(MouseEvent mouseEvent) {
        btn_exit.setStyle("-fx-border-color: white");
    }

    public void ExitMouseExit(MouseEvent mouseEvent) {
        btn_exit.setStyle("-fx-border-color: transparent");
        btn_exit.setStyle("-fx-background-color:  #350187");
    }

    public void btnHomeChangeScene(MouseEvent mouseEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        Scene mainScene = new Scene(root);

        Stage mainWindow = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        mainWindow.setScene(mainScene);
        mainWindow.show();

    }

    public void btnRoomsChangeScene(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Rooms.fxml"));

        Scene roomsScene = new Scene(root);

        Stage aboutWindow = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        aboutWindow.setScene(roomsScene);
        aboutWindow.show();
    }

    public void btnBookSubmit(ActionEvent actionEvent) {

        Customer customer = new Customer(customer_name.getText(),
                                         customer_email.getText(),
                                         customer_phone.getText(),
                                         date_in,
                                         date_out,
                                         Integer.parseInt(customer_adults_number.getText()),
                                         Integer.parseInt(customer_children_number.getText()));

        CustomerSerializer ser = new CustomerSerializer();
        ser.serialize(customer, "customer.ser");

        ///customer_name.setText(date_in.getEditor().getText());

    }
}
