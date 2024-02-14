//Instanceof class
public class Wrapper_class
{
    public static  void main(String[] args)
    {
        String name1 = "Ganga";
        String name2 = "Amazon";
        boolean s1 = name1 instanceof String;
//        boolean s2 = name2 instanceof name1;
        boolean s3 = name1 instanceof Object;
        boolean s4 = args instanceof Object;
        boolean s5 = args instanceof String[];
        System.out.println(s1);
//        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
