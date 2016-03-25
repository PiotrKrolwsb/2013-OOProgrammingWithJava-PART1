import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author PiotrKrol
 */
public class Grade 
{
    private Scanner reader;
    private ArrayList<Integer> gradeArray;
    private int[] grades;

   public Grade(Scanner scanner) 
   {
        gradeArray = new ArrayList<Integer>();
        this.reader = scanner;
        this.grades = new int[6];
        for (int i = 0; i < this.grades.length; i++) 
        {
            this.grades[i] = 0;
        }
    }
    
    public void getScores() 
    {
        System.out.println("Type exam scores, -1 completes:");
        while (true) 
        {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) 
            {
                break;
            }
            if (score >= 0 && score <= 60) 
            {
                gradeArray.add(score);
            }
        }
    }
    public void printGradeArray()
    {
        for (int g : gradeArray)
            System.out.println(g);
    }
    public int giveGrade(int score) 
    {
        if (score < 30) {return 0;}
        if (score < 35) {return 1;}
        if (score < 40) {return 2;}
        if (score < 45) {return 3;}
        if (score < 50) {return 4;}
        return 5;
    }
    public void countGrades() 
    {
        for (int score : this.gradeArray) 
        {
            int grade = giveGrade(score);
            for (int i = 0; i < grades.length ; i++) 
            {
                if (grade == i) 
                {
                    this.grades[i]++;
                }
            }
        }
    }
    public boolean isAccepted(int grade) 
    {
        return !(grade == 0);
    }
    public double getAcceptancePercentage() 
    {
        double numberOfScores = 0;
        for (int i = 0; i < this.grades.length; i++) 
        {
            numberOfScores += this.grades[i];
        }
        if (numberOfScores == 0) 
        {
            return 0.0;
        }
        return (numberOfScores - this.grades[0])*100 / numberOfScores;
    }
    public void printGrades() 
    {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) 
        {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Acceptance percentage: " + getAcceptancePercentage());
    }
}
