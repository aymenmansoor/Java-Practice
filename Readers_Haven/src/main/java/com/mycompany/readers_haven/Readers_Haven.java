package com.mycompany.readers_haven;
import java.util.*;
public class Readers_Haven {
     private static String[] bookCatalog = new String[100];
    private static int bookCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWelcome to Readers' Haven!");
            System.out.println("--------------------------------");
            System.out.println("1. Display Current Book Catalog");
            System.out.println("2. Add a New Book to the Catalog");
            System.out.println("3. Remove a Book from the Catalog");
            System.out.println("4. Exit the Program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayCatalog();
                    break;
                case 2:
                    addBook(scanner);
                    break;
                case 3:
                    removeBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void displayCatalog() {
        System.out.println("\nCurrent Book Catalog:");
        System.out.println("------------------------");

        if (bookCount == 0) {
            System.out.println("No books in the catalog.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println((i + 1) + ". " + bookCatalog[i]);
            }
        }

        System.out.println();
    }

    private static void addBook(Scanner scanner) {
        if (bookCount < 100) {
            System.out.print("Enter the name of the book to add: ");
            String bookName = scanner.nextLine();

            for (int i = 0; i < bookCount; i++) {
                if (bookCatalog[i].equals(bookName)) {
                    System.out.println("Book already exists in the catalog.");
                    return;
                }
            }

            bookCatalog[bookCount] = bookName;
            bookCount++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Catalog is full. Cannot add more books.");
        }
    }

    private static void removeBook(Scanner scanner) {
        System.out.print("Enter the name of the book to remove: ");
        String bookName = scanner.nextLine();

        for (int i = 0; i < bookCount; i++) {
            if (bookCatalog[i].equals(bookName)) {
                bookCatalog[i] = bookCatalog[bookCount - 1];
                bookCount--;
                System.out.println("Book removed successfully!");
                return;
            }
        }

        System.out.println("Book not found in the catalog.");
    }
}
