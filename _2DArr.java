//Allot the seat to the students to sit in the car

import java.util.Scanner;
public class _2DArr
{
    public static void main(String[] args)
    {
        String[][] cars;               //Declaring a 2D Array named cars


        System.out.print("No. of cars available : ");
        Scanner S = new Scanner(System.in);
        int NoOfCar = S.nextInt();                              //Takes the user integer input
        System.out.print("No. of seats in each car: ");
        int NoOfSeats = S.nextInt();                            //Takes the user integer input



        S.nextLine();
        // This has been used to consume the newline character left in the input buffer  after nextInt()

        cars = new String[NoOfCar][NoOfSeats];
        for(int i = 0 ; i < NoOfCar;i++)
        {
            for(int j = 0 ; j < NoOfSeats;j++)
            {
                String name = S.nextLine();
                cars[i][j] = name;
            }
        }
        System.out.println("::::::::::::Alloting seats to the students::::::::::::::");
        for(int i = 0 ; i < NoOfCar;i++)
        {
            for(int j = 0 ; j < NoOfSeats;j++)
            {
                System.out.print(cars[i][j]+ " ");
            }
            System.out.print("\n");
        }
    }
}