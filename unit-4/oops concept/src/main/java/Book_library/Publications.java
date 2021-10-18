package Book_library;

abstract  public class Publications {
    private int noOfPages;
    private int price;
    private  String publisherName;

    Publications(int noOfPages,int price, String publisherName)
    {
        this.noOfPages=noOfPages;
        this.price=price;
        this.publisherName=publisherName;

    }

    @Override
    public String toString() {
        return
                "\nnoOfPages=" + noOfPages +
                "\nprice=" + price +
                "\npublisherName=" + publisherName+"\n";
    }
}
