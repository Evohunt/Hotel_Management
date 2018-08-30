package sample;

import javafx.scene.control.DatePicker;

import java.util.Date;

public class Customer {

    private String name;
    private String email;
    private String phone;
    private DatePicker check_in_date;
    private DatePicker check_out_date;
    private int adults_number;
    private int children_number;

    public Customer(String name, String email, String phone,
                    DatePicker check_in_date, DatePicker check_out_date,
                    int adults_number, int children_number) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.check_in_date = check_in_date;
        this.check_out_date = check_out_date;
        this.adults_number = adults_number;
        this.children_number = children_number;
    }
}
