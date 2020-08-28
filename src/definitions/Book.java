/*  Created by IntelliJ IDEA.
 *  User: Hritik Ranjan (191500352)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    //fields
    private String bookName;
    private String authorName;
    private String isbnNumber;

    //getter and setter
    public String getBookName(){
        return bookName;
    }
    public void setBookName(){
        this.bookName = bookName;
    }
    public String getAuthorName(){
        return authorName;
    }
    public void setAuthorName(){
        this.authorName = authorName;
    }
    public String getIsbnNumber(){
        return isbnNumber;
    }
    public void setIsbnNumber(){
        this.isbnNumber = isbnNumber;
    }

    public Book(String bookName,String authorName,String isbnNumber) {
        this.bookName = "A Brief History Of Time";
        this.authorName = "Stephan Hawkings";
        this.isbnNumber = "23434WA34IJ8";
    }

}
