import java.util.Scanner;
public class SelectionSorting
{
    public static void SelectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++)
        {
            int min = i;                                    //Index of minimum element taken
            for(int j=i+1 ; j<n  ; j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int value : arr)
        {
            System.out.print(value+" ");
        }
    }
    public static void main(String... args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int N = S.nextInt();
        int[] Arr = new int[N];
        System.out.println("Enter elements: ");
        for(int i=0;i<N;i++)
        {
            Arr[i] = S.nextInt();
        }

        SelectionSort(Arr);
    }
}
