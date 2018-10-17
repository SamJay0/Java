package librarycataloque;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SamJay
 */
public class LibraryCataloque {

    Map<String, Book> bookCollection = new HashMap<>();
    int currentDay = 0;
    int lengthOfCheckOutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;

    public LibraryCataloque(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCataloque(Map<String, Book> collection, int lengthOfCheckOutPeriod,
            double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckOutPeriod = lengthOfCheckOutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    //getters
    public int getCurrentDay() {
        return this.currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckOutPeriod() {
        return this.lengthOfCheckOutPeriod;
    }

    public double getInitialLateFee() {
        return this.initialLateFee;
    }

    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }

    //setters
    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    //INSTANCE METHODS
    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.isCheckedOut) {
            SorryBookAlreadyCheckedOut(book);
        } else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out" + title
                    + "it's due on day " + (getCurrentDay() + getLengthOfCheckOutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - ((book.getDayCheckedOut() + getLengthOfCheckOutPeriod()));
        if (daysLate > 0) {
            System.out.println("You owe the Library $" + (getInitialLateFee() + daysLate * getFeePerLateDay())
                    + "because your book is " + daysLate + " days overdue. ");
        } else {
            System.out.println("Book returned .Thank you");
        }
        book.setIsCheckedOut(false, -1);
    }

    public void SorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is alraedy "
                + "checked out .It should be back on day " + (book.getDayCheckedOut() + getLengthOfCheckOutPeriod()) + ".");
    }

    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter", 732, 7298);
        bookCollection.put("Harry Porter", harry);
        LibraryCataloque lib = new LibraryCataloque(bookCollection);
        lib.checkOut("Harry Porter");
        lib.nextDay();
        lib.nextDay();
         lib.checkOut("Harry Porter");
         lib.setDay(17);
        lib.returnBook("Harry Porter");

    }

}
