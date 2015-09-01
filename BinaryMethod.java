
1     
2        import javax.swing.*; 
3     
4        /** 
5         * Created by ToxicPC on 6/10/2015. 
6         */ 
7        public class BinaryMethod { 
8            public void Bmethod(int newnumber){ 
9                int remiander; 
10               for (int counter = 1; counter <= 10000; counter++) { 
11    
12                   while (newnumber != 0) { 
13                       remiander = newnumber % 2; 
14                       newnumber = newnumber / 2; 
15                       JOptionPane.showMessageDialog(null,remiander, "Write Down The Number", JOptionPane.INFORMATION_MESSAGE); 
16    
17                   } 
18               }            JOptionPane.showMessageDialog(null,"", " Now Read From Right To Left ", JOptionPane.PLAIN_MESSAGE); 
19    
20    
21    
22    
23           } 
24    
25       } 
