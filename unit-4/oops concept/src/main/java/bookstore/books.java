package bookstore;

import java.util.ArrayList;
import java.util.List;

public class books {

        private int id;
        private String name;
        private String author;
       ArrayList<review> list=new ArrayList<review>() ;

        public books(int id, String name, String author){
            this.id=id;
            this.name=name;
            this.author=author;
        }
        public void addreview(int id,String descript ,int rating ){
            review review1=new review(id,descript,rating);
            list.add(review1);

        }
        public  String toString(){
            return String.format("book name: %s\nbook id: %d\nauthor: %s\n list:"+list.toString(),name,id,author);

        }



}
