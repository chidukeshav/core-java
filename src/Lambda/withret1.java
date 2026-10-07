package Lambda;

interface Square {
    int area();
}

public class withret1 {
    public static void main(String[] args) {
        Square s = () -> {
            int side = 5;
            return (side * side);
        };
        System.out.println(s.area());;
    }
}