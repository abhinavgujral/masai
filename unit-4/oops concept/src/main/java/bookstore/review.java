package bookstore;

public class review {

        private int book_id=0;
        private String description="";
        private int rating=0;

        public review(int id,String description,int rating){
            this.book_id=id;
            this.description=description;
            this.rating=rating;

    }
    public String toString(){
            return String.format("id:%d description: %s rating:%s\n",book_id,description,rating);
    }
}
