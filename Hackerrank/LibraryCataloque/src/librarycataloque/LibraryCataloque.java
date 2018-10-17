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
    
    public Book getBook(String bookTitle){
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
    public void nextDay(){
        currentDay++;
    }
    
    public void setDay(int day){
        currentDay=day;   
    } 
    
    //INSTANCE METHODS
    public void checkOut(String title){
        Book book=getBook(title); 
        if(book.isCheckedOut){
           SorryBookAlreadyCheckedOut(book);
        }
        else{
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out"+title
                    +"it's due on"+(getCurrentDay()+getLengthOfCheckOutPeriod())+".");
        }
    }
    public void returnBook(){
    }
    public void SorryBookAlreadyCheckedOut(Book book){
    }

    public static void main(String[] args) {

    }

}
