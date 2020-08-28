/*  Created by IntelliJ IDEA.
 *  User: Hritik Ranjan(191500352)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

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
}
