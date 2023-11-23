package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;
public class SortSumArg{
	public static void main(String args[]) {
		Scanner keybroad = new Scanner(System.in);
		
		//Nhập kích thước của mảng
		System.out.print("Enter size of arrays: ");
		int size = keybroad.nextInt();
		
		//nhập các phẩn tử vào mảng
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = keybroad.nextInt();
		}
		//Tính tổng các phản tử của mảng
		int sum = 0;
		for(int i =0;i<size;i++) {
			sum += arr[i];
		}
		//tính trung bình
		double arg = (double) sum/size;
		//Sắp xếp 
		Arrays.sort(arr);
		System.out.println("Sorted Array"+Arrays.toString(arr));
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + arg);
		System.exit(0);
	}
}

