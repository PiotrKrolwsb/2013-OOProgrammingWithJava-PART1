import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        Grade grade = new Grade(reader);
        grade.getScores();
        grade.countGrades();
        grade.printGrades();
    }
}


        