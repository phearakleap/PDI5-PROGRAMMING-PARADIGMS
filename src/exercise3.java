public class exercise3 {
    static class Book{

        private String title;
        private String author;
        private float price;

        Book(String title, String author, float price){
            this.title = title;
            this.author = author;
            this.price = price;
        }

        Book(){
            this.title = "NULL";
            this.author = "NULL";
            this.price = 0.0f;
        }

        public void getBook(){
            System.out.println("====================================\n");
            System.out.printf("Book Title: %s\n", this.title);
            System.out.printf("Book Author: %s\n", this.author);
            System.out.printf("Book Price: %.2f\n", this.price);
            System.out.println("\n====================================\n");
        }

    }
    public static void main(String[] args){
        
        Book book1 = new Book("The Summer You Were There", "Yuama", 13.55f);
        Book book2 = new Book("The Girl Who Fell Beneath The Sea", "Axie Oh", 8.75f);
        Book book3 = new Book();
        
        book1.getBook();
        book2.getBook();
        book3.getBook();

    }
}
