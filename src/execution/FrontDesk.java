/*  Created by IntelliJ IDEA.
 *  User: Hritik Ranjan(191500352)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    //fields
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_OF_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiceInput;
        Library myLibrary = new Library();
        String bookName;
        do {
            System.out.println("-=-=--=-=-" + "Welcome To The Front Desk" + "-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issued books.");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            choiceInput = scanner.nextInt();
            switch (choiceInput) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the book you want to issue");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.doIssue(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    myLibrary.doReturn(bookName);
                    break;
                case LIST_OF_BOOKS:
                    myLibrary.listOfBooks();
                    break;
                default:
                    break;
            }
        } while (choiceInput != EXIT);
        scanner.close();
    }
}
