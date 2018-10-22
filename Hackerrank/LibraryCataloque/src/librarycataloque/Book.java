package librarycataloque;
/**
 * @author SamJay
 */
public class Book {
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;//whether or not book is checked out
    int dayCheckedOut=-1;
    
    public Book(String bookTitle,int bookPageCount,int bookISBN){
        this.title=bookTitle;
        this.pageCount=bookPageCount;
        this.ISBN=bookISBN;
        isCheckedOut=false;
    }
    
    
    /*
    *getters
    */
    
    public String getTitle(){
        return this.title;
    }
    
    public int  getPageCount(){
        return this.pageCount;
    }
    
    public int getISBN(){
        return this.ISBN;
    }
    
    public boolean getIsCheckedOut(){
        return true;
    }
    
    public int getDayCheckedOut(){
        return this.dayCheckedOut;
    }
    /*
    *setters
    */
    
    public void setIsCheckedOut(boolean newIsCheckedOut,int currentDayCheckedOut){
        this.isCheckedOut=newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }
    //can not be called outside from the class
    private void setDayCheckedOut(int day){
        this.dayCheckedOut=day;
    }
    public void setNew(){
    }
            

}
