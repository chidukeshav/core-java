package Lambda;

interface Trapezoid {
    double area(int a,int b, int h );
}

public class withpararet1 {
    public static void main(String[] args) {
        Trapezoid t = (int a,int b, int h ) -> {
            return (0.5 * (a + b) * h);
        };
        System.out.println(t.area(1,1,1));;
    }
}