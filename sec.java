import javax.swing.*;
class sec
{
	static void count(String n){
		String email = n + "@accenture.com";
        int length = email.length();
		JOptionPane.showMessageDialog(null,"Email is: " + email + "and characters : " + length);
    }
	public static void main(String args[]){
		String name=JOptionPane.showInputDialog("enter your name","name");
		count(name);
	}
}