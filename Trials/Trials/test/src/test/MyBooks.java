package test;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class MyBooks {
    public static void buyBook(Book[] books,String mytitle){
        for(int i=0;i<books.length;i++){
            if(books[i].title.equals(mytitle)){
                books[i]=null;
            }
        }
    }

    public static void view(Book[] books) {
        String s="";
        for (int i=0;i<books.length;i++) {
            if(books[i]==null){
                 s=" ";
            }
            else{
                s=books[i].toString();
            }
            System.out.println(s);
            
        }

    }

    public static void main(String[] args) {
        ListOfBooks booklist = new ListOfBooks();
        Scanner in = new Scanner(System.in);

        boolean getBook = true;
        int count = 0;
        while (count < booklist.myBooks.length) {

            booklist.myBooks[count] = new Book();

            System.out.print("Enter Y to continue and any other letter to Exit: ");
            char choice = in.next().charAt(0);
            if (!(choice == 'Y')) {
                System.out.println("You just Exited :enter 1 to view books");
                char choicee = in.next().charAt(0);
                if (choicee == '1') {
                    view(booklist.myBooks);
                } else {
                    System.out.println("invalid choice");
                }

                return;
            }
            count++;
        }
        System.out.println("\n\tOops!!That's the maximum");
//        for (Book myBook : booklist.myBooks) {
//            System.out.println(myBook);
//        }
        System.out.println("enter 1 to view books");
        char choice = in.next().charAt(0);
        if (choice == '1') {
            view(booklist.myBooks);
        } else {
            System.out.println("invalid choice");
        }
        System.out.println("enter R to remove book");
        char choiceee=in.next().charAt(0);
        if(choiceee=='R'){
            buyBook(booklist.myBooks,"River");
        }
        
        System.out.println("enter 1 to view books");
        char choiceeee = in.next().charAt(0);
        if (choiceeee == '1') {
            view(booklist.myBooks);
        } else {
            System.out.println("invalid choice");
        }
        
    }

}
