
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
     Score(String name , int score)
     {
         setBounds(300 , 100 , 700 ,500 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0 , 150 , 300 , 250);
        add(image);
        
//        170 , 420 , 700 , 30
        JLabel heading = new JLabel("THANK YOU "+name+" for playing THE QUIZ !");
        heading.setBounds(45 ,35 , 900 ,35 );
        heading.setFont(new Font("tahoma", Font.BOLD , 25));
        heading.setForeground(new Color(30, 144 , 254));
        add(heading);
        
        JLabel pscore = new JLabel("YOUR SCORE : "+score);
        pscore.setBounds(350 ,200 , 300 ,35 );
        pscore.setFont(new Font("tahoma", Font.BOLD , 25));
//        pscore.setForeground(new Color(30, 144 , 254));
//  BACK.setForeground(Color.WHITE);
         pscore.setForeground( Color.RED);
        add(pscore);
        
         JButton button = new JButton("Play Again");
        button.setBounds(350 , 250 , 200 , 40);
        button.setFont(new Font("TAHOMA " , Font.PLAIN , 22));
        button.setBackground(new Color(30, 144 , 254));
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);
        
        setVisible(true);
     }
     
     public void actionPerformed(ActionEvent e)
     {
         setVisible(false);
//         clearSelection(); 
//         muje score ke baad clear chahiye 
         new Login();
     }
    public static void main(String[] args)
    {
        new Score("USER " , 0);
    }
    
}
