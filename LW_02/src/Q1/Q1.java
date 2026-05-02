package Q1;

public class Q1 {
    public static void main(String[] args) {

        double A=2, B=3, C=4;
        double X=5, Y=2, r=3;

        // a
        double a = Math.sqrt(B * B + 4 * A * C );

        //b
        double b = Math.sqrt(X + 4 * Math.pow(Y,3));

        // c
        double c = Math.cbrt(X*Y);

        //d
        double d = Math.PI * r * r ;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}