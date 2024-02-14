import java.util.Scanner;
public class MergeSorting
{
    public static void merge(int[] arr, int low, int high, int mid)
    {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Creating part arrays:
        int[] P = new int[n1];
        int[] Q = new int[n2];

        for(int i = 0; i < n1; i++)
        {
            P[i] = arr[low + i];
        }

        for (int j = 0; j < n2; j++)
        {
            Q[j] = arr[mid + 1 + j];
        }

        int p = 0;
        int q = 0;
        int r = low;

        while (p < n1 && q < n2) {
            if (P[p] <= Q[q]) {
                arr[r] = P[p];
                p++;
            } else {
                arr[r] = Q[q];
                q++;
            }
            r++;
        }
        while (p < n1) {
            arr[r] = P[p];
            r++;
            p++;
        }
        while (q < n2) {
            arr[r] = Q[q];
            r++;
            q++;
        }
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            mergesort(arr, low, mid); // First part of array
            mergesort(arr, mid + 1, high); // Second part of array

            merge(arr, low, high, mid);
        }
    }

    public static void print(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String... args) {
        Scanner S = new Scanner(System.in);
        int[] Arr;
        System.out.print("Enter the size of array: ");
        int N = S.nextInt();
        Arr = new int[N];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < N; i++) {
            Arr[i] = S.nextInt();
        }

        mergesort(Arr, 0, N - 1);
        print(Arr); // Printing the array
    }
}
