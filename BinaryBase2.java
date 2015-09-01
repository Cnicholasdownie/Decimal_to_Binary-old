
1        import javax.swing.JOptionPane; 
2        public class BinaryBase2 extends JOptionPane { 
3            public static void main (String[]args ) { 
4                String number = JOptionPane.showInputDialog("Enter the number you wish to convert"); 
5     
6                int newnumber = Integer.parseInt(number); 
7     
8                BinaryMethod showing = new BinaryMethod(); 
9     
10               showing.Bmethod(newnumber); 
11           } 
12       } 
13   
