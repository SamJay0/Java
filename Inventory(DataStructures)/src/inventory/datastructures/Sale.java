/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package inventory.datastructures;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author samjay
 */
//This class is responsible for facilitating the main functioning of the program and for integrating the
//various classes together to be able to provide the required functionality for the program to run.
public class Sale {

    static ProductList prodList = new ProductList();//object of the ProductList class
    static SaleTransaction transaction = new SaleTransaction();//object of the SaleTransaction class.
    private static boolean goOn = true;
    private static Scanner in = new Scanner(System.in);

    //menu
    public static void menu() {
        System.out.print(
                "\tPress 1 to Register a product for sale\n"
                + "\tPress 2 to Buy a  product to the Cart\n"
                + "\tPress 3 to Remove a product from cart\n"
                + "\tPress 4 to View all Available Products\n"
                + "\tPress 5 to Check out\n"
                + "\tPress 6 to Get help\n"
                + "\tPress 7 to Exit\n"
                + "\nPlease enter your choice: ");

    }

    //enter choice
    public static void respondToChoice() {
//        int choice = in.nextInt();
        int choice;
        while(!in.hasNextInt()){
            in.nextLine();
            System.out.print("please enter a number between 1 and 7: ");
        }
        choice=in.nextInt();
        response(choice);
    }

    //respond to choice
    public static void response(int choice) {
        switch (choice) {
            case 1:
                register();
                break;
            case 2:
                buyProductToCart();
                break;
            case 3:
                removeProductFromCart();
                break;
            case 4:
                viewProducts();
                break;
            case 5:
                checkOut();
                break;
            case 6:
                getHelp();
                break;
            case 7:
                goOn = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Oops!");
                break;

        }
    }

    //responses
    public static void register() {
//        if (!(prodList.noProducts()) ){
//            JOptionPane.showMessageDialog(null, "Sorry!! can not exceed 5 products");
//            System.out.println();
//            return;
//        }
        System.out.print("How many Products are You registering: ");
        while(!in.hasNextInt()){
            in.nextLine();
            System.out.print("enter a number: ");
        }
        int noOfProductsBeingRegistered = in.nextInt();
        for (int i = 0; i < noOfProductsBeingRegistered; i++) {
            Product p = new Product();
            try {
                prodList.addProductToList(p);
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Only a maximum of 5 products can be registered . Could not add " + p.getName());
                return;
            }

        }
    }

    public static void buyProductToCart() {
        if (prodList.noProducts()) {
            JOptionPane.showMessageDialog(null, "No Products Yet");
            System.out.println();
            return;
        }
        try {
            System.out.print("\n\t\t------Select from -------");
            prodList.displayProducts();
            Product p = prodList.getProduct(prodList.listOfProducts, null);
            if (p == null) {
                System.out.println();
                return;
            }
            transaction.addProductsToCart(p);
            System.out.println();
        } catch (NullPointerException e) {

        }

    }

    public static void viewProducts() {
        prodList.displayProducts();
    }

    public static void removeProductFromCart() {
        try {
            transaction.removeProductFromCart();
            Product p = transaction.getProductRemoved();
            Product pp = prodList.getProduct(prodList.listOfProducts, p.getName());
            //updateQuantity
            pp.updateQuantity(pp.getQuantityAtHand() + pp.getQuantityOrdered());

        } catch (Exception e) {
        }

    }

    public static void checkOut() {
        transaction.ViewProducsInCart();
        if (!transaction.noProducts()) {
            System.out.println("\tSaleCode:"+transaction.setSaleCode());
            System.out.println(transaction.generateReceipt());
            System.out.println();
            System.out.println("\t\tTotalCost" + transaction.getTotalCost() + "\n");
        }
    }

    public static void getHelp() {
        JOptionPane.showMessageDialog(null, "Help");
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+\n"
                + "\tWelcome to the Simple Inventory Management System\n"
                + "+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+\n"
                + "\nPlease Select from the following options\n");

        while (goOn) {
            menu();
            respondToChoice();

        }

    }

}
