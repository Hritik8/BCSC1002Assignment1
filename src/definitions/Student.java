/*  Created by IntelliJ IDEA.
 *  User: Hritik Ranjan(191500352)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    //fields
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] booksIssued;

    //Constructor
    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Student(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public Student(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Student(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

    //getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(Book[] booksIssued) {
        this.booksIssued = booksIssued;
    }

    //toString() method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", booksIssued=" + Arrays.toString(booksIssued) +
                '}';
    }

    //equals() and hashCode() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(middleName, student.middleName) &&
                Objects.equals(lastName, student.lastName) &&
                Arrays.equals(booksIssued, student.booksIssued);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, middleName, lastName, universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(booksIssued);
        return result;
    }
}
