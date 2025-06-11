import javax.swing.*;
class third
{
	static void ib(int n,boolean t){
		int f;
			if (t) {
				f = n + 100;
			} 
			else {
				f= n - 12;
			}
        JOptionPane.showMessageDialog(null, "final output: " + f);
    }
	public static void main(String args[]){
		String no=JOptionPane.showInputDialog("enter number","type here");
		int num=Integer.parseInt(no);
		String bi=JOptionPane.showInputDialog("enter true/false","type here");
		boolean bo=Boolean.parseBoolean(bi);
		ib(num,bo);
	}
}