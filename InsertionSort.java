//Insertion Sorting :::: picking up an element and comparing it with its predecessors if it's less than them, swap till true
//    Time Complexity : Worst Case = O(n^2)         ->   Array is arranged in reversed order
//                      Average Case = 0(n^2)       ->   Array arrangement is between sorted and reversed
//                      Best Case  = 0(n)           ->   Array is already sorted

import java.util.Scanner;
public class InsertionSort
{
    public int[] insertionSorting(int[] arr)
    {
        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            for(int j = i+1 ; j > 0 ;j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public void print(int[] arr)
    {
        System.out.print("[ ");
        for(int value : arr)
        {
            System.out.print(value + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the number of elements of an array: ");
        int N = S.nextInt();
        int[] Arr = new int[N];

        System.out.println("Enter elements to Arr : ");

        for(int i=0;i<N ;i++)
        {
            System.out.print("arr[" + i + "]: ");
            Arr[i] = S.nextInt();
        }


        InsertionSort I = new InsertionSort();
        int[] SortedArr = I.insertionSorting(Arr);

        I.print(SortedArr);
    }
}
