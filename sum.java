import javax.swing.*;
class sum{
	static void sum(double a,double b){
		double c=a+b;
		if(c>=100 && c<=500)
			JOptionPane.showMessageDialog(null,"ok the sum is bw 100 and 500");
		else
			JOptionPane.showMessageDialog(null,"sum is not in bw 100 and 500 so try again");
	}
	public static void main(String args[]){
		String inp1=JOptionPane.showInputDialog("enter first number","type here");
		String inp2=JOptionPane.showInputDialog("enter second number","type here");
		double x = Double.parseDouble(inp1);
        double y = Double.parseDouble(inp2);
		sum(x,y);
	}
}