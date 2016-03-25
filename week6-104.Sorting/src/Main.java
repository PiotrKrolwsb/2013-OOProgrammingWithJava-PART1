import java.util.Arrays;

public class Main 
{
    public static void main(String[] args) 
    {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array)
    {
       //kopiowanie tablicy // array clone
       int[] temp = new int [array.length];
       for (int k = 0; k < array.length; k++)
       {
           temp[k] = array[k];
       }
       //sortowanie bąbelkowe // bubble sort
       for (int i = 0; i < array.length; i++)
       {
           for (int j = 0; j< array.length - 1; j++)
           {
               if (temp[j] > temp[j + 1])
               {
                   int tmp;
                   tmp = temp[j + 1];
                   temp[j + 1] = temp[j];
                   temp[j] = tmp;
               }
           }
       }
       return temp[0];
    }
    public static int indexOfTheSmallest(int[] array)
    {
        int currentValue = array[0];
        int smallestIndex = 0;
        for ( int i = 0; i < array.length; i++)
        {
            if (array[i] < currentValue)
            {
                currentValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        int currentValue = array[index];
        int smallestIndex = index;
        for ( int i = index; i < array.length; i++)
        {
            if (array[i] < currentValue)
            {
                currentValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static void swap(int[] array, int index1, int index2)
    {
       int tmp;
       tmp = array[index2];
       array[index2] = array[index1];
       array[index1] = tmp;
    }
    //sortowanie przez wybieranie // selection sort
    public static void sort(int[] array)
    {
        for (int i=0; i<array.length-1; i++) 
        {
            System.out.println(Arrays.toString(array));
            int minIndex = i;      // Index of smallest remaining value.
            for (int j=i+1; j<array.length; j++) 
            {
                if (array[minIndex] > array[j]) 
                {
                    minIndex = j;  // Remember index of new minimum
                }
            }
            if (minIndex != i) 
            { 
                //...  Exchange current element with smallest remaining.
                swap(array, minIndex, i);
            }
        }
    }
}
