
package BinarySearchTree;

/**
 * @author samjay
 */
public class BST {
    
    Node root;
    //constructor
     public BST(){
         this.root=null;
     }
     
     //insert
     public void insert(int value){
         if(this.root==null){
             this.root=new Node(value);
         }
         
         Node parent=null;
         Node current=this.root;
         while (current !=null) {             
             parent=current;
             if (current.getValue()<value) {
                 
             }
         }
     }
     

}
