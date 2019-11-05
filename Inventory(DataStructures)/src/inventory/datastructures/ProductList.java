/*                  ___________________
                       @JayDevelopers'
                    ----------------------------------  */
package inventory.datastructures;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author samjay
 */
//This class is responsible for adding products to the array, removing products from the array, etc
public class ProductList {

    Product[] listOfProducts = new Product[5];// maximum size 5
    private Scanner in = new Scanner(System.in);

    public ProductList() {
        for (int i = 0; i < this.listOfProducts.length; i++) {
            this.listOfProducts[i] = null;
        }
    }

    public void addProductToList(Product product) {
        int count = 0;
        while (listOfProducts[count] != null && count < this.listOfProducts.length) {
            count++;
        }
        if (!(count < this.listOfProducts.length)) {
            JOptionPane.showMessageDialog(null, "Only a maximum of 5 Products can be registered");
        }
        listOfProducts[count] = product;
        JOptionPane.showMessageDialog(null, product.getName() + " added to products");

    }

    public String toString() {
        String s = "";
        String productDetails;
        for (int i = 0; i < listOfProducts.length; i++) {

            s = s + listOfProducts[i].toString();
        }
        return s;
    }
    //noProducts

    public boolean noProducts() {
        return listOfProducts[0] == null && listOfProducts[1] == null && listOfProducts[2] == null && listOfProducts[3] == null && listOfProducts[4] == null;
    }

    public void displayProducts() {
        System.out.println("\n\t------------------------------------------------------"
                + "\n\t\t\tPRODUCTS AVAILABLE"
                + "\n\t------------------------------------------------------");
        if (noProducts()) {
            JOptionPane.showMessageDialog(null, "No Products Yet.Enter 1 to register");
            System.out.println("\n\t\t\t-----No items yet------\n");

            return;
        }
        for (int i = 0; i < listOfProducts.length; i++) {
            String s = "";
            String productDetails;
            String str = "\n-----------\n"
                    + " Product  " + (i + 1) + "\n"
                    + "___________\n";
            if (listOfProducts[i] == null) {
                productDetails = "";
            } else {
                productDetails = str + listOfProducts[i].toString();
            }

            System.out.println(productDetails);
        }
    }

    //search for product
    public Product getProduct(Product[] products, String nameOfProduct) {
        String name;
        if (nameOfProduct != null) {
            name = nameOfProduct;
        } else {
            System.out.print("enter productName:");
            name = in.nextLine();
        }

        try {
            int count = 0;
            while (!(products[count].getName().equalsIgnoreCase(name))) {
                count++;
            }
            return products[count];

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, name + " does not exist");
            return null;
        }
    }

}
