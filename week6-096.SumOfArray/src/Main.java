
public class Main {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sum(array));
    }

    public static int sum(int[] array) 
    {
        int suma = 0;
        for(int i : array)
        {
            suma += i;
        }
        return suma;
    }
}
