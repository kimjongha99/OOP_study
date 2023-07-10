package arrayOfObjects;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = new Book[5];


        for (int i = 0; i < books.length; i++) {
            Book book =new Book();

            book.setTitle("홍길동전" + i);
            book.setAuthor("조정래");

            books[i]= book;
        }


        for (int i = 0; i < books.length; i++) {
            System.out.println( books[i].getTitle() + " 의작가 " + books[i].getAuthor());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            books[i].BookInfo();
        }
       books[3].BookInfo();
    }
}
