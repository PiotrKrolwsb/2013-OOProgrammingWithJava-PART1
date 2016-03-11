
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
          int suma=number1+number2+number3+number4;
         return suma;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int suma=sum(number1, number2, number3, number4);
        double srednia=(double) suma/4;
        return srednia;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
