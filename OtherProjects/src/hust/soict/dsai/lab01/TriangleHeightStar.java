package hust.soict.dsai.lab01;
import java.util.Scanner;
public class TriangleHeightStar {
	public static void main(String args[]) {
		Scanner keybroad = new Scanner(System.in);
		// nhập chiều cao của tam giác
		System.out.print("Please enter height of triangle: ");
		int n = keybroad.nextInt();
		for (int i = 1; i <= n; i++) {
			// in ra tam giác giác ngược bằng khoảng trắng
			for(int j = 1; j<= n-i; j++) {
				System.out.print(" ");
			}
			//in ra tam giác cân bằng kí tự *
			for(int j = 1; j<= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.exit(0);
	}
}
