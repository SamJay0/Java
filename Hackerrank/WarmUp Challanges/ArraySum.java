import java.util.Scanner;
public class ArraySum{

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("enter size of array:");
		int n=in.nextInt();
		int arr[]=new int [n];
		System.out.println("enter "+n+" numbers");
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=in.nextInt();
		}
		int sum=0;
		for (int i=0;i<arr.length ;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum="+sum);
	}
}