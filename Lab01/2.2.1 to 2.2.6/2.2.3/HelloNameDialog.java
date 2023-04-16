// Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog(null, "Please enter your name:", null, 0);
        JOptionPane.showMessageDialog(null, "Hi " + result + "!", result, 0);
        System.exit(0);
    }
}