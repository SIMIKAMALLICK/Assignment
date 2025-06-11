import javax.swing.*;
class fourth{
	static void greatest(int a, int b, int c) {
        int max;
		if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        JOptionPane.showMessageDialog(null, "The greatest number is: " + max);
    }
    public static void main(String[] args){
		String f=JOptionPane.showInputDialog("Enter first number:");
		int n1=Integer.parseInt(f);
		String s=JOptionPane.showInputDialog("Enter second number:");
		int n2=Integer.parseInt(s);
		String t=JOptionPane.showInputDialog("Enter third number:");
		int n3=Integer.parseInt(t);
		greatest(n1,n1,n3);
	}
}