package Lambda;

interface Triangle {
    void area(int b,int h);
}

public class withpara1 {
    public static void main(String[] args) {
        Triangle t = (int b,int h) -> System.out.println(0.5 * b * h);
        t.area(1,1);
    }
}