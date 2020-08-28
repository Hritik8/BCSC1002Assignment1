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

    //getter and setter
    public Book[] getBooksAvailable() {
        return booksAvailable.clone();
    }
    public void setBooksAvailable(Book[] booksAvailable) {
        this.booksAvailable = booksAvailable;
    }
    //Constructor
    public Library(Book[] booksAvailable) {
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
}
