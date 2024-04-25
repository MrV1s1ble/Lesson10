import java.util.Scanner;

public class Main {
    static String booksInfo = "";

//    Добавить в программу метод, который будет в информацию о книге добавлять: 
//    Название книги, кол-во страниц, цену книги в рублях. 
//    Если у книги нет цены, то надо писать “не установлено”.

    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int price = inputPrice();
            addBook(name);
            addBook(name, pageCount);
            addBook(name, pageCount, price);
            printInfo();
        }
    }


    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static int inputPrice() {
        System.out.println("Введите стоимость книги:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, pageCount, 0);
    }

    private static void addBook(String bookName, int pageCount, int price) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр. Стоимость книги: "
                + (price > 0 ? price : "не установлено") + " руб.";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }
}
