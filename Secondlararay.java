// Java program to find second largest
// element in an array
import java.util.*;
class Secondlararray{


    static void print2largest(int arr[],
                              int arr_size)
    {
        int i, first, second;


        if (arr_size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }


        Arrays.sort(arr);


        for (i = arr_size - 2; i >= 0; i--)
        {

            if (arr[i] != arr[arr_size - 1])
            {
                System.out.printf("The second largest " +
                        "element is %d\n", arr[i]);
                return;
            }
        }

        System.out.printf("There is no second " +
                "largest element\n");
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = {12, 23, 1, 10, 55, 1};
        int n = arr.length;
        print2largest(arr, n);
    }
}



