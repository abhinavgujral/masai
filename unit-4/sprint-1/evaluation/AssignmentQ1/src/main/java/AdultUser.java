public class AdultUser implements Library_User{


    public AdultUser(int age, String bookType) {

        System.out.println(registerAccount(age));
        if(age>12)
        System.out.println(requestBook(bookType));
    }

    @Override
    public String registerAccount(int age) {
        if(age<0)
            return "Invalid entry check age";
        else if(age>12)
            return "You have successfully registered under a Adult Account";
        else
            return "Sorry, Age must be greater than 12 to register as a adult";
    }

    @Override
    public String requestBook(String BookType) {

        if(BookType == "Fiction") {
            return "Book Issued successfully, please return the book within 7 days";
        }
            else
            return "Oops, you are allowed to take only adult Fiction books";
        }

    }

