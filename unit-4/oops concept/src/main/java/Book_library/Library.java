package Book_library;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Library {
   static ArrayList<Publications> list=new ArrayList<Publications>();
    public static void addJournal(String name,int noofpages,String publisher,int price,String writer){
        Publications journal=new Journal( name, noofpages,publisher, price, writer);
        list.add(journal);
    }
    public static  void addBook(String name,int noofpages,String publisher,int price,String Author){
        Publications book1= new Books(name, noofpages,publisher, price,Author);
        list.add(book1);
    }
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Library.addBook("Book1", 100,"falcon",200,"Author1");
        Library.addBook("Book2", 150,"falcon2",400,"Author2");
        Library.addBook("Book3", 250,"falcon2",300,"Author3");
        Library.addJournal("Journal1",10,"publisher1", 50,"writer1");
        Library.addJournal("Journal2",20,"publisher2", 80,"writer2");
     //   System.out.println(list);

        //Publications Journal =new Journal("journal1",10,"Publisher_journal1",300,"John");
    }
}
