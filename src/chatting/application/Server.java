package chatting.application;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Server extends JFrame implements ActionListener{
//    Constructor
        Server() {
            
//            layout setup
            setLayout(null);
            
            JPanel p1 = new JPanel();
            p1.setBackground(new Color (7,94,84));
            p1.setBounds(0,0,450,70);
            p1.setLayout(null);
            add(p1);
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
            Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel back = new JLabel(i3);
            back.setBounds(5,20,25,25); 
            p1.add(back);
            
            ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
            Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            JLabel profile1 = new JLabel(i6);
            profile1.setBounds(40, 10, 50, 50);
            p1.add(profile1);
            
            ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video"));
            Image i8 = i7.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            JLabel profile2 = new JLabel(i9);
            p1.add(profile2);
            
            back.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent ae) {
                    System.exit(0);
                }
            });
            
//           frame setup
            setSize(450,700);  // set the size of frame
            setLocation(200, 50);
            getContentPane().setBackground(Color.WHITE);            

            setVisible(true);
        }
        
        public void actionPerformed(ActionEvent ae) {
            
        }
    
        public static void main(String[] args) {
            new Server();  // anonymous object
        }
    
}
