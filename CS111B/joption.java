import javax.swing.JOptionPane;






class joption {
  public static void main(String[] args) {
  String first, last, display;

  JOptionPane.showMessageDialog(null, "Welcome! ");
  first =  JOptionPane.showInputDialog("Enter your first name: ");
  last =  JOptionPane.showInputDialog("Enter your first name: ");
  
  JOptionPane.showMessageDialog(null,last + " " + first + " " );	
  	
  System.exit(0);
 }
}
