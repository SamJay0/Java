
package BinarySearchTree;

/**
 * @author samjay
 */
public class Node {
       private int value;
       private  Node left;
       private  Node right;
       
       //constructor
       public Node(int value){
           this.value=value;
           this.left=null;
           this.right=null;
           
       }
       
       //getters
       public int getValue(){
           return value;
       }
       public Node getLeft(){
           return left;
       }
       public Node getRight(){
           return right;
       }
      
       //setters
       public void setValue(int value){
           this.value=value;
       }
       public void setLeft(Node left){
           this.left=left;
       }
       public  void setRight(Node right){
           this.right=right;
       }
       

}
