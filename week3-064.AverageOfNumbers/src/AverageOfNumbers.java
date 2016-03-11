
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) 
    {
        int suma=0;
        for(int liczba : list)
            suma+=liczba;
       
        return suma;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double srednia = (double)sum(list)/list.size();
        return srednia;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}