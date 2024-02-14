//Bubble sorting ::::  Arranging an array elements in ascending order by swapping of adjacent elements
//    Time Complexity : Worst Case = O(n^2)         ->   Array is arranged in reversed order
//                      Average Case = 0(n^2)       ->   Array arrangement is between sorted and reversed
//                      Best Case  = 0(n)           ->   Array is already sorted



import java.util.Scanner;
public class BubbleSort
{
    public int[] bubbleSorting(int[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)                       // e.g., i=0 means arranging elements sch that minimum
            {                                                // element comes at first position
                if(arr[j]>arr[j+1])                          // i=1 :  2st minimum elements at 2nd position
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public void print(int[] arr)
    {
        for(int value : arr)
        {
            System.out.print(value + " ");
        }
    }
    public static void main(String... args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array : ");
        int N = S.nextInt();
        int[] Arr = new int[N];
        System.out.println("Elements of the array : ");
        int i = 0;
        while( i < N )
        {
            System.out.print("Arr["+i+"]: ");
            Arr[i] = S.nextInt();
            i++;
        }

        BubbleSort  B = new BubbleSort();
        int[] Sorted = B.bubbleSorting(Arr);
        B.print(Sorted);
    }
}
