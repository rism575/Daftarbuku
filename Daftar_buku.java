import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        ArrayList<Book> bookList = new ArrayList<>();

        // Adding books to the library
        bookList.add(new Book("The good earth", "Pearl S.Buck", "Washington Square Press,New york", "2", "2004"));
        bookList.add(new Book("The alchemist", "Paulo Coelho", "HarperFrancisko", "3", 1993));
        bookList.add(new Book("Dasar pemrograman robot menggunakan arduino", "Abdul Qodir", "Andi publisher", "1", "13 Marc 2019"));

        while (true) {
            System.out.println("======================================================================================");
            System.out.println("1. Menambahkan buku baru");
            System.out.println("2. Daftar semua buku");
            System.out.println("3. Menghitung kesediaan buku dengan kategori ");
            System.out.println("4. keluar");
            System.out.println("======================================================================================");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the new line character

            switch (choice) {
                case 1:
                    System.out.print("Enter the title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Enter the category: ");
                    int category = scanner.nextInt();
                    System.out.print("Enter the year: ");
                    int year = scanner.nextInt();
                    bookList.add(new Book(Judul, Penulis, Penerbit, kategori, tahun));
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case
