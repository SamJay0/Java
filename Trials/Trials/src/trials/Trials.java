package trials;


/**
 * @author SamJay
 */
public class Trials {

    static int swapCounts = 0;

        public static void BubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];//iterating through
                    arr[j + 1] = temp;
                    swapCounts++;

                } 
            }
            
            if (!isSwapped) {
                return;
            }
            
        }
        
        
    }

//   
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        BubbleSort(arr);
        System.out.println("Array is sorted in "+swapCounts+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
        
    }

}
