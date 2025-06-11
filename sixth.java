import javax.swing.*;
class sixth {

    static void printMessage(char choice) {
        switch (choice) {
            case 'W':
                JOptionPane.showMessageDialog(null, "Who are U");
                break;
            case 'U':
                JOptionPane.showMessageDialog(null, "U are awesome");
                break;
            case 'M':
                JOptionPane.showMessageDialog(null, "I am Mohunbagan");
                break;
            case 'E':
                JOptionPane.showMessageDialog(null, "I am not Eastbengal");
                break;
            case 'I':
                JOptionPane.showMessageDialog(null, "India is Great");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option");
        }
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a character (W, U, M, E, I):");
          char ch = input.charAt(0);
          printMessage(ch);
        }
		
    }

