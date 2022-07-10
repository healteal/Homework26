package Task3;

public class General {
    public static void main(String[] args) {
        Triangle example1 = new Triangle(3,3,3);
        Triangle example2 = new Triangle(3,3,-1);
        System.out.println(example1.getFirstSide());
        System.out.println(example2.getFirstSide());
    }
}
