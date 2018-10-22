package arraypractice;

/**
 * @author SamJay
 */
public class ArrayPractice {
       
    //using generics
    public static <E>void printArray(E[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" }\n");
        //enhance for loop
        for(E item: arr){
            System.out.print(item +", ");
        }

    }
    

    public static void main(String[] args) {
        String[] arr = {"sam", "Juma", "Jay", "Jade", "Hello", "Java", "Jac", "Jones"};
        printArray(arr);
    }

}
