package test;

import java.util.Scanner;

/**
 * @author SamJay
 */
public class Book {
 Scanner in=new Scanner(System.in);
  String title;
  int pages;
  double price;
  public Book(){
      System.out.print("Enter title: ");
      this.title=in.nextLine();
      System.out.print("Enter pages: ");
      this.pages=in.nextInt();
      System.out.print("Enter price: ");
      this.price=in.nextDouble();
  }
 @Override
  public String toString(){
      return "\n\tTitle: "+this.title+"\n\tpages: "+this.pages+"\n\tprice: "+this.price;
  }

}
