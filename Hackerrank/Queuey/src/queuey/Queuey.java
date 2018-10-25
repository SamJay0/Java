package queuey;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author SamJay
 * @param <D>
 */
public class Queuey<D> {
    //create queue using linkedlist

    LinkedList<D> queue;

    public Queuey() {
        this.queue = new LinkedList();
    }

    //enqueue
    public void enqueue(D x) {
        queue.addLast(x);
    }

    //dequeue
    public D dequeue() {
        return  queue.remove();
    }

    //peek
    public D peek() {
        return  queue.get(0);
    }

    //size
    public int Size() {
        return queue.size();
    }

    //print
    public void printQueue() {
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
//           int x=queue.size();
//          while(x-->0){
//              System.out.print(queue.get(x)+" > ");
//             
//          }
    }
   
    //check if palindrome
    public static void isPalindrome(){
        //enque
        //push
        //dequeue and pop while checkinfg if they are equal
        //throe exception if not palindrome
    }
    public static void main(String[] args) {
        Queuey numberQueue = new Queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(9);
        numberQueue.printQueue();
        System.out.println("\n"+numberQueue.dequeue());
        System.out.println(numberQueue.peek());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.dequeue());
        //stack
        Stack<String> stacky = new Stack<>();
        stacky.push("hello");
        stacky.push("there");
       
        try{
        System.out.println(stacky.get(0));
        }catch(IndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
        //check out the Lifo concept in action
        System.out.print(stacky.pop()+" ");
        System.out.print(stacky.pop()+"!");
    }

}
