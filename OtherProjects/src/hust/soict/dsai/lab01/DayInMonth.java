package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.util.Arrays;

public class DayInMonth {
    public static void main(String[] args) {
    	// khai báo mảng allMonth để kiểm tra đầu vào của month có là 3 kí tự đầu, fullname hay số
        String[] allMonth = {"january", "february", "march", "april", "may", "june", "july",
                "august", "september", "october", "november", "december", "jan", "feb", "mar", "apr", "may", "jun", "jul",
                "aug", "sep", "oct", "nov", "dec", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

        String[] month30 = {"april", "june", "september", "november", "apr", "jun", "sep", "nov", "4", "6", "9", "11"};

        String[] month31 = {"january", "march", "may", "july", "august", "october", "december", "jan", "mar", "may", "jul",
                "aug", "oct", "dec", "1", "3", "5", "7", "8", "10", "12"};
        String[] month2 = {"february", "feb", "2"};

        Scanner keyboard = new Scanner(System.in);

        boolean isValidMonth = false;
        String month = "";

        while (!isValidMonth) { // kiểm tra xem month có nhấp dúng theo yêu cầu đề bài
            System.out.print("Enter month: ");
            month = keyboard.nextLine().toLowerCase(); // chuyen sang chu thuong
            isValidMonth = Arrays.asList(allMonth).contains(month);
            if (!isValidMonth) {
                System.out.println("Invalid month. Please enter again.");
            }
        }

        int year = 0;
        // nhập năm
        System.out.print("Enter a year: ");
        while (true) {
            if (keyboard.hasNextInt()) { // kiểm tra có phải kiểu int không
                year = keyboard.nextInt();
                break;
            } else {
                System.out.print("Invalid input. Please enter a valid year: ");
                keyboard.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
         
        if (Arrays.asList(month31).contains(month)) { //kiểm tra xem có là tháng 31 ngày không
            System.out.println("Month " + month + " year " + year + " has 31 days.");
        } else if (Arrays.asList(month30).contains(month)) {//kiểm tra xem có là tháng 30 ngày không
            System.out.println("Month " + month + " year " + year + " has 30 days.");
        } else if (Arrays.asList(month2).contains(month)) {
            // Kiểm tra năm nhuần 
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Month " + month + " year " + year + " has 29 days (leap year).");
            } else {
                System.out.println("Month " + month + " year " + year + " has 28 days.");
            }
        } else {
            System.out.println("Invalid month input.");
        }

        keyboard.close();
    }
}
