
public class KidUsers implements Library_User{

    //int age;
    //String BookType;

    public KidUsers(int age, String bookType) {
        //this.age = age;
        //BookType = bookType;
        System.out.println(registerAccount(age));
        if(age<12)
        System.out.println(requestBook(bookType));
    }

    @Override
    public String registerAccount(int age) {
        if(age<0)
            return "Invalid entry check age";
        else if(age>0&&age<12)
            return "You have successfully registered under a Kids Account";
        else
            return "Sorry, Age must be less than 12 to register as a kid";
    }

    @Override
    public String requestBook(String bookType) {
        if(bookType=="Kids") {
            return "Book Issued successfully, please return the book within 10 days";
        }
            else
                return "Oops, you are allowed to take only kids books";
        }

    }

