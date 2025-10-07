package application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Joao", "joao@gmail.com", LocalDate.parse("09/09/2009", dtf), 2500.0, obj);


        System.out.println(obj);
        System.out.println(seller);
    }
}
