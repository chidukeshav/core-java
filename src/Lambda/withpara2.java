package Lambda;

interface Rectangle {
    void area(int l,int b);
}

public class withpara2 {
    public static void main(String[] args) {
        Rectangle r = (int l,int b) ->System.out.println(l * b);
        r.area(1,1);
    }
}