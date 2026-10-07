package Lambda;

interface Parallelogram {
    double area(int base,int height);
}

public class withpararet2 {
    public static void main(String[] args) {
        Parallelogram p = (int base,int height) -> {
            return (base * height);
        };
        System.out.println(p.area(4,4));;
    }
}