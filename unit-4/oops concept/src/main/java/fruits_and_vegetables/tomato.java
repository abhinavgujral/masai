package fruits_and_vegetables;

import java.sql.SQLOutput;

public class tomato implements Fruit,Vegetables{
    @Override
    public void hasaroot() {
        System.out.println("has root");
    }

    @Override
    public void hasapeel() {
        System.out.println("has a peel");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
