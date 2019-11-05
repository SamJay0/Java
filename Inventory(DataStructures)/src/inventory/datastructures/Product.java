/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package inventory.datastructures;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author samjay
 */
public class Product {

    String name;
    String desc;
    double price;
    int qtyOnHand;
    int minOrderQty;
    int quantityOrdered;
    private Scanner in = new Scanner(System.in);

    //default constructor
    public Product() {
        this.name = setName();
        this.desc = setDesc();
        try {
            this.price = setPrice();
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("\t oops!check price!");
        }
        RandomNumberGenerator randomgen = new RandomNumberGenerator();
        //generate qty on hand
        this.qtyOnHand = randomgen.setMaxValue();
        //generate random number for min OrderQuantity
        this.minOrderQty = randomgen.setMinValue();
    }

    /*
     *setters
     */
    //set productName
    private String setName() {
        System.out.print("Enter productName: ");
        return in.nextLine();
    }

    //set description
    private String setDesc() {
        System.out.print("Enter product Description: ");
        return in.nextLine();
    }

    //sePrice
    private int setPrice() {
        System.out.print("Enter price: ");
        return in.nextInt();
    }

    //set quantity ordered
    public void setQuantityOrdered() {
        System.out.print("Enter quantity: ");
        this.quantityOrdered = in.nextInt();
     
    }
    
    //update Quantity
    public void updateQuantity(int quantity){
        this.qtyOnHand=quantity;
    }

    //getters
    public int getQuantityOrdered() {
        return this.quantityOrdered;
    }

    public String getName() {
        return this.name;
    }

    public String getDesc() {
        return this.desc;
    }

    public double getPrice() {
        return this.price;
    }

    public int getMinOrderQuantity() {
        return this.minOrderQty;
    }

    public int getQuantityAtHand() {
        return this.qtyOnHand;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#0.00");
        return "\tProductName: " + name + " \n\tDescription: " + desc + " \n\tPrice KSh " + format.format(price)
                + "\n\tQuantityOnHand: " + qtyOnHand + " items \n\tminOrder: " + minOrderQty + " items\n";
    }

}
