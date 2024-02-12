
package quiz.application;

import java.awt.*; // color , fonts
import java.awt.event.*; //actionlistener
import javax.swing.*;//jframe
 
public class Quiz extends JFrame implements ActionListener{
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2]; // 1 for storing user ans 2 4 storing actual ans
    String userans[][] = new String [10][1] ; 
    JLabel qno,question;
    ButtonGroup bg;
    JButton submit , next;
    
    JRadioButton opt1 , opt2 , opt3 , opt4 ;
    public static int timer = 30;
     public static int ANS_GIVEN = 0;
     public int count = 0 , score = 0;
     String name ; 
    
    Quiz(String name , int count , int score)
    {
        this.count = count ;
        this.score = score;
        this.name = name ;  
        setBounds(0 , 0 , 1280 ,690 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0 , 0 , 1280 , 340);
        add(image);
        
//        170 , 420 , 700 , 30
         qno = new JLabel();
        qno.setBounds(100 ,363 , 50 ,45 );
        qno.setFont(new Font("DIALOG", Font.BOLD , 18));
        qno.setForeground(new Color(30, 144 , 254));
        add(qno);
        
         question = new JLabel();
        question.setBounds(150 , 370 , 730 , 30);
        question.setFont(new Font("DIALOG", Font.BOLD , 18));
        question.setForeground(new Color(30, 144 , 254));
        add(question);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

	
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
         opt1 = new JRadioButton();
        opt1.setBounds(170 , 420 , 700 , 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("DIALOG", Font.PLAIN , 15));
        add(opt1);
        
         opt2 = new JRadioButton();
        opt2.setBounds(170 , 460 , 700 , 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("DIALOG", Font.PLAIN , 15));
        add(opt2);
        
         opt3 = new JRadioButton();
        opt3.setBounds(170 , 500 , 700 , 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("DIALOG", Font.PLAIN , 15));
        add(opt3);
        
         opt4 = new JRadioButton();
        opt4.setBounds(170 , 540 , 700 , 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("DIALOG", Font.PLAIN , 15));
        add(opt4);
        
        bg = new ButtonGroup();
        bg.add(opt1);
        bg.add(opt2);
        bg.add(opt3);
        bg.add(opt4);
           
         next = new JButton("Next");
        next.setBounds(1000 , 550 , 200 , 40);
        next.setFont(new Font("TAHOMA " , Font.PLAIN , 22));
        next.setBackground(new Color(30, 144 , 254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
         submit = new JButton("Submit");
        submit.setBounds(1000 , 470 , 200 , 40);
        submit.setFont(new Font("TAHOMA " , Font.PLAIN , 22));
        submit.setBackground(new Color(30, 144 , 254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit)
        {
            ANS_GIVEN = 1;
            if(bg.getSelection()== null ) //usne ans diya or not  
                    {
                    userans[count][0] = "";
                    } else{
                    userans[count][0] = bg.getSelection().getActionCommand();
                    }
                for(int i = 0 ; i<userans.length ; i++)
                {
                    if( userans[i][0].equals(answers[i][1]))
                    {
                        score+= 10 ;
                    }
                }
                setVisible(false); 
                 new Score(name , score) ;
        }
        else{
//           under next button
            repaint();
            
            ANS_GIVEN = 1;
            if(bg.getSelection()== null ){  
                    userans[count][0] = "";
                }else{
                        userans[count][0] = bg.getSelection().getActionCommand();
                }
            
            if(count == 8)
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            
            if(count <=10) //if count=11 it wont work;)
            { start(count);}
            
        }
    }
      
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        String time = "Time Left : " +timer+ " seconds" ;
        g.setColor(Color.BLACK);
        g.setFont(new Font("tahoma" , Font.BOLD , 18  ));
        
        if(timer > 0 )
        {
            g.drawString(time , 1003 , 425);
        }
        else{
            g.drawString("TIMES UP! ", 1003 , 425);
        }
        timer-- ; 
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ANS_GIVEN !=0)  //ans has been given
        {
            ANS_GIVEN = 0;
            timer = 30 ; 
        }
        else if(timer<0)  //ans not given n time's up
        {
//            next ques pr aana h
            timer = 30;
            
            if(count == 8)  // initial count = 0 so this means i m at 9 ques
            {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9) //for 10th ques
            {
                if(bg.getSelection()== null ) //usne ans diya or not  
                    {
                    userans[count][0] = "";
                    } else{ //user 's given the ans
                    userans[count][0] = bg.getSelection().getActionCommand();
                    }
                for(int i = 0 ; i<userans.length ; i++)
                {
                    if( userans[i][0].equals(answers[i][1]))
                    {
                        score+= 10 ;
                    }
                }
                setVisible(false);
                new Score(name , score);
            }
            else
            {
                //                    next button 
                if(bg.getSelection()== null ) //usne ans diya or not  
                {
                    userans[count][0] = "";
                }
                else{

//                    user has selected some options
//                    to tract down users ans , i need to make an array
                        userans[count][0] = bg.getSelection().getActionCommand();
//                        .getSelection == chose the selected option
//getAction Command chose the value of particular option    
                    }
                count++;
                start(count);
            }
                
        }
        
    }
    
    public void start(int count)
    {
        qno.setText(" "+ (count+1) + ".");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        bg.clearSelection();
        
    }
   
   
    
     public static void main(String[] args)
    {
         new Quiz("USER" , 0 , 0);
    }
    
}
