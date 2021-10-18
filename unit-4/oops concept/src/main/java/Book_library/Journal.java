package Book_library;

public class Journal extends Publications{

private String NameOfJournal ,writer;

    Journal(String name,int noofpages,String publisher,int price,String writer){
        super(noofpages,price,publisher);
        this.NameOfJournal=name;
        this.writer=writer;

    }

    @Override
    public String toString() {
        return
                "\nNameOfJournal='" + NameOfJournal +
                "\n writer='" + writer +super.toString();
    }
}
