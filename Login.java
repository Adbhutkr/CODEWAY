
package quiz.application;
   
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules , BACK;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0 , 0 , 600 , 500);
        add(image);
        
        JLabel heading = new JLabel("WELCOME TO THE QUIZ");
        heading.setBounds(750 ,60 , 300 ,45 );
        heading.setFont(new Font("VINER HAND ITC", Font.BOLD , 20));
        heading.setForeground(new Color(30, 144 , 254));
        add(heading);
        
        JLabel neme = new JLabel("ENTER YOUR NAME");
        neme.setBounds(795 ,150 , 250 ,45 );
        neme.setFont(new Font("Garamond", Font.BOLD , 15));
        neme.setForeground(new Color(30, 144 , 254));
        add(neme);
        
         tfname = new JTextField();
        tfname.setBounds(750 ,200 , 270 ,35 );
        tfname.setFont(new Font("ARCHIVO BLACK", Font.BOLD , 12));
//        tfname.setForeground(new Color(50 , 50 ,100));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(750, 270 , 120 , 35);
        rules.setBackground(new Color(30, 144 , 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
         BACK = new JButton("Back");
        BACK.setBounds(900, 270 , 120 , 35);
        BACK.setBackground(new Color(30, 144 , 254));
        BACK.setForeground(Color.WHITE);
        BACK.addActionListener(this);
        add(BACK);
        
        
        setSize(1200,500);
        setLocation(45 , 100);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Login();
    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rules)
        {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(e.getSource()== BACK)
        {
            setVisible(false);
        }
    }
    
}
   