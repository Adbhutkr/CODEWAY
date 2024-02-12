
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    
    String name ; 
    JButton Start , BACK;
    Rules(String name)
    {
        this.name = name ; 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("WELCOME "+name+" TO THE QUIZ");
        heading.setBounds(20 ,20 , 900 ,45 );
        heading.setFont(new Font("VINER HAND ITC", Font.BOLD , 30));
        heading.setForeground(new Color(30, 144 , 254));
        add(heading);
        
        JLabel RL = new JLabel("WELCOME  "+name+"  TO THE QUIZ");
        RL.setBounds(30 ,80 , 700 ,350 );
        RL.setFont(new Font("TAHOMA", Font.BOLD , 14));
        RL.setText(
        "<html>"+
                "1.  Participation in the quiz is free and open to all persons."    + "<br><br>" +
                "2.  Participant has to be given 10 questions each of 10 points with 30 sec time limit." + "<br><br>" +
                "3.  Participant not knowing the answer can click the next button." + "<br><br>" +
                "4.  No negative markings will be done for wrong answers." + "<br><br>" +
                "5.  Score will be displayed at the end of the quiz." + "<br><br>" +
                "6.  Participant must not take any help from online." + "<br><br>" +
                "7.  Cheating is a choice , not a mistake." + "<br><br>" +
                "8.  Submit option will be enabled after 9th question." + "<br><br>" +
            "<html>"
        );
        add(RL);
        
        BACK = new JButton("Back");
        BACK.setBounds(250, 500 , 100 , 45);
        BACK.setBackground(new Color(30, 144 , 254));
        BACK.setForeground(Color.WHITE);
        BACK.addActionListener(this);
        add(BACK);
        
        Start = new JButton("START");
        Start.setBounds(400, 500 , 100 , 45);
        Start.setBackground(new Color(30, 144 , 254));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);
        
         
        
        setBounds(250,15,810 , 650);
//        setLocation(250,15);
//        setSize(800 , 650);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
           if(e.getSource() == Start)
           {
               setVisible(false);
               new Quiz(name , 0 , 0);
           }
           else 
           {
               setVisible(false);
               new Login();
           }
    }
    
    public static void main(String[] args)
    {
        new Rules("USER");
    }

   
   
}
