
package myproject;

/**
 *
 * @author SamJay
 */
public class LinkedList {
   private class Node{
       private int value;
       private Node next;
       //constructor
       public Node(int value,Node next){
           this.value=value;
           this.next=next;
       }
       //getters
       public int getValue(){
           return value;
       }
       public Node getNext(){
           return next;
       }
       //setters
       public void setValue(int value){
           this.value=value;
       }
       public void setNext(Node next){
           this.next=next;
       }
     
   } 
     //Linked list class variables
       private Node head;
       //constructor
       LinkedList(){
           this.head=null;
       }
       public void insert(int value){
           //insertion at the start of the list
           this.head=new Node(value,this.head);
       }
       public void print(){
           Node n=head;
           while(n!=null){
               System.out.print(n.getValue()+">");
               n=n.getNext();
           }
           System.out.println("null");
       }
       public static void main(String[] args){
            LinkedList list=new LinkedList();
            list.insert(45);
            list.insert(23);
            list.insert(34);
            list.print();
       }
}
