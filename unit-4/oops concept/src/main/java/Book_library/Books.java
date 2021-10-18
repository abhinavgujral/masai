package Book_library;

public class Books extends Publications{
    private String NameOfBook;
    private String Author;
    Books(String name,int noofpages,String publisher,int price,String Author){
        super(noofpages,price,publisher);
        this.NameOfBook=name;
        this.Author=Author;
    }

    @Override
    public String toString() {
        return "\nNameOfBook=" + NameOfBook +
                "\nAuthor=" + Author
                +super.toString();
    }
}
