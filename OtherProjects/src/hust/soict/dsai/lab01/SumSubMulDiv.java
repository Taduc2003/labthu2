package hust.soict.dsai.lab01;
// Example5: SumSubMulDiv.java
import javax.swing.JOptionPane;
public class SumSubMulDiv{
   public static void main(String[] args){
	String strNum1, strNum2;

	strNum1 = JOptionPane.showInputDialog(null,
			"Please input the first number:","Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
	double num1 = Double.parseDouble(strNum1);

	strNum2 = JOptionPane.showInputDialog(null,
			"Please input the second number:","Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
	double num2 = Double.parseDouble(strNum2);
     
	System.out.println("Sum: " +(num1+num2));
	System.out.println("Sub: " +(num1-num2));	
	System.out.println("Mul: " +(num1*num2));
	if(num2 != 0) System.out.println("Div: " +(num1/num2));
		else System.out.println("Div: Not define!");
        
	System.exit(0);
   }
}