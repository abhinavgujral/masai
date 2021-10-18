package bookstore;

import java.sql.SQLOutput;

public class Book_runner {
    public static void main(String[] args) {
        books b1= new books(1,"java","john");
        b1.addreview(1,"good",4);
        b1.addreview(2,"great",4);
        System.out.println(b1);
    }
}









