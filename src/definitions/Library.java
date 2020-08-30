/*  Created by IntelliJ IDEA.
 *  User: Hritik Ranjan(191500352)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    //fields
    private Book[] booksAvailable;

    //Constructor
    public Library() {
        this.booksAvailable = new Book[5];
        for (int i = 0; i < booksAvailable.length; i++) {
            booksAvailable[i] = new Book();
        }
    }

    //getter and setter
    public Book[] getBooksAvailable() {
        return booksAvailable.clone();
    }

    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    //toString() method
    @Override
    public String toString() {
        return "Library{" +
                "booksAvailable=" + Arrays.toString(booksAvailable) +
                '}';
    }

    //equals() and hashCode() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(booksAvailable, library.booksAvailable);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(booksAvailable);
    }

    /**
     * This method will allow us to issue a book from our Library.
     *
     * @param bookName The name of the new video to be added to the store.
     */
    public void doIssue(String bookName) {
        System.out.println("\"" + bookName + "\" is now issued from the library.");
    }

    /**
     * This method will allow a user to return a book that he has issued.
     *
     * @param bookName The name of the video that the customer wants to return.
     */
    public void doReturn(String bookName) {
        System.out.println("Thank you for returning \"" + bookName + "\".");
    }

    public void listOfBooks() {
        for (Book book : this.booksAvailable) {
            System.out.println(book);
        }
    }
}
