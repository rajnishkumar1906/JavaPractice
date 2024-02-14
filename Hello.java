public class Hello
{
    void hello()
    {
        System.out.println("Machine Learning");
    }
    int add(int x, int y, int z)
    {
        int sum = x + y + z;
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("This is main function.");

        Hello h = new Hello();
        h.hello();
        System.out.println("The sum of the numbers : " + h.add(12,13,14));
    }
}
