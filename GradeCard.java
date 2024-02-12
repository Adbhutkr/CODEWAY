/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade.card;

import java.util.* ;

public class GradeCard 
{
    static Scanner x = new Scanner(System.in) ;
    
    public int input(int subno)
    {
        int marks[] = new int[subno];
        int total = 0;
        for(int i = 0 ; i< subno ; i++)
        {
             System.out.println("Enter Subject "+(i+1)+" marks");
             marks[i] = x.nextInt();
            
        }
        
        for(int i = 0 ;i<subno ; i++)
        {
            total+=marks[i] ; 
        }
        return total;
        
       
    }
    public double avgpercent(int totalmarks , int Subno)
    {
        return totalmarks/Subno ;
    }
    
    public String grade(double percent)
    {
        if(percent>=90)
            return "A";
        else if(percent>=80)
            return "B";
        else if(percent>=70)
            return "C";
        else if(percent>=60)
            return "D";
        else 
            return "F";
        
    }

    
    public static void main(String[] args) 
    {
//        int Subjectno ;
       
       System.out.println("No. of students for which grade card is to be calculated");
       long student = x.nextLong();
       System.out.println("Enter no. of subjects a student is having");
       int Subjectno = x.nextInt();
       
       for(long i = 1 ; i<=student ; i++)
       {
           GradeCard obj = new GradeCard();
           
           int totalM = obj.input(Subjectno);
           double avg = obj.avgpercent(totalM , Subjectno);
           String grad = obj.grade(avg);
           System.out.println("Student " + i + ": Total Marks = " +totalM + ", Average Percentage = " +avg + ", Grade = " +grad);
           System.out.println();
       }
    }
    
}
