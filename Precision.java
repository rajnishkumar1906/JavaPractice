//BigDecimal : It's a class that provides operations for double data types i.e., arithmetic operations , comparision rounding

import  java.math.BigDecimal;
import java.math.MathContext;
public class Precision {
    public static void main(String[] args)
    {
        //Rounding
        double d = 34.4214215484;
        MathContext m = new MathContext(5);
        BigDecimal b = new BigDecimal(d,m);
        System.out.println(b);
        BigDecimal q = new BigDecimal("1234.89564");
        System.out.println(q);

        //Addition and subtraction
        double x = 12.34;
        double y = 23.3894;
        double z1 = x + y;
        double z2 = x - y;
        System.out.println(z1);
        System.out.println(z2);     // Value in decimal having large number
        //That's why BigDecimal has been used

        int p = 12;
        BigDecimal _x = new BigDecimal(p);
        BigDecimal _y = new BigDecimal(y);
        MathContext _m = new MathContext(4);
        BigDecimal _z1 = _x.add(_y,_m);          //_m digited output
        BigDecimal _z2 = _x.subtract(_y,_m);
        BigDecimal _z3 = _x.multiply(_y,_m);
        BigDecimal _z4 = _x.divide(_y,_m);
        System.out.println(_z1);
        System.out.println(_z2);
        System.out.println(_z3);
        System.out.println(_z4);


    }
}
