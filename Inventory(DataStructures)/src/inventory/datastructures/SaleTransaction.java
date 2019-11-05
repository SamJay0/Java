/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package inventory.datastructures;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author samjay
 */
//This class is responsible for recording products purchased and removed from the shopping cart.
public class SaleTransaction {

    int saleCode; //randomly generated btn 1000 and 9999
    Product[] items = new Product[3]; //maximum size 3 (Bought items)
    double totalCost = 0;
    private Scanner in = new Scanner(System.in);
    Product removedProduct;

    //constructor
    public SaleTransaction() {
        this.totalCost = 0.0;
        for (int i = 0; i < items.length; i++) {
            items[i] = null;
        }
    }

    //generateSaleCode
    public int setSaleCode() {
        Random rand = new Random();
        return 1000 + Math.abs((rand.nextInt() % 9000));
    }

    //get totalCost
    public double getTotalCost() {
        return this.totalCost;
    }

    //update totalCost
    public void updateTotalCost(double total) {
        this.totalCost = total;
    }

    //add product to cart
    public void addProductsToCart(Product itemToAdd) {
        itemToAdd.setQuantityOrdered();
        int quantityOrdered = itemToAdd.getQuantityOrdered();
        

        if (quantityOrdered < itemToAdd.getMinOrderQuantity()) {
            JOptionPane.showMessageDialog(null, itemToAdd.getMinOrderQuantity() + " is the minOrder Quantity");
            return;
        }
        if (quantityOrdered > itemToAdd.getQuantityAtHand()) {
            JOptionPane.showMessageDialog(null, "only " + itemToAdd.getQuantityAtHand() + " items availabe ");
            return;
        }
        int count = 0;
        while (items[count] != null && count < items.length) {
            count++;
        }
        items[count] = itemToAdd;
        JOptionPane.showMessageDialog(null, itemToAdd.getName() + " added to cart");

        //update totalCost
        totalCost += (itemToAdd.getQuantityOrdered() * itemToAdd.getPrice());
        //update quantity in products
        itemToAdd.updateQuantity(itemToAdd.getQuantityAtHand() - quantityOrdered);
    }

    //remove item from cart
    public void removeProductFromCart() {
        if (noProducts()) {
            JOptionPane.showMessageDialog(null, "No Products in the cart Yet");
            System.out.println();
            return;
        }
        System.out.print("Enter productName: ");
        String productName = in.nextLine();

        try {
            int count = 0;
            while (!items[count].getName().equalsIgnoreCase(productName) && items[count] != null) {
                count++;
            }
            this.removedProduct = items[count];

            //update totalCost
            totalCost -= items[count].getQuantityOrdered() * items[count].getPrice();

            items[count] = null;
            JOptionPane.showMessageDialog(null, productName + " removed from Cart");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, productName + " ?? No such item in Cart");
        }

    }

    //get product removed
    public Product getProductRemoved() {
        return this.removedProduct;
    }

    //no products existing
    public boolean noProducts() {
        return items[0] == null && items[1] == null && items[2] == null;
    }

    public void ViewProducsInCart() {
        System.out.println("\n\t\t------------------\n"
                + "\t\tITEMS IN CART\n"
                + "\t\t__________________");
        if (noProducts()) {
            JOptionPane.showMessageDialog(null, "No item to checkOut.Choose 2 to Add Products to cart");
            System.out.println("\n\t-----No item added to cart yet------\n");

            return;
        }
        for (int i = 0; i < items.length; i++) {
            String s = "";
            String productDetails;
            String str = "\n-----------\n"
                    + " Product  " + (i + 1) + "\n"
                    + "___________\n";
            if (items[i] == null) {
                productDetails = "";
            } else {
                productDetails = str + displayItem(items[i]);
            }

            System.out.println(productDetails);
        }
    }

    public static String displayItem(Product p) {
        DecimalFormat format = new DecimalFormat("#0.00");
        return "\tProductName: " + p.getName() + " \n\tDescription: " + p.getDesc() + " \n\tPricePerItem Ksh " + format.format(p.getPrice())
                + "\n\tQuantityOrdered: " + p.getQuantityOrdered() + " items \n\t\tTotal : Ksh " + p.getQuantityOrdered() * p.getPrice() + "\n";
    }

    //generate receipt
    public String generateReceipt() {
        String productDetails = "";
        for (Product item : items) {
            if (item == null) {
                productDetails += "";
            } else {
                productDetails +="\t"+ item.getName() + "\t" + "\t@Ksh" + item.getPrice() + "\tKsh" + item.getQuantityOrdered() * item.getPrice() + "\n";
            }
        }
       
        return productDetails;
    }
   
}
