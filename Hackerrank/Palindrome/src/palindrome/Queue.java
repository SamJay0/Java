package palindrome;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author SamJay
 */
public class Queue {
   
    LinkedList<Character> queue;
    public Queue(){
        this.queue=new LinkedList();
    }
    
      //enqueue    
    public void enqueue(char c){
       queue.addLast(c);
    }
   
    //dequeue
    public char dequeue(){
        return queue.remove();
    }
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack stack=new Stack();
        Queue queue=new Queue();
        // fill Stack
//        try{
//        System.out.println("*******Lets make your stack*********");
//        for (int i=0;i<7;i++){
//            System.out.println("Enter a character: ");
//            stack.push(in.next().charAt(i));
//        }
//        //enqueue
//        System.out.println("***********Lets make your queue************");
//        for(int i=0;i<7;i++){
//            System.out.println("Enter a character: ");
//            queue.enqueue(in.next().charAt(i));
//        }
//        }catch(StringIndexOutOfBoundsException e){
//            System.out.println("Dude!!");
//        }
        
        //fill stsck
        stack.push('r');
        stack.push('a');
        stack.push('c');
        stack.push('e');
        stack.push('c');
        stack.push('a');
        stack.push('r');
        //fill queue
        queue.enqueue('r');
        queue.enqueue('a');
        queue.enqueue('c');
        queue.enqueue('e');
        queue.enqueue('c');
        queue.enqueue('a');
        queue.enqueue('r');
        
        char a = (char) stack.pop();
        char b = queue.dequeue();
        try{
        while(a==b){
             a = (char) stack.pop();
             b = queue.dequeue();
        }
//        System.out.println("its a palindrome");
        }catch(EmptyStackException e){  
        }
        if(a!=b){
            System.out.println("Not a palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }

}
