package class11;

public class BookTest {
    public static void main(String[] args) {
        Book[] bookArray = new Book[3];

        bookArray[0] = new Book("SQL Plus", 50000, 5);
        bookArray[1] = new Book("Java 2.0", 40000, 3);
        bookArray[2] = new Book("JSP Servlet", 60000, 6);

        for (int i = 0; i < bookArray.length; i++) {
            Book book = bookArray[i];
            System.out.println(book.getBookName() + " " + book.getBookPrice() + "원 " + book.getBookDiscountRate() + "%");
        }

        int totalPrice = 0;
        for (int i = 0; i < bookArray.length; i++) {
            Book book = bookArray[i];
            totalPrice += book.getBookPrice();
        }

        double totalDiscountedPrice = 0;
        for (int i = 0; i < bookArray.length; i++) {
            Book book = bookArray[i];
            totalDiscountedPrice += book.getDiscountBookPrice();
        }

        System.out.println("책 가격의 합: " + totalPrice + "원");
        System.out.println("할인 된 책 가격의 합: " + totalDiscountedPrice + "원");
    }
}
